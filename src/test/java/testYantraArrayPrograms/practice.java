package testYantraArrayPrograms;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;


@Test
public class practice {
	int[] a = { 4, 5, 1, 0, 3, 5 };

	public void s1() {

		// firstMax
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println(max + " it is a maximum number");
	}

	public void s2() {
		// secondmax
		int max = a[0];
		int secmax = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				secmax = max;
				max = a[i];
			}
		}
		System.out.println(secmax + "it is second maximum number in array");

	}

	public void s3() {
		// first minimum
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println(min);
	}

	@Test
	public void s4() {
		int min = a[0];
		int smin = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] < smin && a[i] > min) {
				smin = a[i];
			}
		}
		System.out.println(min);
		System.out.println(smin);
	}

	@Test
	public void s5() {
		int[] a = { 4, 3, 1, 2, 5 };
		int[] b = { 3, 4, 6, 7 };
		int[] res = null;
		if (a.length > b.length) {
			res = add(a, b);
		} else {
			res = add(b, a);
		}
		System.out.println(Arrays.toString(res));

	}

	public int[] add(int[] a, int[] b) {
		int[] res = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			if (b.length >= i) {
				res[i] = a[i] + b[i];
			} else {
				res[i] = a[i] + 0;
			}
		}
		return res;
	}

	@Test
	public void s7() {
		String s1 = "I am from banglore";
		// am from Banglore I
		// from Banglore I am
		// Banglore I am from
		// I am from Banglore
		boolean flag = true;
		int count = 0;
		String[] re = s1.split(" ");

		while (flag) {
			String res = "";
			for (int i = 1; i < re.length; i++) {
				res += re[i] + " ";
			}
			res += re[0];
			System.out.println(res);
			if (res.equals(s1)) {
				flag = false;
			}
			count++;
			re = res.split(" ");
		}
		System.out.println(count + "many times rotated");
	}

	@Test
	public void s8() {
		String s1 = "I am from banglore";
		// am from Banglore I
		// from Banglore I am
		// Banglore I am from
		// I am from Banglore
		String[] s2 = s1.split(" ");
		String[] str = s1.split(" ");
		String[] res = null;
		boolean flag = true;
		int count = 0;
		for (int i = 0; i < s2.length; i++) {
			res = new String[s2.length];
			for (int j = 0; j < str.length - 1; j++) {
				res[j] = str[j + 1];
			}
			res[res.length - 1] = s2[i];
			System.out.println(Arrays.toString(res));
			
			if (Arrays.toString(res).equals(Arrays.toString(s2))) {
				break;
			}
			str = res;
			count++;
			if (flag) {
				break;
			}
		}
	}
	@Test
	public void getCentredata() throws Exception, IOException {
		FileInputStream fis = new FileInputStream(".//src//test//resources//TestData.xlsx");
		Workbook wk = WorkbookFactory.create(fis);
		Sheet sheet = wk.getSheet("PatientRegistration");
		int row = sheet.getPhysicalNumberOfRows();
		int centreCell = sheet.getRow(0).getPhysicalNumberOfCells()/2;
		for (int i = 0; i < row; i++) {
			String celvalue = sheet.getRow(i).getCell(centreCell).getStringCellValue();
			System.out.println(celvalue);
			
			
		}
		
	}

}

