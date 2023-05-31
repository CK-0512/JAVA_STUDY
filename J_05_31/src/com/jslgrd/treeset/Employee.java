package com.jslgrd.treeset;

public class Employee implements Comparable<Employee> {
	private int employeeNum;
	private String name;
	private String gender;
	private String birth;
	private int age;
	
	public Employee() {}
	public Employee(int employeeNum, String name, String gender, String birth) {
		this.employeeNum = employeeNum;
		this.name = name;
		if (gender.equalsIgnoreCase("m"))
			this.gender = "남자";
		else if (gender.equalsIgnoreCase("f"))
			this.gender = "여자";
		this.birth = birth;
		this.age = 2023 - Integer.parseInt(birth.substring(0, 4)) + 1;
	}
	
	@Override
	public int compareTo(Employee o) {
		return Integer.compare(employeeNum, o.employeeNum);
	}
	
	@Override
	public String toString() {
		return employeeNum + "\t" + name + "\t" + gender + "\t" + birth + "\t" + age;
	}
	
	public int getEmployeeNum() {
		return employeeNum;
	}
	public void setEmployeeNum(int employeeNum) {
		this.employeeNum = employeeNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
