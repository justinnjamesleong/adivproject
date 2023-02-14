package sg.nus.iss.adprojectTeam5api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import sg.nus.iss.adprojectTeam5api.Model.*;
import sg.nus.iss.adprojectTeam5api.Repository.*;

@SpringBootApplication

public class AdprojectTeam5apiApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdprojectTeam5apiApplication.class, args);
    }

    @Bean
    CommandLineRunner loadData(MovieRepository movieRepository,
                               FavouriteRepository favouriteRepository,
                               ReviewRepository reviewRepository,
                               UserRepository userRepository,SocialRepository socialRepository) {
        return (args) -> {
            User admin = new User(1L, "admin", "1213@gmail.com", "password", true, RoleEnum.ADMIN);

            User lh = new User(2L,"jasmine", "66@gmail.com", "password", true, RoleEnum.USER);
            userRepository.saveAndFlush(admin);
            userRepository.saveAndFlush(lh);


            User u1 = new User(3L,"marry", "11@gmail.com", "password", true, RoleEnum.USER);
            userRepository.saveAndFlush(u1);

            User u2 = new User(4L,"tom", "22@gmail.com", "password", true, RoleEnum.USER);
            userRepository.saveAndFlush(u2);


            Social s1=new Social(1L,2L,3L);
            socialRepository.saveAndFlush(s1);

            Social s2=new Social(2L,2L,4L);
            socialRepository.saveAndFlush(s2);

            Social s3=new Social(3L,3L,4L);
            socialRepository.saveAndFlush(s3);





//            Favourite f1= favouriteRepository.save(1,)
//            Movie m1 = movieRepository.save(new Movie(1, "Life of Pi"));
//            Movie m2 = movieRepository.save(new Movie(2, "Titanic"));
//            Movie m3 = movieRepository.save(new Movie(3, "KKK"));
        };
    }
}
