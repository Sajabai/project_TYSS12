package com.Vtiger.genericUtil;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersImplementation implements ITestListener {

	public void onTestStart(ITestResult result) {
	
	}

	public void onTestSuccess(ITestResult result) {
		
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getMethod().getMethodName()+""+"OPPS test got failed");
		try {
			BaseTest.takescreenshot(result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
	}
	

	public void onTestSkipped(ITestResult result) {
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
	}
	
	
	

	
	
}
