package com.proman.web.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.proman.web.model.User;

@Controller
public class HomeController {

   /* @Autowired
    EmployeeService service;*/

    @GetMapping("/home")
    public String hello(Model model) {

       /* model.addAttribute("name", "SSCP");

        Employee empNew = new Employee(8l, "web", "web", "Senior web", 2000);

        // Save new employee
        service.addNewEmployee(empNew);

        // Get saved employee
        Employee employee = service.getEmployee(empNew.getId());
*/
        return "welcome";
    }
    
    @RequestMapping(value = { "/signin"}, method = RequestMethod.GET)
    public String homePage(ModelMap model) {
        return "signin";
    }
    
    @RequestMapping(value = { "/signup"}, method = RequestMethod.GET)
    public String signUp(Locale locale, ModelMap model) {
    	User user = new User();
		model.addAttribute("user", user);
		
        return "signup";
    }
}
