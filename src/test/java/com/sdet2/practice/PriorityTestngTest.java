package com.sdet2.practice;

import org.testng.annotations.Test;

public class PriorityTestngTest {

	@Test(priority = 1)
	public void priority() {
		
		int num1=10;
		int num2=20;
		int sum=num1+num2;
		
		
		System.out.println("the sum of num is"+sum);
		
	}
	@Test
public void bcd() {
		
		int num1=10;
		int num2=20;
		int sum=num1+num2;
		
		
		System.out.println("the sum of num is"+sum);
		
		
		
		
	
	}
	@Test
	public void abc() {
			
			int num1=10;
			int num2=20;
			int sum=num1+num2;
			
			
			System.out.println("the sum of num is"+sum);
			
			
			
			
		
		}

}

