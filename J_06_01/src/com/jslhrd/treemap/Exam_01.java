package com.jslhrd.treemap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Exam_01 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1109, "김학생");
		map.put(1102, "공학생");
		map.put(1103, "강학생");
		map.put(1107, "혹학생");
		map.put(1108, "박학생");
		map.put(1112, "이학생");
		
		TreeMap<Integer, String> tmap = new TreeMap<>();
		tmap.put(1109, "김학생");
		tmap.put(1102, "공학생");
		tmap.put(1103, "강학생");
		tmap.put(1107, "혹학생");
		tmap.put(1108, "박학생");
		tmap.put(1112, "이학생");
		
		System.out.println("map : " + map);
		System.out.println("tmap : " + tmap);
	}
}
