package com.example.demo.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PostController {
	@Autowired
	private final PostService postService;
	public PostController(PostService postService) {
		this.postService = postService;
	}
	
	@GetMapping("post")
	public String showPostForm() {
		return "post.html";
	}
	
	@PostMapping("result")
	public String requestForm(@RequestParam("num1") int num1, @RequestParam("num2") int num2, @RequestParam("symbol") String symbol, Model model) {
		String result = "";
		switch(symbol) {
			case "add":
				result = String.valueOf(postService.add(num1, num2));
				break;
			case "minus":
				result = String.valueOf(postService.minus(num1, num2));
				break;
			case "division":
				result = String.valueOf(postService.division(num1, num2));
				break;
			case "multiplication":
				result = String.valueOf(postService.multiplication(num1,num2));
				break;
		}
		model.addAttribute("result",result);
		return "post.html";
	}
	
}
