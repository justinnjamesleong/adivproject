package sg.nus.iss.adprojectTeam5api.Service;

import sg.nus.iss.adprojectTeam5api.Model.User;

import java.util.List;

public interface UserService {
    public List<User> findAllUser();
    public User findUserById(Long id);
    public void updateUser(User user);
    public List<Long>findFollowersId(User user);
    public  void deleteFollowerById(Long userId,Long followerId);
}
