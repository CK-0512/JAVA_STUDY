package com.jslgrd.treeset;

import java.util.TreeSet;

class Person implements Comparable<Person> {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Person o) {
		//이름 기준
		//return name.compareTo(o.name);
		
		//나이 기준
		return Integer.compare(age, o.age);
	}
	
	@Override
	public String toString() {
		return name + "," + age;
	}
}

public class Exam_02 {
	public static void main(String[] args) {
		TreeSet<Person> pSet = new TreeSet<>();
		
		pSet.add(new Person("김학생", 30));
		pSet.add(new Person("이학생", 25));
		pSet.add(new Person("박학생", 38));
		pSet.add(new Person("강학생", 32));
		pSet.add(new Person("오학생", 22));
		
		System.out.println(pSet);
		
		System.out.println("나이가 가장 많은 학생 : " + pSet.last());
		System.out.println("나이가 가장 적은 학생 : " + pSet.first());
		
		//전체 출력
		for(Person p : pSet) {
			System.out.println(p);
		}
	}
}
