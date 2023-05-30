package com.jslhrd.stringbuffer;

public class Exam_01 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();//기본크기 16바이트, 최대크기는 자동 변환
		StringBuffer sb2 = new StringBuffer(10);//10바이트
		StringBuffer sb3 = new StringBuffer("Korea");//21바이트(16 + 5)
		
		System.out.println("sb1 : 실제크기 = " + sb1.capacity());
		System.out.println("sb2 : 실제크기 = " + sb2.capacity());
		System.out.println("sb3 : 실제크기 = " + sb3.capacity());
		sb1.append("안녕하세요");
		sb1.append("Hello World");
		sb1.append("jslhrd.korea");
		System.out.println("sb1 : " + sb1);
		System.out.println("sb1.length : " + sb1.length());
		System.out.println("sb1 : 실제크기 = " + sb1.capacity());
	}
}
