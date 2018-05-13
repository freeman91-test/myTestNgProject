package utility;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviderConverter {
	@DataProvider
	public static Object[][] getData() throws IOException {
		Object[][] data = ExcelReading.getExcelData();

		return data;
	}
}
