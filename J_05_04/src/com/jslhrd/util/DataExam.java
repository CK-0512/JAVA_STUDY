package com.jslhrd.util;

public class DataExam {
	public static void main(String[] args) {
		Data data = new DataPro();
		int[] arr = { 23, 43, 45, 75, 43, 76, 86, 78 };

		System.out.println(data.getMax(42, 32, 35, 64, 75, 56, 54));
		System.out.println(data.getMin(31, 35, 57, 86, 97, 56, 45));
		System.out.println(data.getSum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		data.sort(arr, false);
		for (int i : arr) {
			System.out.printf("%d\t", i);
		}
		System.out.println();
	}
}
