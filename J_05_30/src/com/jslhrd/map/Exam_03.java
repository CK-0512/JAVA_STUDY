package com.jslhrd.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Exam_03 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("김학생", 90);
		map.put("이학생", 85);
		map.put("장학생", 74);
		map.put("박학생", 89);
		map.put("강학생", 97);
		map.put("윤학생", 78);
		
		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		System.out.println("이름	점수");
		while(iter.hasNext()) {
			String key = iter.next();
			int value = map.get(key);
			System.out.println(key + "	" + value);
		}
		
		//참가자 명단
		System.out.println("명단 : " + set);
		
		//점수만을 이용하여 총점, 평균, 최고, 최저
		Collection<Integer> values = map.values();
		int tot = 0;
		for(int x : values) {
			tot += x;
		}
		System.out.println("합계 : " + tot);
		System.out.println("평균 : " + tot/map.size());
		System.out.println("최고 : " + Collections.max(values));
		System.out.println("합계 : " + Collections.min(values));
		
		
	}
}
