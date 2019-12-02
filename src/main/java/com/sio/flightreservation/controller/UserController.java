package com.sio.flightreservation.controller;

import com.sio.flightreservation.entities.User;
import com.sio.flightreservation.repos.UserRepository;
import com.sio.flightreservation.services.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private SecurityService securityService;

    @Autowired
    private BCryptPasswordEncoder encoder;


    @RequestMapping("/showReg")
    public String showRegistrationPage() {
        return "login/registerUser";
    }

    @RequestMapping("/showLogin")
    public String showLoginPage() {
        return "login/login";
    }

    @RequestMapping(value = "/registerUser")
    public String register(@ModelAttribute("user") User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        userRepository.save(user);
        return "login/login";
    }

    @RequestMapping(value = "/login")
    public String login(@RequestParam("email") String email, @RequestParam("password") String password, ModelMap modelMap) {
        //User user = userRepository.findByEmail(email);
        // if (user.getPassword().equals(password)){
        boolean loginResponse = securityService.login(email, password);
        if (loginResponse) {
            return "login/findFlight";
        } else {
            modelMap.addAttribute("msg", "Invalid user or password");
        }
        return "login/login";
    }

}
