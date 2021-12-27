
package com.Vtiger.genericUtil;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil {
	public ExcelUtil() {

	}
	/**
	 * 
	 * @return
	 */

	public static ExcelUtil objforExcelUtil() {
		ExcelUtil e1=new ExcelUtil();
		return e1;
	}

	public String readDatafromExcel(String name,int rnum,int cnum) throws Throwable {
		FileInputStream fis =new FileInputStream(IAutoConstants.excelpath);
		Workbook wb=WorkbookFactory.create(fis);
		String value=wb.getSheet(name).getRow(0).getCell(0).getStringCellValue();
		return value;
	}
	public int getLastRow(String sheetname) throws Throwable {

		FileInputStream fis =new FileInputStream(IAutoConstants.excelpath);
		Workbook wb=WorkbookFactory.create(fis);
		return wb.getSheet(sheetname).getLastRowNum();
	}

	public String selectValueFromDD(String sheetname,int cnum,String DDvalue) throws Throwable {
		FileInputStream fis =new FileInputStream(IAutoConstants.excelpath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		


		int lastrow=getLastRow(sheetname);
		String value="null";


		for(int i=0;i<lastrow;i++) 
		{


			value=sh.getRow(i).getCell(cnum).getStringCellValue();
			if(value.equalsIgnoreCase(DDvalue))
			{
				break;
			}
		}

		return value;

	}







}


