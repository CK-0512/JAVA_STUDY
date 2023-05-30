package com.jslhrd.arrays;

import java.util.Arrays;

class User implements Comparable<User> {
	String name;
	int age;

	User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override // 문자기준
	public int compareTo(User o) {
		return name.compareTo(o.name);// 오름차순
		//return o.name.compareTo(name);// 내림차순
	}
	
/*	@Override // 숫자기준
	public int compareTo(User o) {
		return Integer.compare(age, o.age);// 오름차순
		//return Integer.compare(o.age, age);// 내림차순
	}*/
	
	@Override
	public String toString() {
		return name + "\t" + age;
	}
}

public class Exam_04 {
	public static void main(String[] args) {
		User[] user = new User[5];
		user[0] = new User("이학생", 28);
		user[1] = new User("박학생", 28);
		user[2] = new User("강학생", 28);
		user[3] = new User("오학생", 28);
		user[4] = new User("김학생", 28);
		// 출력
		System.out.println(Arrays.toString(user));
		
		for (User u : user) {
			System.out.println(u.toString());
		}
		Arrays.sort(user);
		System.out.println(Arrays.toString(user));
		
		User u1 = new User("오학생", 28);
		int index = Arrays.binarySearch(user, u1);
		System.out.println(index);
	}
}
