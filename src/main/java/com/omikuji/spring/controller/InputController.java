package com.omikuji.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InputController {
	
	@GetMapping("/")
	public String input() {
		return "input";
	}
	
	@GetMapping("/output")
	public String output() {
		return "output/output";
	}
}
