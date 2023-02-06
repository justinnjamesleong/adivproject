package sg.nus.iss.adprojectTeam5api.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sg.nus.iss.adprojectTeam5api.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

    Optional<User> findByUsername(String username);

	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);
}
