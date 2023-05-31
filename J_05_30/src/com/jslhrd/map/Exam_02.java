package com.jslhrd.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exam_02 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("A", 95);
		map.put("B", 75);
		map.put("C", 97);
		map.put("E", 67);
		map.put("F", 91);
		map.put("D", 83);
		//키만추출
		Set<String> keySet = map.keySet();
		//키에 해당하는 값 출력
		int sum = 0;
		for(String key : keySet) {
			int value = map.get(key);
			sum += value;
			System.out.println(key + " : " + value);
		}
		System.out.println("합계 : " + sum);
	}
}