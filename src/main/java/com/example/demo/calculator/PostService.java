package com.example.demo.calculator;

import org.springframework.stereotype.Service;

@Service
public class PostService {
	public int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	public int minus(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	public int division(int num1, int num2) {
		int result = num1 / num2;
		return result;
	}
	public int multiplication(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
}
