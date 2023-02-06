package sg.nus.iss.adprojectTeam5api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import sg.nus.iss.adprojectTeam5api.Model.Favourite;
import sg.nus.iss.adprojectTeam5api.Model.Movie;
import sg.nus.iss.adprojectTeam5api.Model.RoleEnum;
import sg.nus.iss.adprojectTeam5api.Model.User;
import sg.nus.iss.adprojectTeam5api.Repository.FavouriteRepository;
import sg.nus.iss.adprojectTeam5api.Repository.MovieRepository;
import sg.nus.iss.adprojectTeam5api.Repository.ReviewRepository;
import sg.nus.iss.adprojectTeam5api.Repository.UserRepository;

@SpringBootApplication

public class AdprojectTeam5apiApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdprojectTeam5apiApplication.class, args);
    }

    @Bean
    CommandLineRunner loadData(MovieRepository movieRepository,
                               FavouriteRepository favouriteRepository,
                               ReviewRepository reviewRepository,
                               UserRepository userRepository) {
        return (args) -> {
            User admin = new User(1L, "admin", "1213@gmail.com", "password", true, RoleEnum.ADMIN);
            User lh = new User(2L,"jasmine", "66@gmail.com", "password", true, RoleEnum.USER);
            userRepository.saveAndFlush(admin);
            userRepository.saveAndFlush(lh);
//            Favourite f1= favouriteRepository.save(1,)
//            Movie m1 = movieRepository.save(new Movie(1, "Life of Pi"));
//            Movie m2 = movieRepository.save(new Movie(2, "Titanic"));
//            Movie m3 = movieRepository.save(new Movie(3, "KKK"));
        };
    }
}
