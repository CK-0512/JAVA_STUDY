package com.jslhrd.wrapper;
// 기본 데이터 타입 : 
// boolean -> Boolean, byte -> Byte, char -> Character, short -> Short
// int -> Integer, long -> Long, float -> Float, double -> Double
public class Exam_01 {
	public static void main(String[] args) {
		// 포장객체-> 래퍼클래스.valueOf()
		Integer in = Integer.valueOf(100);
		Character ch = Character.valueOf('A');
		//기본타입으로 변환  객체.기본타입Value()
		int i = in.intValue();
		char c = ch.charValue();
		
	}
}
