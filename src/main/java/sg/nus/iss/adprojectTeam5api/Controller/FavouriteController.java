package sg.nus.iss.adprojectTeam5api.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sg.nus.iss.adprojectTeam5api.Model.Favourite;
import sg.nus.iss.adprojectTeam5api.Repository.FavouriteRepository;
import sg.nus.iss.adprojectTeam5api.Service.FavouriteService;

@RestController
public class FavouriteController {

    @Autowired
    FavouriteService favouriteService;

    @PostMapping("/movie/favourite")
    public Favourite save(@RequestBody Favourite favourite){
        return favouriteService.save(favourite);
    }

    @DeleteMapping("/movie/favourite/{id}")
    public void deleteById(@PathVariable int id){
         favouriteService.deleteById(id);
    }
    
    @GetMapping("/movie/isfavourite")
    public Boolean isFavourite(@RequestBody int user_id,int movie_id){
        return false;

    }

    
}
