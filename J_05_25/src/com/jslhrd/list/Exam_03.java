package com.jslhrd.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Exam_03 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		//list.add((new Integer(90));
		
		list.add(90);
		list.add(80);
		list.add(50);
		list.add(70);
		list.add(60);
		list.add(20);
		
		//확인
		System.out.println("list : " + list);
		
		int sum = 0;
		System.out.println("---- for() ----");
		for (int i = 0; i < list.size(); i++) {
			int score = list.get(i);
			sum += score;
			System.out.print(score + " ");
		}
		System.out.println("sum : " + sum);
		
		System.out.println("---- 확장 for() ----");
		sum = 0;
		for (int score : list) {
			sum += score;
			System.out.print(score + " ");
		}
		System.out.println("sum : " + sum);
		
		System.out.println("---- 반복자 Iterator ----");
		sum = 0;
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			int score = iter.next();
			sum += score;
			System.out.print(score + " ");
		}
		System.out.println("sum : " + sum);
		
		//정렬 후 출력-오름차순
		Collections.sort(list);
		System.out.println("list : " + list);
		
		//내림차순
		Collections.reverse(list);
		System.out.println("list : " + list);
		
		//포함유무
		boolean bool = list.contains(90);
		if (bool) {
			int index = list.indexOf(90);
			System.out.println("90 위치 : " + index);
		}
	}
}