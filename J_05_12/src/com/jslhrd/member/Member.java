package com.jslhrd.member;

public class Member {
	int number;
	String name;
	String sSNumber;
	String phoneNumber;
	String birth;
	String gender;
	int age;
	
	Member (int number, String name, String sSNumber, String phoneNumber) {
		this.number = number;
		this.name = name;
		this.sSNumber = sSNumber;
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member mem = (Member)obj;
			return sSNumber == mem.sSNumber;
		}
		return false;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getsSNumber() {
		return sSNumber;
	}

	public void setsSNumber(String sSNumber) {
		this.sSNumber = sSNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
