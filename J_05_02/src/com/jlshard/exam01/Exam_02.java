package com.jlshard.exam01;

abstract class BB {
	String name;
	String birth;
	
	void namePrint() {
		System.out.printf("name = %s\n", name);
	}
	void birthPrint() {
		System.out.printf("birth = %s\n", birth);
	}
}

class ChildBB extends BB {
	
}

class ChildBBB extends BB {
	
}

public class Exam_02 {
	public static void main(String[] args) {
		BB b = new ChildBB();
		b.name = "ㅁㅇㄴㄹ";
		b.birth = "1999-05-12";
		b.namePrint();
		b.name = "xcvsd";
		b.birth = "1999-08-15";
		b = new ChildBBB();
		b.birthPrint();
	}
}
