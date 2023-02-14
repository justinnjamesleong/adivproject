package sg.nus.iss.adprojectTeam5api.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sg.nus.iss.adprojectTeam5api.Model.User;
import sg.nus.iss.adprojectTeam5api.Service.UserService;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/userList")
    public String manageUser(Model model) {

        List<User> userList = userService.findAllUser();
        model.addAttribute("users", userList);
        return "user-list";
    }

    @RequestMapping(value = "/banUser", method = RequestMethod.GET)
    public String banUser(Long userId, Model model) {
        User user = userService.findUserById(userId);
        user.setActive(false);
        userService.updateUser(user);
        return "redirect:/admin/userList";

    }
}
