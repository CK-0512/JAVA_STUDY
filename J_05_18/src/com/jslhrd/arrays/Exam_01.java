package com.jslhrd.arrays;

import java.util.Arrays;

public class Exam_01 {
	public static void main(String[] args) {
		//toString();
		String str[] = {"ccc", "aaa", "ddd", "bbb", "eee"};
		//일반 for()
		System.out.println(" -- 일반 for() --");
		for (int i = 0; i <str.length; i++) {
			System.out.print(str[i] + "\t");
		}
		System.out.println();
		
		//확장 for()
		System.out.println(" -- 확장 for() --");
		for (String a : str) {
			System.out.print(a + "\t");
		}
		System.out.println();
		
		//Arrays.toString();
		System.out.println(" -- Arrays.toString() --");
		System.out.println(Arrays.toString(str));
		
	}
}
