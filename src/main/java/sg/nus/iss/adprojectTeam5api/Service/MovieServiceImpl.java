package sg.nus.iss.adprojectTeam5api.Service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import sg.nus.iss.adprojectTeam5api.Model.Movie;
import sg.nus.iss.adprojectTeam5api.Repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService{
    @Resource
    MovieRepository movieRepository;

    @Override
    public List<Movie> findAllMovies() {
      return movieRepository.findAll();
    }

}
