package com.proman.web.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.proman.server.model.UserDetails;
import com.proman.web.model.User;

@Controller
public class ProfileController {

    @RequestMapping(value = { "/editpersonalinfo"}, method = RequestMethod.GET)
    public String homePage(ModelMap model) {
    	UserDetails userDetals = new UserDetails();
		model.addAttribute("userDetals", userDetals);
        return "editpersonalinfo";
    }
    
    @RequestMapping(value = { "/viewpersonalinfo"}, method = RequestMethod.GET)
    public String signUp(ModelMap model) {
        return "viewpersonalinfo";
    }
    
    @RequestMapping(value = "/savepersonalinfo", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("userDetals")UserDetails userDetals, 
      BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "editpersonalinfo";
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
