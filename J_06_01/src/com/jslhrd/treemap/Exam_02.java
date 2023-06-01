package com.jslhrd.treemap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Exam_02 {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<>();
		
		scores.put(new Integer(87), "김학생");
		scores.put(90, "박학생");
		scores.put(80, "이학생");
		scores.put(70, "공학생");
		scores.put(58, "강학생");
		scores.put(97, "윤학생");
		
		//키 값 추출
		Set<Integer> keySet = scores.keySet();
		for(int key : keySet) {
			System.out.println(key + ":" + scores.get(key));
		}
		
		//Map.Entry : 키와 값이 쌍으로 묶인 형태
		Map.Entry<Integer, String> entry = null;
		entry = scores.firstEntry();
		System.out.println("가장 낮은 점수 : " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.lastEntry();
		System.out.println("가장 높은 점수 : " + entry.getKey() + "-" + entry.getValue());

		entry = scores.lowerEntry(95);
		System.out.println("95 아래 점수 : " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.higherEntry(95);
		System.out.println("95 위 점수 : " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.floorEntry(95);
		System.out.println("95이거나 바로 위 점수 : " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.ceilingEntry(95);
		System.out.println("95이거나 바로 아래 점수 : " + entry.getKey() + "-" + entry.getValue());
		
		while(!scores.isEmpty()) {
			entry = scores.pollFirstEntry();
			System.out.println(entry.getKey() + "-" + entry.getValue() + "(남은 객체수 : " + scores.size() + ")");
		}
	}
}
