package sg.nus.iss.adprojectTeam5api.Service;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import sg.nus.iss.adprojectTeam5api.Model.Movie;
import sg.nus.iss.adprojectTeam5api.Model.TmdbApiResponse;
import java.net.*;
import java.io.*;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class TmdbApiService {
    private final String API_KEY = "ac9520092f0240763841215ba5232cef";
    private final String BASE_URL = "https://api.themoviedb.org/3/movie/";
    private final OkHttpClient client = new OkHttpClient();
    private final Gson gson = new Gson();

    public List<Movie> getMovies() throws Exception {
        Request request = new Request.Builder()
                .url(BASE_URL + "popular?api_key=" + API_KEY)
                .get()
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new Exception("Failed to retrieve movies from TMDB API: " + response);
            }

            TmdbApiResponse tmdbApiResponse = gson.fromJson(response.body().string(), TmdbApiResponse.class);
            System.out.println("Success");
            return tmdbApiResponse.getResults();
        }
    }

    public String getMovieTrailer(String movieId) throws IOException {
        StringBuilder response = new StringBuilder();
        URL url = new URL("https://api.themoviedb.org/3/movie/" + movieId + "/videos?api_key=" + API_KEY + "&language=en-US");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
          response.append(line);
        }
        reader.close();
        return response.toString();
      }

}