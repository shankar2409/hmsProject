package com.practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("sheet1");
	int rowCount = sheet.getPhysicalNumberOfRows();
	System.out.println(rowCount);
	rowCount=sheet.getLastRowNum();
	System.out.println(rowCount);
	for(int i=1;i<rowCount;i++) {
		int cellCount = sheet.getRow(i).getPhysicalNumberOfCells();
		for(int j=0;j<cellCount;j++) {
			
			try {
				String value = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+"  " );
			} catch (Exception e) {
				double value1 = sheet.getRow(i).getCell(j).getNumericCellValue();
				System.out.print(value1+"  ");
			}
		}
		System.out.println();
	}
	fis.close();
		
	}

}
