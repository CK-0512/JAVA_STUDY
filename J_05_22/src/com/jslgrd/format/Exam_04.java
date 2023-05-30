package com.jslgrd.format;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Exam_04 {
	public static void main(String[] args) {
		//날짜출력
		
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		//시간
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
	}
}
