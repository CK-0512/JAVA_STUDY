package com.jshld.exam01;

public class ExamProcess implements JSLProcess {

	@Override //어노테이션 : 컴파일러한테 여부를 알려줌
	public int max(int a, int b) {
		return (a > b) ? a : b;
	}

	@Override
	public int min(int a, int b) {
		int min = a;
		if (min > b) {
			min = b;
		}
		return min;
	}

	@Override
	public int max(int... a) {
		int max = a[0];
		for (int i : a) {
			if (i > max) 
				max = i;
		}
		return max;
	}

	@Override
	public int min(int... a) {
		int min = a[0];
		for (int i : a) {
			if (i < min) 
				min = i;
		}
		return min;
	}

	
}
