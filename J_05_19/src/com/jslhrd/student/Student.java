package com.jslhrd.student;

public class Student implements Comparable<Student> {
	int num;
	String name;
	String gender;
	String phoneNumber;
	
	public Student() {}
	
	public Student(int num, String name, String gender, String phoneNumber) {
		this.num = num;
		this.name = name;
		if (gender.equals("M")) 
			this.gender = "남자";
		else if (gender.equals("F"))
			this.gender = "여자";
		else 
			this.gender = "성별 오류";
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return num + "\t" + name + "\t" + gender + "\t" + phoneNumber;
	}

	@Override
	public int compareTo(Student o) {
		return Integer.compare(num, o.num);
	}
}
