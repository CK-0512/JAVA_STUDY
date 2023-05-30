package com.jslhrd.object;

public class Exam_05 {
	public static void main(String[] args) {
		Person p1 = new Person(1, "홍길동", 30);
		Person p2 = new Person(1, "홍길동", 28);
		Person p3 = new Person(2, "홍길동", 25);
		// 객체 출력
		System.out.println("p1 : " + p1);
		System.out.println("p2 : " + p2);
		System.out.println("p3 : " + p3);
		
		// 1. 번호와 이름이 같으면 같은 객체로 판단
		System.out.println("p1, p2는 같은 객체인가 " + (p1 == p2));
		System.out.println("p1, p2는 같은 객체인가 " + (p1.equals(p2)));
		System.out.println("p1, p3는 같은 객체인가 " + (p1.equals(p3)));
		
		// 2. 두 객체의 해쉬코드가 같으면 같은 객체로 판단
		// 해시코드는 이름의 해시코드 + 번호로 구성한다
		System.out.println("p1, p2는 같은 객체인가 " + (p1.hashCode() == p2.hashCode()));
		System.out.println("p1, p3는 같은 객체인가 " + (p1.hashCode() == p3.hashCode()));
	}
}
