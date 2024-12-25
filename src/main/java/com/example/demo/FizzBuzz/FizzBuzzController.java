package com.example.demo.FizzBuzz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FizzBuzzController {
	
	@Autowired
	private final FizzBuzzService fizzbuzzService;
	
	public FizzBuzzController (FizzBuzzService fizzbuzzService) {
		this.fizzbuzzService = fizzbuzzService;
	}
	
	@GetMapping("fizzbuzz")
	public String numLists(Model model) {
		
		model.addAttribute("arrlists", fizzbuzzService.listResponses());
		
		return "fizzbuzz";
	}
}
