package com.bsrdev.apps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bsrdev.apps.vo.RegistrationVO;

@Controller
public class RegistrationController {

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register() {
		return "form";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute RegistrationVO user) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("form-data");
		modelAndView.addObject("user", user);
		return modelAndView;
	}
}
