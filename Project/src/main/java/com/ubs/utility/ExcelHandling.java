package com.ubs.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandling {

	static String filepath;
	FileInputStream input;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	static XSSFSheet sheetData;
	static Object[][] array;

	public ExcelHandling(String filepath) {
		this.filepath = filepath;
	}

	private void getWorkbook() {
		try {
			input = new FileInputStream(filepath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			workbook = new XSSFWorkbook(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private XSSFSheet getSheetUsingIndex(int index) {
		sheet = workbook.getSheetAt(index);
		return sheet;
	}

	private XSSFSheet getSheetUsingName(String sheetname) {
		sheet = workbook.getSheet(sheetname);
		return sheet;
	}

	private int getFirstRow(XSSFSheet sheet) {
		return sheet.getFirstRowNum();
	}

	private int getLastRow(XSSFSheet sheet) {
		return sheet.getLastRowNum();
	}

	private int getColumnCount(XSSFSheet sheet, int rowNumber) {
		return sheet.getRow(rowNumber).getPhysicalNumberOfCells();
	}

	private String getCellData(XSSFSheet sheet, int rowIndex, int columnIndex) {
		String data = null;

		if (sheetData.getRow(rowIndex).getCell(columnIndex).getCellType() == 1) {
			data = sheetData.getRow(rowIndex).getCell(columnIndex)
					.getStringCellValue();
		} else if (sheetData.getRow(rowIndex).getCell(columnIndex)
				.getCellType() == 0) {
			data = String.valueOf(sheetData.getRow(rowIndex)
					.getCell(columnIndex).getRawValue());
		} else if (sheetData.getRow(rowIndex).getCell(columnIndex)
				.getCellType() == 4) {
			data = String.valueOf(sheetData.getRow(rowIndex)
					.getCell(columnIndex).getBooleanCellValue());
		}

		return data;
	}

	private void closeWorkbook() {
		try {
			workbook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Object[][] getExcelData(String filepath) {
		ExcelHandling excelRead = new ExcelHandling(filepath);
		excelRead.getWorkbook();
		sheetData = excelRead.getSheetUsingName("testData");

		int rowCount = excelRead.getLastRow(sheetData)
				- excelRead.getFirstRow(sheetData) + 1;
		int columnCount = excelRead.getColumnCount(sheetData,
				excelRead.getFirstRow(sheetData));
		array = new Object[rowCount - 1][columnCount];

		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j < columnCount; j++) {
				array[i - 1][j] = excelRead.getCellData(sheetData, i, j);
				//System.out.println(excelRead.getCellData(sheetData, i, j));
			}
		}
	//	excelRead.closeWorkbook();
		return array;
	}
}
