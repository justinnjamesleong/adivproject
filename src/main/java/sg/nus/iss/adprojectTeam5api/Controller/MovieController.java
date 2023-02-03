package sg.nus.iss.adprojectTeam5api.Controller;

import org.springframework.web.bind.annotation.RestController;

import sg.nus.iss.adprojectTeam5api.Model.Movie;
import sg.nus.iss.adprojectTeam5api.Service.MovieService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MovieController {
    
    @Autowired 
    private MovieService movieService;

    @GetMapping("movie/get-all")
    public List<Movie> getAllMovies(){
        return movieService.findAllMovies();
         
    }
    
    
}
