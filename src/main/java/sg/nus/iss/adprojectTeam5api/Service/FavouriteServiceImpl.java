package sg.nus.iss.adprojectTeam5api.Service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.nus.iss.adprojectTeam5api.Model.Favourite;
import sg.nus.iss.adprojectTeam5api.Repository.FavouriteRepository;

@Service
public class FavouriteServiceImpl implements FavouriteService{

    @Resource
    FavouriteRepository favouriteRepository;

    @Override
    public Favourite save(Favourite favourite){
        return favouriteRepository.save(favourite);
    }

    @Override
    public void deleteById(int id){
        favouriteRepository.deleteById(id);
    }
    // @Override
    // public Boolean isFavourite(int user_id, int movie_id){
    //    return favouriteRepository.isFavourite(user_id,movie_id);
    // }
}
