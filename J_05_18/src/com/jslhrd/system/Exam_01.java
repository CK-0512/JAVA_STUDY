package com.jslhrd.system;
// 프로그램종료 : exit() // 0 -> 정상종료
public class Exam_01 {
	public static void main(String[] args) {
		//System.exit(0);
		for (int i = 0; i < 10000; i++) {
			System.out.println(i);
			if (i == 10) 
				System.exit(0);
		}
	}
}
