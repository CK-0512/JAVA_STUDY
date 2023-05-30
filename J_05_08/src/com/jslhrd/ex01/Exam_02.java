package com.jslhrd.ex01;

public class Exam_02 {
	public static void main(String[] args) {
		AA aa = new AA() {//익명구현객체
			
			@Override
			public void test01() {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void test02() {
				// TODO Auto-generated method stub
				
			}
			
			//void aa() {} 새로운 메소드 추가 불가
			
		};
		aa.test01();
		aa.test02();
	}
}
