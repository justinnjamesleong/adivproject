package sg.nus.iss.adprojectTeam5api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import sg.nus.iss.adprojectTeam5api.Model.Favourite;
import sg.nus.iss.adprojectTeam5api.Model.Movie;
import sg.nus.iss.adprojectTeam5api.Model.User;
import sg.nus.iss.adprojectTeam5api.Repository.FavouriteRepository;
import sg.nus.iss.adprojectTeam5api.Repository.MovieRepository;

@SpringBootApplication
public class AdprojectTeam5apiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdprojectTeam5apiApplication.class, args);
	}

	@Bean
	CommandLineRunner loadData(
		MovieRepository movieRepository,
		FavouriteRepository favouriteRepository
	){
		return (args) ->{
			// User u1= new User(1,"John","john",true,"ADMIN");
			// Favourite f1= favouriteRepository.save(1,)
			Movie m1= movieRepository.save(new Movie(1,"Life of Pi"));
			Movie m2= movieRepository.save(new Movie(2,"Titanic"));
			Movie m3= movieRepository.save(new Movie(3,"KKK"));

			System.out.println("nice to meet you!!!!");

		};
	}

}
