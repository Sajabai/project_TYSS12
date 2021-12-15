package com.Vtiger.genericUtil;

import java.util.Random;

import com.github.javafaker.Faker;

public class JavaUtil {
	
	public JavaUtil() {
		
	}
	/**
	 * @author sudha
	 * @description= want to create the singleton for object creation
	 * @return JavaUtil
	 */
	public static JavaUtil objForJavaUtil () 
	{
	 JavaUtil ju =new JavaUtil();
	 return ju;
	}
	/**
	 * @author sudha
	 * @return integer
	 */
	
	public int generateRandomNumber() {
	Random rr	=new Random();
	return rr.nextInt(2000);
	}
	/**
	 * @return firstName
	 */
	public String getFirstName() {
		
		Faker faker=new Faker();
		return faker.name().firstName();
		

	}
	/**
	 * @return
	 * @return
	 */
	
	public String getLastName() {
		Faker faker=new Faker();
		return faker.name().lastName();
		
	}
		
	
	public String PhoneNumber() {
		Faker faker=new Faker();
		return faker.phoneNumber().cellPhone();
	}

	}
