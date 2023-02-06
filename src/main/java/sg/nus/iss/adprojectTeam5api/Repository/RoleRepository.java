package sg.nus.iss.adprojectTeam5api.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sg.nus.iss.adprojectTeam5api.Model.Role;
import sg.nus.iss.adprojectTeam5api.Model.RoleEnum;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleEnum name);
}
