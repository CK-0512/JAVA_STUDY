package com.jslhrd.ex07;

import java.io.IOException;

//예외 발생 : throw
//예외미루기 : throws
public class Exam_10 {
	public static void main(String[] args) throws IOException {
			int ch = System.in.read();
			System.out.printf("입력된 문자는 %d\n", ch);
	}
}
