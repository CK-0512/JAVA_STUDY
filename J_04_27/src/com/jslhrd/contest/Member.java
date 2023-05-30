package com.jslhrd.contest;

public class Member {
	private int num;
	private String name;
	private String gender;
	private String phoneNumber;
	private String type;

	public Member() {
	};

	public Member(int num, String name, String gender, String phoneNumber, String type) {
		this.num = num;
		this.name = name;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.type = type;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		switch (gender) {
		case "m":
		case "M":
			return "남성";
		case "f":
		case "F":
			return "여성";
		default:
			return null;
		}
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getType() {
		switch (type) {
		case "1" :
			return "댄스";
		case "2" :
			return "노래";
		case "3" :
			return "국악";
		default :
			return null;
		}
	}

	public void setType(String type) {
		this.type = type;
	}
}
