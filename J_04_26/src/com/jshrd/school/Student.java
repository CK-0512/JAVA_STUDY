package com.jshrd.school;

public class Student {
	private int num;
	private String name;
	private String gender;
	private String phoneNumber;
	
	public Student() {};
	
	public Student(int num, String name, String gender, String phoneNumber) {
		this.num = num;
		this.name = name;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
	}

	public int getNum() {
		return num;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
}
