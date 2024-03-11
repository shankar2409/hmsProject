package com.hms.genericUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtils {
	/**
	 * this method is used to generate random numbers by giving endRange
	 * start range : 0 to endRange
	 * @param endRange
	 * @return
	 */
	public int randomNo(int endRange) {
		Random r=new Random();
		int ranNo = r.nextInt(endRange);
		return ranNo;
	}
	/**
	 * this method is used to get the SystemDate in our localDate
	 * @return
	 */
	public String getSystemDate() {
		Date dt=new Date();
		String date=dt.toString();
		return date;
	}
	/**
	 * this method is used to get systemDate in the Format
	 * @return
	 */
	public String getSystemDateInFormat() {
		SimpleDateFormat simpleDate=new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		Date dt = new Date();
		String date = simpleDate.format(dt);
		return date;
		
		
	}
}
