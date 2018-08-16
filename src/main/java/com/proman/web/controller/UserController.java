package com.proman.web.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.proman.server.delegate.UserDelegate;
import com.proman.server.service.UserService;
import com.proman.web.model.User;

@Controller
public class UserController {
	
	@Autowired
    private UserService userService;
	
	@Autowired
	private UserDelegate userDelegate;

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("user")User user, 
      BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "signup";
        }
        
        com.proman.server.model.User dbuser = new com.proman.server.model.User();
        dbuser.setUsername(user.getUsername());
        dbuser.setPassword(user.getPassword());
        dbuser.setEnabled(true);
        dbuser.setLocked(false);
        dbuser.setFailedLogins(0);
        userService.saveUser(dbuser);
        
        model.addAttribute("name", user.getUsername());
        Integer userId = userDelegate.getUser(user.getUsername()).getUserId();
        System.out.println("UserId : "+userId);
        model.addAttribute("username", userId);
        
        return "success";
    }
}
