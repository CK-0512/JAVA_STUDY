package com.jslgrd.format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exam_02 {
	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-EEEE");
		String date = sdf.format(now);
		System.out.println(date);
		
		sdf = new SimpleDateFormat("yy-M-dd-E");
		date = sdf.format(now);
		System.out.println(date);
		
		sdf = new SimpleDateFormat("HH:mm:ss");
		String time = sdf.format(now);
		System.out.println(time);
		
	}
}
