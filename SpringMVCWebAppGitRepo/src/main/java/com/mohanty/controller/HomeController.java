package com.mohanty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mohanty.service.HomeService;

@Controller
@RequestMapping(value="/welcome")
public class HomeController {
	
	@Autowired
	HomeService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView welcome() {
		
		return new ModelAndView("welcomePage", "welcomeMessage", service.getWelcomeMessage());
	}
	
	
	@RequestMapping(value="welcomeAgain",method=RequestMethod.GET)
	public ModelAndView welcomeAgain() {
		
		return new ModelAndView("welcomePage", "welcomeMessage", service.getWelcomeAgainMessage());
	}

}
