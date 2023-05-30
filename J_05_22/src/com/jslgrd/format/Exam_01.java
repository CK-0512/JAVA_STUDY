package com.jslgrd.format;

import java.text.DecimalFormat;

public class Exam_01 {
	public static void main(String[] args) {
		int money = 123456;
		double num = 12345.6789;
		String s = "#,###,###";
		DecimalFormat df = new DecimalFormat(s);
		
		String str1 = df.format(money);
		System.out.println(str1);
		
		s = "0,000,000";
		df = new DecimalFormat(s);
		String str2 = df.format(money);
		System.out.println(str2);
		
		s = "#,###.##";
		df = new DecimalFormat(s);
		String str3 = df.format(num);
		System.out.println(str3);

		num = 12345.0000;
		s = "#,###.##";
		df = new DecimalFormat(s);
		String str4 = df.format(num);
		System.out.println(str4);
		s = "#,###.00";
		df = new DecimalFormat(s);
		String str5 = df.format(num);
		System.out.println(str5);
	}
}
