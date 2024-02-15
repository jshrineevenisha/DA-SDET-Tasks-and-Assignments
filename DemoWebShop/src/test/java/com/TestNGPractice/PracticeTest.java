package com.TestNGPractice;

import org.testng.annotations.Test;

public class PracticeTest {
	
	@Test(groups="Smoke")
	public void Sum() {
		System.out.println("Execute - 2");
	}
	
	@Test(groups="Sanity")//dependsOnMethods="Sum"
	public void Mul() {
		System.out.println("Execute - 1");
	}
	@Test(groups="Sanity")
	public void Div() {
		System.out.println("Execute - 3");
	}
}
