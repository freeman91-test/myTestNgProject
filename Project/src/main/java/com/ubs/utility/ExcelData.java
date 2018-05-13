package com.ubs.utility;

import org.testng.annotations.DataProvider;

public class ExcelData {

	@DataProvider(name = "myData")
	public static Object[][] getData() {
		String path = "C:\\Users\\panderah\\git\\myTestNgProject\\Project\\src\\test\\java\\com\\ubs\\data\\test1.xlsx";
		Object[][] data = ExcelHandling.getExcelData(path);
		return data;
	}

}
