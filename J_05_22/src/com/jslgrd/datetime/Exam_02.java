package com.jslgrd.datetime;

import java.util.Calendar;

public class Exam_02 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

		int year = cal.get(Calendar.YEAR);// 년
		int month = cal.get(Calendar.MONTH) + 1;// 월(0~11)
		int date = cal.get(Calendar.DATE);// 일

		int week = cal.get(Calendar.DAY_OF_WEEK);// 요일(1:일 ~ 7:토)
		String weekday = "";
		switch (week) {
		case 1:
			weekday = "일";
			break;
		case 2:
			weekday = "월";
			break;
		case 3:
			weekday = "화";
			break;
		case 4:
			weekday = "수";
			break;
		case 5:
			weekday = "목";
			break;
		case 6:
			weekday = "금";
			break;
		case 7:
			weekday = "토";
			break;
		}
		System.out.printf("%d년 %d월 %d일 %s요일\n", year, month, date, weekday);
		
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		int ampm = cal.get(Calendar.AM_PM);
		
		if (ampm == Calendar.AM) {
			System.out.print("현재 시간은 AM ");
		} else {
			System.out.print("현재 시간은 PM ");
		}
		System.out.printf("%d시 %d분 %d초", hour, min, sec);
	}
}