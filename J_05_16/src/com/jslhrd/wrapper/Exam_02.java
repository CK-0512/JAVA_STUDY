package com.jslhrd.wrapper;
// 오토박싱 & 오토언박싱
public class Exam_02 {
	public static void main(String[] args) {
		// 박싱
		int n = 300; // 기본타입
		Integer intN = n;
		//Integer a = new Integer(n);
		// 언박싱
		int valN = intN;
		int valNN = intN.intValue();
	}
}
