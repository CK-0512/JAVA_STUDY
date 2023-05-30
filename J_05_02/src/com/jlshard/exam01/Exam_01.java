package com.jlshard.exam01;

class AA {
	
}

//추상클래스
abstract class Person {
	String name;
	boolean gender;
	int age;
	
	Person(String name, boolean gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	void personPrint() {
		System.out.println(name + "\t" + gender + "\t" + age);
	}
	abstract void namePrint();
	abstract String getGender();
}

class ChildPerson extends Person {
	int a;
	
	ChildPerson() {
		super("aaaa", true, 30);
	}
	
	ChildPerson(String name, boolean gender, int age, int a) {
		super(name, gender, age);
		this.a = a;
	}

	void namePrint() {
		
	}
	
	String getGender() {
		String g = "남자";
		if(gender == false) {
			g = "여자";
		}
		return g;
	}
}

public class Exam_01 {
	public static void main(String[] args) {
		AA aa = new AA();
		//Person p = new Person();
		ChildPerson cp = new ChildPerson("asdf", false, 32, 43);
		cp.personPrint();
		cp.namePrint();
		System.out.printf("성별은 : %s\n", cp.getGender());
		
		Person p = new ChildPerson("asd", true, 52, 12);
		p.personPrint();
		p.namePrint();
		System.out.printf("성별은 : %s", p.getGender());
	}
}
