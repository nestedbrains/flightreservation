package com.sio.flightreservation.controller;

import com.sio.flightreservation.entities.User;
import com.sio.flightreservation.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @RequestMapping("/showReg")
    public String showRegistrationPage() {
        return "login/registerUser";
    }

    @RequestMapping(value = "/registerUser")
    public String register(@ModelAttribute("user") User user) {
        userRepository.save(user);
        return "login/login";
    }

    @RequestMapping(value = "/login")
    public String login(@RequestParam("email") String email, @RequestParam("password") String password, ModelMap modelMap) {
        User user = userRepository.findByEmail(email);
        if (user.getPassword().equals(password)){
            return "login/findFlight";
        }
        else {
            modelMap.addAttribute("msg" , "Invalid user or password");
        }
        return "login/login";
    }

}
