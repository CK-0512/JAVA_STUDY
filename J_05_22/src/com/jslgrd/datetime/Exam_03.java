package com.jslgrd.datetime;

import java.util.Calendar;

public class Exam_03 {
	public static void main(String[] args) {
		
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(year, month - 1, 1);
		date2.set(year, month, 1);
		
		date2.add(Calendar.DATE, -1);
		
		START_DAY_OF_WEEK = date1.get(Calendar.DAY_OF_WEEK);
		END_DAY = date2.get(Calendar.DATE);
		
		System.out.printf("	%d년 %d월\n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		
		for (int i = 1; i < START_DAY_OF_WEEK; i++) {
			System.out.print("   ");
		}
		
		for (int i = 1; i <= END_DAY; i++) {
			System.out.print(i < 10 ? "  " + i : " " + i);
			if ((i + START_DAY_OF_WEEK - 1) % 7 == 0) {
				System.out.println();
			}
		}
	}
}
