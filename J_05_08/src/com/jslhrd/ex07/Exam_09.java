package com.jslhrd.ex07;
class Employee {
	String name;
	void print() {
		try {
			if(name.equals("aaaa")) {
				System.out.printf("name = %s\n", name);
			} else {
				System.out.printf("name = null\n");
			}
		} catch (NullPointerException ne) {
			//예외 출력
//			ne.printStackTrace();
//			System.out.println(ne.getMessage());
			System.out.println("이름을 넣어주세요");
		}
		
	}
}
public class Exam_09 {
	public static void main(String[] args) {
		Employee em = new Employee();
		em.name = "aaaa";
		em.print();
	}
}
