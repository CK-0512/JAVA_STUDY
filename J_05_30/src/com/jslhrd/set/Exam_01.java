package com.jslhrd.set;

import java.util.HashSet;
import java.util.Set;

//set : 순서가 없고, 중복불가
//동일 객체 : equals(), hashCode()
public class Exam_01 {
	public static void main(String[] args) {
		Set set = new HashSet();
		boolean bool = set.add("Java");
		System.out.println(bool);
		bool = set.add("Java");
		System.out.println(bool);
	}
}