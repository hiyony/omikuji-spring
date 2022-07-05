package com.omikuji.spring.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.omikuji.spring.domain.Input;
import com.omikuji.spring.form.InputForm;
import com.omikuji.spring.service.InputService;

@Controller
public class InputController {
	
	private InputService inputService;
	
	@GetMapping("/")
	public String input() {
		return "input";
	}
	
	@GetMapping("/output")
	public String output(Model model, InputForm form) {
		Input input = new Input();
		input.setBirthday(form.getBirthday());
		
		String birthday = input.getBirthday();
		
		model.addAttribute("birthday", birthday);
		
		return "output/output";
	}
	
	@PostMapping("/input")
	public String check(@Valid InputForm inputForm, Errors errors, Model model) {
		
		if(errors.hasErrors()) {
			Map<String, String> validatorResult = inputService.validateHandling(errors);
			for(String key : validatorResult.keySet()) {
				model.addAttribute(key, validatorResult.get(key));
			}
			
			return "/input";
		}
		return "output/output";
		
	}
}










