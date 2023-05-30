package com.jslhrd.employee;

public class Employee {
	String num;
	String name;
	String birth;
	String age;
	String gender;
	String salay;
	
	Employee(String num, String name, String birth, String gender, String salay) {
		this.num = num;
		this.name = name;
		this.birth = birth;
		this.gender = gender;
		this.salay = salay;
	}
	
	@Override
	public String toString() {
		return num + "\t\t" + name + "\t" + birth + "\t" + age + "\t" + gender + "\t" + salay;
	}
}
