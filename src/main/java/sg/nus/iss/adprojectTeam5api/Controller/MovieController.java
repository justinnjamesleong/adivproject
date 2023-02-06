package sg.nus.iss.adprojectTeam5api.Controller;

import org.springframework.web.bind.annotation.RestController;

import sg.nus.iss.adprojectTeam5api.Model.Movie;
import sg.nus.iss.adprojectTeam5api.Service.MovieService;
import sg.nus.iss.adprojectTeam5api.Service.TmdbApiService;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@RestController
public class MovieController {

    @Autowired
    private final TmdbApiService tmdbApiService;

    public MovieController(TmdbApiService tmdbApiService) {
        this.tmdbApiService = tmdbApiService;
    }

    @Autowired
    private MovieService movieService;

    @GetMapping("movie/get-all")
    public List<Movie> getAllMovies() {
        return movieService.findAllMovies();

    }

    @GetMapping("/movies")
    public List<Movie> listAllMovies(Model model) throws Exception {
        List<Movie> movies = Collections.emptyList();
        try {
            movies = tmdbApiService.getMovies();
        } catch (Exception e) {
            // Handle exception
        }

        model.addAttribute("movies", movies);
        return movies;
    }

}
