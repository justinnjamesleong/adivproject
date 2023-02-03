package sg.nus.iss.adprojectTeam5api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sg.nus.iss.adprojectTeam5api.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

    
}
