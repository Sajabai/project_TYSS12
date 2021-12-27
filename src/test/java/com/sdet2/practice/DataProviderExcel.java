package com.sdet2.practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Vtiger.genericUtil.ExcelUtil;

public class DataProviderExcel {
	@Test(dataProvider ="getValue")
	public void dataprovide(String src,String dest) {

		System.out.println(src+" "+dest);
	}





	@DataProvider
	public  Object[][] getValue() throws Throwable {

		ExcelUtil excel= new ExcelUtil();
		int lastrow=excel.getLastRow("Sheet2");
		System.out.println(lastrow);
		Object arr[] [] = new Object[lastrow+1][2];

		for(int i=0; i<=lastrow;i++) {
			arr[i][0]=excel.readDatafromExcel("Sheet2",i, 0);
			arr[i][1]=excel.readDatafromExcel("Sheet2",i, 1);

		}
		return arr;
	}

}
