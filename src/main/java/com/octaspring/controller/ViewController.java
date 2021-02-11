package com.octaspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


//Recibir peticiones -> Cargar los recursos -> ... 
@Controller
public class ViewController {


	@GetMapping("/")
	public String index() {
		
		return "index";
	}
	
	@GetMapping("/register")
	public String register() {
		
		return "register";
	}
	
}
