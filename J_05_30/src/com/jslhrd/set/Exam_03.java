package com.jslhrd.set;

import java.util.HashSet;
import java.util.Set;

class AA {
	int num;
	String name;
	AA(int num, String name) {
		this.name = name;
		this.num = num;
	}
	@Override
	public String toString() {
		return num + "," + name;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof AA) {
			return ((AA) obj).num == num;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return num + name.hashCode();
	}
}
public class Exam_03 {
	public static void main(String[] args) {
		Set<AA> set = new HashSet<>();
		boolean bool = set.add(new AA(1, "aaa"));
		System.out.println("삽입성공 : " + bool);
		
		bool = set.add(new AA(2, "bbb"));
		System.out.println("삽입성공 : " + bool);
		
		boolean flag = set.contains(new AA(2, "bbb"));
		System.out.println("포함유무 : " + flag);
		
		bool = set.add(new AA(1, "aaa"));
		System.out.println("삽입성공 : " + bool);
	
		System.out.println("set : " + set);
	}
}
