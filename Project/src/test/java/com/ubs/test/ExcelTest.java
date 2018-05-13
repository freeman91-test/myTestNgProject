package com.ubs.test;

import org.testng.annotations.Test;
import com.ubs.utility.ExcelData;

public class ExcelTest {

	@Test(dataProvider = "myData", dataProviderClass = ExcelData.class)
	public static void test1(String tname, String uname, String pass, String url) {
		System.out.println(tname + "  " + uname + "  " + pass + "  " + url);
	}

	@Test
	public void test1() {
		System.out.println("Hello");
	}
}
