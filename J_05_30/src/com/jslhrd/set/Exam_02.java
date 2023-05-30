package com.jslhrd.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Exam_02 {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		set.add("Java");
		set.add("DataBase");
		set.add("Servlet");
		set.add("Spring");
		set.add("JSP");
		set.add(12324);
		set.add(3.14);
		// size(), isEmpty(), remove(), clear()
		System.out.println("set list : " + set);
		
		int size = set.size();
		boolean bool = set.contains("JSP");
		
		//확장 for()
		System.out.println("확장 for");
		for (Object obj : set) {
			System.out.print(obj + " ");
		}
		System.out.println();
		
		//반복자(Iterator)
		System.out.println("Iter");
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			Object obj = iter.next();
			System.out.print(obj + " ");
		}
		System.out.println();
		
		//Set => List로 변환
		List list = new ArrayList(set);
		System.out.println("List : " + list);
	}
}
