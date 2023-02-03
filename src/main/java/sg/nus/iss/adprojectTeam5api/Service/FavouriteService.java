package sg.nus.iss.adprojectTeam5api.Service;

import sg.nus.iss.adprojectTeam5api.Model.Favourite;

public interface FavouriteService {
    Favourite save(Favourite favourite);
    void deleteById(int id);

    // Boolean isFavourite(int user_id, int movie_id); 
    
}
