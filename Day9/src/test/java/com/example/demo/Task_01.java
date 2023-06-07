package com.example.demo;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Task_01 {
	Calculator cl = new Calculator();

	@Test(dataProvider = "testData")
	public void addmethod(int a, int b, int expected) {
		int result = cl.add(a, b);
		Assert.assertEquals(expected, result);
	}

	@Test(dataProvider = "testData1")
	public void mulmethod(int num1, int num2, int expected) {
		int result = cl.multiply(num1, num2);
		Assert.assertEquals(expected, result);
	}

	@DataProvider
	public Object[][] testData() {
		return new Object[][] { { 1, 1, 2 }, { 2, 2, 4 } };
	}

	@DataProvider
	public Object[][] testData1() {
		return new Object[][] { { 1, 1, 1 }, { 2, 2, 4 } };
	}

}
