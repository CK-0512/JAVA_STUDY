package com.jslhrd.list;

import java.util.ArrayList;
import java.util.List;

//제너릭타입 <E>
public class Exam_02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		//List<String> list = new ArrayList();
		//list.add(1234);
		list.add("1234");
		list.add("abcd");
		list.add("3.4");
		list.add(String.valueOf(1234));
		System.out.println("list : " + list);
		//0번 요소의 객체
		String s = list.get(0);
		
		//1번객체 변경
		list.set(1, "김학생");
		System.out.println("list : " + list);
		
		//객체 삭제 remover()
		String name = list.remove(0);
		System.out.println("삭제 : " + name);
		
		//객체 포함유무 true/false
		boolean bool = list.contains("김학생");
		if (bool)
			System.out.println("김학생이 존재");
		else
			System.out.println("김학생이 없음");
		
		//리스트 전체삭제
		list.clear();
	}
}