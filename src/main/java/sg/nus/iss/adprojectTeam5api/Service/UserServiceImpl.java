package sg.nus.iss.adprojectTeam5api.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sg.nus.iss.adprojectTeam5api.Model.User;
import sg.nus.iss.adprojectTeam5api.Repository.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    @Override
    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    @Transactional
    @Override
    public User findUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void updateUser(User user) {
        System.out.println(user);
        userRepository.updateUser(user.getId(),user.getUsername(),user.getPassword(),user.getEmail());
    }

    public List<Long> findFollowersId( User user){

       List<Long> followersId= userRepository.findFollowersId(user.getId());
       return  followersId;
    }

    public  void deleteFollowerById(Long userId,Long followerId){
     userRepository.deleteFollowerById(userId,followerId);
    }

    public List<Long> findFollowingsId(User user){
        List<Long> followingsId= userRepository.findFollowingsId(user.getId());
        return  followingsId;

    }
}
