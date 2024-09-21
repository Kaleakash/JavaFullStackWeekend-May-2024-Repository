package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value = "",method = RequestMethod.GET)
	public String openPage(Model mm) {  // DI for Model API part of spring framework 
		mm.addAttribute("msg", "Akash, Java Trainer");  // request.setAttribute("msg","Akash");
		return "index";
	}
}
