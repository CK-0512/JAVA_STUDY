package com.jslhrd.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AA implements Comparable<AA>{
	int num;
	String name;
	int age;
	AA(){}
	AA (int num, String name, int age) {
		this.num = num;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return num + "\t" + name + "\t" + age;
	}
	@Override
	public int compareTo(AA o) {
		return Integer.compare(num, o.num);
		//return name.compareTo(o.name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof AA) {
			AA a = (AA)obj;
			return a.num == num;
		} else {
			return false;
		}
	} 
}

public class Exam_04 {
	public static void main(String[] args) {
		List<AA> list = new ArrayList<>();
		
		list.add(new AA(5, "zxcx", 30));
		list.add(new AA(4, "asdx", 29));
		list.add(new AA(7, "qwer", 35));
		list.add(new AA(1, "nbx", 32));
		list.add(new AA(3, "bvcx", 38));
		
		AA a = new AA(1, "sdf", 20);		
		boolean bool = list.contains(a);
		if (!bool) 
			list.add(a);
		
		System.out.println("list : " + list);
		
		System.out.println("번호\t이름\t나이");
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("번호\t이름\t나이");
		for (AA aa : list) {
			System.out.println(aa);
		}
		
		// --정렬
		Collections.sort(list);
		System.out.println("sort : " + list);
	}
}