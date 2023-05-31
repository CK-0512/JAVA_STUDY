package com.jslhrd.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Student> set = new HashSet<>();

		while (true) {
			System.out.print("입력 : ");
			String reg = sc.nextLine();
			String[] regBits = reg.split(",");
			if (regBits[0].equals("0000"))
				break;
			if (!Pattern.matches("\\d{4}", regBits[0])) {
				System.out.println("학번입력오류");
				continue;
			}
			int stdNum = Integer.parseInt(regBits[0]);
			String name = regBits[1];
			int kor = Integer.parseInt(regBits[2]);
			int eng = Integer.parseInt(regBits[3]);
			int mat = Integer.parseInt(regBits[4]);
			int tot = kor + eng + mat;
			double avg = (int)(tot / 3. * 10 + 0.5) / 10.;
			
			Student std = new Student(stdNum, name, kor, eng, mat);
			std.setTot(tot);
			std.setAvg(avg);
			boolean bool = set.add(std);
			if(!bool) {
				System.out.println("이미등록된 학생입니다.");
				continue;
			}
		}
		
		System.out.println("학번	이름	국어	영어	수학	총점	평균");
		for (Object obj : set) {
			System.out.println(obj);
		}
		
		List<Student> setList = new ArrayList<>(set);
		Collections.sort(setList);
		
		System.out.println("학번순 출력");
		System.out.println("학번	이름	국어	영어	수학	총점	평균");
		for (Object obj : setList) {
			System.out.println(obj);
		}
	}
}