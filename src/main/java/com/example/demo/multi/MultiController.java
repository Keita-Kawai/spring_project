package com.example.demo.multi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MultiController {
	
	private final MultiServer multiServer;
	
	public MultiController(MultiServer multiServer) {
		this.multiServer = multiServer;
	}
	
	@GetMapping("multi")
	public String multi(Model model) {
		String result = "";
		result = String.valueOf(multiServer.multiplication(5, 6));
		
		model.addAttribute("result", result);
		
		return "multi.html";
	}
	
}
