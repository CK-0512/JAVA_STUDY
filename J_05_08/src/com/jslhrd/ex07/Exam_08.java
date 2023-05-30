package com.jslhrd.ex07;

import java.io.IOException;

public class Exam_08 {
	public static void main(String[] args) {
		try {
			int ch = System.in.read();
			System.out.printf("입력된 문자는 %d\n", ch);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.print("프로그램을 종료합니다");
		}
	}
}

