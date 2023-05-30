package com.jslhrd.object;

import java.util.Scanner;

public class Exam_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person person[] = new Person[10];
		int cnt;
		for (cnt = 0; cnt < 10; cnt++) {
			System.out.print("사원 등록 : ");
			int num = sc.nextInt();
			if (num == 0)
				break;
			String name = sc.next();
			int age = sc.nextInt();
			//중복체크
			Person p = new Person(num, name, age);
			boolean flag = true;
			for (int i = 0; i < cnt; i++) {
				if (person[i].equals(p)) {
					System.out.println("중복된 사원입니다.");
					flag = false;
					break;
				}
			}
			if (flag)
				person[cnt] = p;
			else 
				cnt--;
		}
		//출력
		System.out.println("번호\t이름\t나이");
		for (int i = 0; i < cnt; i ++) {
			System.out.println(person[i]);
		}
	}
}
