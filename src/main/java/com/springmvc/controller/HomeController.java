package com.springmvc.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping(value = "home",method = RequestMethod.GET,consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String home() {
		return "Home Page";
	}
}

