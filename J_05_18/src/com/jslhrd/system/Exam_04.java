package com.jslhrd.system;

public class Exam_04 {
	public static void main(String[] args) {
		String path = System.getenv("TMP");
		System.out.println(path);
		
		path = System.getenv("os");
		System.out.println(path);
	}
}
