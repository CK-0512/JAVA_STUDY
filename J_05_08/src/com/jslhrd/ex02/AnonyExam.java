package com.jslhrd.ex02;

public class AnonyExam {
	public static void main(String[] args) {
		Anony an = new Anony();
		//익명 객체 필드
		an.field.run();
		//익명 객체 로컬변수
		an.exam01();
		//익명 객체 매개값 사용
		an.exam02(new Vehicle() {
			@Override
			public void run() {
				System.out.println("트럭이 달립니다.");
			}
		});
	}
}
