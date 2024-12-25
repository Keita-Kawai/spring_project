package com.example.demo.FizzBuzz;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {
	
	public List<String> listResponses() {
		
		List<String> numLists = new ArrayList<>();
		
		for (int i = 1; i <= 100; i++) {
			
			if (i % 3 == 0 && i % 5 == 0) {
				numLists.add("FizzBuzz");
			} else if (i % 3 == 0) {
				numLists.add("Fizz");
			} else if(i % 5 == 0) {
				numLists.add("Buzz");
			} else {
				numLists.add(Integer.toString(i));				
			}
		}
		return numLists;
	}

	
}
