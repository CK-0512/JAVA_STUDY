package com.jslgrd.treeset;

import java.util.TreeSet;

// 검색기능 추가(자동정렬) : TreeSet, TreeMap
public class Exam_01 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		set.add(17);
		set.add(7);
		set.add(5);
		set.add(8);
		set.add(13);
		set.add(20);
		
		System.out.println(set);
		
		int score;
		score = set.first();
		System.out.println(score);
		
		score = set.last();
		System.out.println(score);
		
		while(!set.isEmpty()) {
			score = set.pollFirst();
			System.out.println(set);
		}
	}
}
