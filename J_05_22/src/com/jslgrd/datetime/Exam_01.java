package com.jslgrd.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exam_01 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println("today : " +now);
		System.out.println("today : " +now.toString());
		//날짜를 형식화 (년월일시분초)
		SimpleDateFormat date = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String today = date.format(now);
		System.out.println("today : " + today);
	}
}
