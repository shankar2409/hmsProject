package com.practice;

import java.io.FileInputStream;
import java.util.Collections;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hms.genericUtils.ExcelUtils;

public class Dataprovider {
	Iterable<String> ds;
	@DataProvider()
	public Object[][] getData() throws Exception, Exception {
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("dp");
		int lastRow = sh.getLastRowNum() + 1;
		int lastCell = sh.getRow(0).getLastCellNum();
		Object[][] obj = new Object[lastRow][lastCell];
		for (int i = 0; i < lastRow; i++) {
			for (int j = 0; j < lastCell; j++) {
				obj[i][j] = sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return obj;
		
	}

	@DataProvider()
	public Object[][] printData()
			throws EncryptedDocumentException, Exception {
		ExcelUtils e = new ExcelUtils();
		return e.excelData("dp");
	}
	@Test(dataProvider = "printData")
	public void print(String from, String to, String name, String charge) {
			System.out.println(from+" -->"+to+"-->"+name+"-->"+charge);
		}
	}

