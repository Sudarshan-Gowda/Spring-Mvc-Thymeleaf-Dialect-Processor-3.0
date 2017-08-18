package com.star.sud.web.controller;

/*
 * @Author Sudarshan
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StarLoginController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String loginPage(Model model) {

		return "login/login-page";
	}

}
