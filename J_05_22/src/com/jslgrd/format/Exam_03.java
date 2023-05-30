package com.jslgrd.format;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exam_03 {
	public static void main(String[] args) throws ParseException {
		String now = "20230522";
		String now2 = "2023-05-22";
		//문자열을 날짜형으로
		DateFormat df1 = new SimpleDateFormat("yyyyMMdd");
		DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
		
		Date d = df1.parse(now);
		System.out.println(d);

		Date d2 = df2.parse(now2);
		System.out.println(d2);
		
		String now3 = "2023년5월22일";
		DateFormat df3 = new SimpleDateFormat("yyyy년MM월dd일");
		DateFormat df4 = new SimpleDateFormat("yyyy-MM-dd");
		
		Date d3 = df3.parse(now3);
		String s = df4.format(d3);
		System.out.println(s);
	}
}
