package com.jlshard.exam02;

public class MathTest extends MathExam {

	public int max(int a, int b) {
		if (a > b) {
			return a;
		}
		return b;
	}

	public int min(int a, int b) {
		if (a < b) {
			return a;
		}
		return b;
	}

	public int max(int... a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}

	public int min(int... a) {
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		return min;
	}

}
