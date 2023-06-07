package com.example.demo;

import org.testng.annotations.Test;

public class Calculator {
	@Test
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Test
	public int sub(int num1, int num2) {
		return num1 - num2;
	}

	@Test
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

	@Test
	public int div(int num1, int num2) {
		return num1 / num2;
	}

}
