package com.example.demo.minus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GetController {

	@Autowired
	private final GetService getService;
	
	public GetController(GetService getService) {
		this.getService = getService;
	}

	@GetMapping("get")
	public String showGetForm() {
		return "get.html";
	}
	
	@GetMapping("result")
	public String requestForm(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
		String result = "";
		result = String.valueOf(getService.subtraction(num1, num2));
		
		model.addAttribute("result", result);
		
		return "get.html";
		
	}
}
