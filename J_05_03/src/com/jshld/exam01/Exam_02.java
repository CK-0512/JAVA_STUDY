package com.jshld.exam01;

public class Exam_02 {
	public static void main(String[] args) {
		String str = "Korea";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println(ch + ", " + (int)ch);
		}
	}
}
