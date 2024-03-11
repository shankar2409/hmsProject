package com.hms.genericUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {
	/**
	 * this method is used to read data from the excel sheet in Existing sheets
	 * 
	 * 
	 * @author Shankar
	 * 
	 * 
	 *
	 * @param sheetName
	 * @param rowNo
	 * @param cellNo
	 * @return
	 * @throws Exception
	 */
	public String readDataFromExcelFile(String sheetName, int rowNo, int cellNo) throws Exception {
		FileInputStream fis = new FileInputStream(IpathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		String value = sheet.getRow(rowNo).getCell(cellNo).getStringCellValue();

		return value;
	}

	/**
	 * this method is used to get the last row for the Existing sheet
	 * 
	 * @author Shankar
	 * 
	 * @param sheetName
	 * @return
	 * @throws Exception
	 */
	public int getLastRowNo(String sheetName) throws Exception {
		FileInputStream fis = new FileInputStream(IpathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		int rowCount = wb.getSheet(sheetName).getLastRowNum();
		return rowCount;
	}

	/**
	 * this method is used to write data into Existing Excel Sheet
	 * 
	 * @param sheetName
	 * @param rowNo
	 * @param cellNo
	 * @param value
	 * @throws Exception
	 */
	public void writeDataIntoExcelForExistingSheet(String sheetName, int rowNo, int cellNo, String value)
			throws Exception {
		FileInputStream fis = new FileInputStream(IpathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		sheet.createRow(rowNo).createCell(cellNo).setCellValue(value);
		FileOutputStream fos = new FileOutputStream(IpathConstants.ExcelPath);
		wb.write(fos);
		wb.close();

	}

	/**
	 * by using this method we can create an new sheet we will write particular
	 * value by selecting rowNo and CellNo
	 * 
	 * @param newSheetName
	 * @param rowNo
	 * @param cellNo
	 * @param value
	 * @throws Exception
	 */
	public void writeDataIntoExcelForNewSheet(String newSheetName, int rowNo, int cellNo, String value)
			throws Exception {
		FileInputStream fis = new FileInputStream(IpathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.createSheet(newSheetName);
		sheet.createRow(rowNo).createCell(cellNo).setCellValue(value);
		FileOutputStream fos = new FileOutputStream(IpathConstants.ExcelPath);
		wb.write(fos);
		wb.close();
	}

	/**
	 * by using this method we will get key and value pair return type of this
	 * method is HashMap<String,String>
	 * 
	 * @param sheetName
	 * @param cell
	 * @param driver
	 * @return
	 * @throws Exception
	 */
	public HashMap<String, String> readMultipleData(String sheetName, int cell) throws Exception {
		FileInputStream fis = new FileInputStream(IpathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum();
		HashMap<String, String> map = new HashMap<String, String>();
		for (int i = 0; i <= rowCount; i++) {
			String key = sheet.getRow(i).getCell(cell).getStringCellValue();
			String value = sheet.getRow(i).getCell(cell + 1).getStringCellValue();
			map.put(key, value);
		}
		return map;
	}

	public static LinkedList<String> readMultipleDataInFormatOfList(String sheetName, int cell)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(IpathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum();
		LinkedList<String> list = new LinkedList<String>();
		for (int i = 0; i <= rowCount; i++) {
//			String key = sheet.getRow(i).getCell(cell).getStringCellValue();
			String value = sheet.getRow(i).getCell(cell + 1).getStringCellValue();
			list.add(i, value);
		}
		return list;
	}

	// dataprovider
	public Object[][] excelData(String sheetName) throws EncryptedDocumentException, Exception {
		FileInputStream fis = new FileInputStream(IpathConstants.ExcelPath);
		Workbook eb = WorkbookFactory.create(fis);
		Sheet sh = eb.getSheet(sheetName);
		int lastRow = sh.getPhysicalNumberOfRows();
		int lastCell = sh.getRow(1).getPhysicalNumberOfCells();

		Object[][] obj = new Object[lastRow][lastCell];

		for (int i = 0; i < lastRow; i++) {
			for (int j = 0; j < lastCell; j++) {
				obj[i][j] = sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return obj;
		
		
		
		//with header
//		Object[][] obj=new Object[lastRow][lastCell];
//
//		for (int i = 0; i < lastRow; i++) {
//			for (int j = 0; j < lastCell; j++) {
//				obj[i][j] = sh.getRow(i+1).getCell(j).getStringCellValue();
//				System.out.println(obj[i][j]);
//			}
//		}
//		return obj;

	}

	
}
