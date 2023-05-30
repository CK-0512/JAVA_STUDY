package com.jslhrd.util;

public class DataArrExam {
	public static void main(String[] args) {
		DataArr dataArr = new DataArrPro();
		int[] arr = { 23, 43, 45, 75, 43, 76, 86, 78 };
		
		System.out.println(dataArr.getMaxArr(arr));
		System.out.println(dataArr.getMinArr(arr));
		System.out.println(dataArr.getSumArr(arr));
		dataArr.sort(arr, true);
		for (int i : arr) {
			System.out.printf("%d\t", i);
		}
		System.out.println();
	}
}
