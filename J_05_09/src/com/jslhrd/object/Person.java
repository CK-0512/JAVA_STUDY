package com.jslhrd.object;

public class Person {
	int num;
	String name;
	int age;
	Person () {}
	Person (int num, String name, int age) {
		this.num = num;
		this.name = name;
		this.age = age;	
	}
	
	@Override
	public String toString() {
		return num + "\t" + name + "\t" + age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person)obj;
			return p.num == num && p.name.equals(name);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + num;
	}
}
