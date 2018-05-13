package sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample {

	public static void main(String[] args) throws Exception{
		String filePath= "C:\\Users\\panderah\\workspace\\CucumberProject\\Framework\\src\\utility\\loginData.xlsx";
		FileInputStream input = new FileInputStream(filePath);
		XSSFWorkbook workbook = new XSSFWorkbook(input);
		XSSFSheet sheet = workbook.getSheet("testData");
		int rowLength= sheet.getFirstRowNum()+ sheet.getLastRowNum();
		int columnLength=sheet.getRow(sheet.getFirstRowNum()).getPhysicalNumberOfCells();
		for(int i=0;i<rowLength;i++){
			for(int j=0;j<columnLength;j++){
				//System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			}
		}
		workbook.close();
	}
}
