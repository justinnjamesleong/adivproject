package sg.nus.iss.adprojectTeam5api.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import sg.nus.iss.adprojectTeam5api.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

    @Modifying
    @Query("update User u set u.username = :username, u.email=:email, u.password = :pwd where u.id= :id")
    void updateUser(@Param("id") Long id, @Param("username") String username, @Param("pwd") String pwd, @Param("email") String email);
}
