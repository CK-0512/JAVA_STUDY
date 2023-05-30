package com.jslhrd.list;

import java.util.*;

public class Exam_01 {
	public static void main(String[] args) {
		//List list = new List();
		List list = new ArrayList();
		//리스트가 비어있는지 검사
		boolean flag = list.isEmpty();//비어있으면 true
		if(flag) {
			System.out.println("리스트가 비어있음");
		}
		ArrayList aList = new ArrayList<>();
		//추가
		flag = list.add(1234);
		System.out.println("추가 성공 : " + flag);
		
		list.add("Java");
		list.add(3.14);
		list.add(true);
		//리스트 내용 확인
		System.out.println("list : " + list);
		//리스트에 저장된 객체 수
		int cnt = list.size();
		System.out.println("list 객체 수 : " + cnt);
		
		//리스트에 저장된 객체 중 특정위치의 객체 반환(꺼내기) get(위치)
		int score = (int)list.get(0);
		System.out.println("0번요소 객체 : " + score);
		
		list.add(1, "김사원");
		System.out.println("list : " + list);
		
	}
}
