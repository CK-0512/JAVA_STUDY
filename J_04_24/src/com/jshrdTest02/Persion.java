package com.jshrdTest02;

import java.util.Objects;

//setter/getter -- 메소드
public class Persion {
	//멤버필드(변수)
	private int ssn;//주민번호
	private String name;//이름
	private int age;//나이
	private boolean gender;//성별(true : 남자//false : 여자)
	public Persion() {}
	public Persion(int ssn, String name, int age, boolean gender) {
		this.ssn = ssn;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	public void persionPrint() {
		String str = "여자";
		if(gender)
			str = "남자";
		System.out.printf("%d	%s	%d	%s\n", ssn, name, age, str);
	}
}
