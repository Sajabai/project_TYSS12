package com.Vtiger.genericUtil;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtil {
	
	
	private FileUtil() {
		
	}
	
	
	public static FileUtil objForFileUtil() {
		FileUtil prop =new FileUtil();
		return prop;
		
	}

	public String readDataFromPropfile(String key) throws Throwable {
		FileInputStream fis=new FileInputStream(IAutoConstants.propfilepath);
		Properties prop=new Properties();
		prop.load(fis);
		
		return prop.getProperty(key);
		
	}
	
	
	public String readDatafromPropfile(String key,String path) throws IOException {
		
		FileInputStream fis=new FileInputStream(path);
		Properties prop=new Properties();
		prop.load(fis);
	
		return prop.getProperty(key);
		

		
	}
}
