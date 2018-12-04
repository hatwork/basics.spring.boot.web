package com.hatim.basics.spring.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("name", "Hatim Kamaal");
		return "index";
	}

	@GetMapping("/input")
	public String showInputPage(Model model) {
		model.addAttribute("inputObject" , new MyBean());
		return "input";
	}

	@PostMapping("/detail")
	public String showResultPage(@ModelAttribute(name="bean") MyBean bean) {
		return "result";
	}

}
