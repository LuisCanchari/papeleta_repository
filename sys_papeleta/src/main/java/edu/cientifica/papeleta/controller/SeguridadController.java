package edu.cientifica.papeleta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SeguridadController {
	@GetMapping("/")
	public String login() {
		return "login";
	
	}
}
