package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {

	static String path = "C:\\Users\\panderah\\workspace\\CucumberProject\\Framework\\src\\utility\\loginData.xlsx";
	public static String[][] getExcelData() throws IOException {
		String[][] array = null;
		FileInputStream input = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(input);
		XSSFSheet sheet = workbook.getSheet("testData");

		int noOfRows = sheet.getPhysicalNumberOfRows();
		int noOfColumns = sheet.getRow(0).getPhysicalNumberOfCells();

		array = new String[noOfRows-1][noOfColumns];
		
		for(int i=1;i<noOfRows;i++){
			for(int j=0;j<noOfColumns;j++){
				array[i-1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}

		return array;
	}

}