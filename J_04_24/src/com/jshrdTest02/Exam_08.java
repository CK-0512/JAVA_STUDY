package com.jshrdTest02;

public class Exam_08 {
	public static void main(String[] args) {
		Persion p1 = new Persion();
//		p1.ssn = 4536;
//		p1.name = "임꺽정";
//		p1.age = 26;
//		p1.gender = false;
		
		p1.setSsn(1234);
		p1.setName("임상수");
		p1.setGender(false);
		p1.setAge(42);
		
		p1.persionPrint();
		
		System.out.println("사원이름 : " + p1.getName());
		
		System.out.println("-------------------------------");
		
		Persion p2 = new Persion(1234, "홍길동", 30, true);
		p2.persionPrint(); 
	}
}
