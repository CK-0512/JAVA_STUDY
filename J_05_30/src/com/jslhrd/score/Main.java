package com.jslhrd.score;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Student, Score> map = new HashMap<>();
		
		while(true) {
			System.out.print("입력 : ");
			String reg = sc.nextLine();
			String[] regBits = reg.split(",");
			if(regBits[0].equals("0000"))
				break;
			if(!Pattern.matches("\\d{4}", regBits[0])) {
				System.out.println("입력오류");
				continue;
			}
			int stdNum = Integer.parseInt(regBits[0]);
			String name = regBits[1];
			int kor = Integer.parseInt(regBits[2]);
			int eng = Integer.parseInt(regBits[3]);
			int mat = Integer.parseInt(regBits[4]);
			int tot = kor + eng + mat;
			double avg = (int)(tot / 3. * 10 + 0.5) / 10.;
			
			Student std = new Student(stdNum, name);
			if(map.containsKey(std)) {
				System.out.println("이미 등록된 학생입니다.");
				continue;
			}
			Score score = new Score(kor, mat, eng);
			score.setTot(tot);
			score.setAvg(avg);
			map.put(std, score);
		}
		
		Set<Student> set = map.keySet();
		System.out.println("학생 정보 출력");
		System.out.println("학번	이름	국어	영어	수학	총점	평균");
		for(Student std : set) {
			System.out.print(std + "\t");
			System.out.print(map.get(std));
			System.out.println();
		}
		
		Collection<Score> col = map.values();
		int sum = 0;
		double avg = 0;
		int maxTot;
		int minTot;
		for(Score value : col) {
			sum += value.getTot();
		}
		avg = (int)(sum/(double)map.size() * 10 + 0.5) / 10.;
		maxTot = (Collections.max(col)).getTot();
		minTot = (Collections.min(col)).getTot();
		
		System.out.printf("전체총점 : %d\n", sum);
		System.out.printf("전체평균 : %.1f\n", avg);
		System.out.printf("최고총점 : %d\n", maxTot);
		System.out.printf("최소총점 : %d\n", minTot);
	}
}
