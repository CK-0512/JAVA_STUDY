package com.jslhrd.lambda;

@FunctionalInterface
interface MyFunc2 {
	int method(int x, int y);
}

public class Exam_02 {
	public static void main(String[] args) {
		MyFunc2 fi = null;
		
		fi = (int x, int y) -> {
			if (x > y)
				return x;
			else
				return y;
		};
		System.out.println(fi.method(4, 7));
		
		fi = (x, y) -> {
			if (x > y)
				return y;
			else
				return x;
		};
		System.out.println(fi.method(2, 8));
	}
}
