package com.proman.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.proman.server.delegate.UserDelegate;
import com.proman.server.dto.UserDTO;

@Controller
public class SearchController {

	@Autowired
	private UserDelegate userDelegate;
	
    @RequestMapping(value = { "/usersearch"}, method = RequestMethod.GET)
    public String homePage(ModelMap model) {
    	List<UserDTO> users = userDelegate.getUsers();
    	model.addAttribute("users", users);
        return "usersearch";
    }
    
}
