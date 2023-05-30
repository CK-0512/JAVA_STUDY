package com.jslhrd.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Exam_01 {
	public static void main(String[] args) {
		Map map = new HashMap();
		//저장
		map.put("A", 90);
		map.put("D", 77);
		map.put("C", 95);
		map.put("F", 84);
		map.put("B", 91);
		System.out.println(map);
		map.put("A", 87);//중복되는 키 들어오면 값교체
		System.out.println(map);
		
		//키를 이용한 값 검색
		System.out.println("Key A : " + map.get("A"));
		//크기(객체 수)
		System.out.println("map size : " + map.size());
		//비어있는지
		System.out.println("map empty : " + map.isEmpty());
		//키가 포함되어 있는지
		System.out.println("map key contains : " + map.containsKey("A"));
		//값이 포함되어 있는지
		System.out.println("map value contains : " + map.containsValue(87));
		//값만 추출
		Collection<Integer> value = map.values();
		System.out.println("values : " + value);
	}
}
