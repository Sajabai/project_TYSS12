package com.sdet2.practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewDataProvider {
@Test(dataProvider="getValue")
public void print(String value1,String value2) {
	System.out.println(value1+""+value2);
}
	
  @DataProvider()
	public Object [] [] getValue() {
		
		Object arr[] []= new Object [4][2];
		
		arr [0] [0]="Marina Beach";
		arr 
		[0] [1]="Chennai";
		
		arr [1] [0]="Charminar";
		arr [1] [1]="Hyderabad";
		
		arr [2] [0]="RedFort";
		arr [2] [1]="Delhi";

		arr [3] [0]="CubbanPark";
		arr [3] [1]="Banglore";
		return arr;
		
		
	}
}
