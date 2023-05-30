package com.jslhrd.arrays;

import java.util.Arrays;
import java.util.Comparator;

//배열 항목 정렬
public class Exam_03 {
	public static void main(String[] args) {
		int[] score = {70, 90, 80, 68, 79, 95};
		String[] name = {"김학생", "강학생", "유학생", "박학생", "이학생"};
		
		System.out.println("Source : " + Arrays.toString(score));
		Arrays.sort(score);// 오름차순
		System.out.println("Source : " + Arrays.toString(score));
		
		System.out.println("Source : " + Arrays.toString(name));
		Arrays.sort(name);// 오름차순
		System.out.println("Source : " + Arrays.toString(name));
		
		// 내림차순
		Integer[] ss = new Integer[] {9, 4, 6, 7, 8, 4};
		System.out.println("Source : " + Arrays.toString(ss));
		Arrays.sort(ss, Comparator.reverseOrder());
		System.out.println("Source : " + Arrays.toString(ss));

		
	}
}
