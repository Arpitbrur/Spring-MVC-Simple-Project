package com.jsp.Spring_mvc_project_1pm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.Spring_mvc_project_1pm.dto.User;
import com.jsp.Spring_mvc_project_1pm.service.UserService;

@Controller
public class UserController {
	
	UserService service = new UserService();
	
	
	@RequestMapping(value= "/")
	public String getLoad() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/openInsert")
	public ModelAndView openInsertUserPage() {
		ModelAndView andView = new ModelAndView("insert.jsp");
		
		return andView.addObject("userObject",new User());
	}
	
	@PostMapping(value="/saveUser")
	public ModelAndView insertUser(User user) {
		service.insertUser(user);
		
		ModelAndView andView = new ModelAndView("/openInsert");
		andView.addObject("message", "Success");
		
		return andView;
	}
	
	@GetMapping(value ="getAllUser")
	public ModelAndView getAllDisplay() {
		ModelAndView andView= new ModelAndView("display.jsp");
		
		andView.addObject("allUser", service.getAllDisplay());
		
		return andView;
	}
}
