package sg.nus.iss.adprojectTeam5api.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sg.nus.iss.adprojectTeam5api.Model.RoleEnum;
import sg.nus.iss.adprojectTeam5api.Model.User;
import sg.nus.iss.adprojectTeam5api.Model.UserSession;
import sg.nus.iss.adprojectTeam5api.Service.UserService;

import javax.servlet.http.HttpSession;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/edit")
    public String manageUserProfile(Model model, HttpSession session) {
//        UserSession userSession = (UserSession) session.getAttribute("user");

        // this is for mock testing
        UserSession userSession = new UserSession(new User("jasmine", "66@qq.com", "password", true, RoleEnum.USER));
        User user = userSession.getUser();
        model.addAttribute("user", user);
        return "user-profile-edit";
    }

    @RequestMapping(value = "/updateProfile", method = RequestMethod.POST)
    public String updateProfile(@ModelAttribute User user) {

        userService.updateUser(user);
        return "profile-page";
    }
}
