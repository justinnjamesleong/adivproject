package sg.nus.iss.adprojectTeam5api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import sg.nus.iss.adprojectTeam5api.Model.Favourite;

@Repository
public interface FavouriteRepository extends JpaRepository<Favourite,Integer> {

    // @Query("SELECT f WHEN COUNT(f) > 0 THEN true ELSE false END FROM FAVOURITE f WHERE f.user_id =:user_id AND f.movie_id=:movie_id")
    // boolean isFavourite(@Param("user_id") int user_id, @Param("movie_id") int movie_id);

    
}
