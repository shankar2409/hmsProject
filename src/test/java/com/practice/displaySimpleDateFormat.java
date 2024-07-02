package com.practice;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class displaySimpleDateFormat {
	public static void main(String[] args) {
		 // Get the current date
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate.toString());
        // Define a custom date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d'th' MMM, yyyy");
        
        // Format the date and print it
        String formattedDate = currentDate.format(formatter);
        System.out.println(formattedDate);
        Date d=new Date();
        SimpleDateFormat sm = new SimpleDateFormat("d'^th' MMM, yyyy");
        String sds = sm.format(d);
        System.out.println(sds);
        
        pn(1, 10);
        System.out.println(Integer.MIN_VALUE);
        
	}
	public static void pn(int start,int end) {
		if(start<=end) {
			System.out.print(start+" ");
			pn(start+1, end);
		}
	}
}
