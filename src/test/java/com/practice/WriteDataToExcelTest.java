package com.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataToExcelTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sheet = wb.getSheet("sheet1");
//		sheet.createRow(6).createCell(1).setCellValue("heyyyyy....");
//		FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\TestData.xlsx");
//		wb.write(fos);
//		fis.close();
//		System.out.println("donee...");
		Scanner sc;
		sc = new Scanner(System.in);
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
//		XSSFWorkbook wb=new XSSFWorkbook();
		Sheet sheet = wb.createSheet("sheet5");
		
		for(int i=0;i<3;i++) {
			Row row = sheet.createRow(i);
			for(int j=0;j<3;j++) {
				row.createCell(j).setCellValue(sc.nextLine());
			}
			
		}
		FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\TestData.xlsx");
		wb.write(fos);
		wb.close();
		System.out.println("done..");
	}
}
