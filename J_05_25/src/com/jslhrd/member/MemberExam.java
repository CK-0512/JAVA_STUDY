package com.jslhrd.member;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MemberExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Member> members = new ArrayList<>();
		
		while (true) {
			System.out.print("멤버 등록 : ");
			String reg = sc.nextLine();
			String[] regBits = reg.split(" ");
			
			if (regBits[0].equals("end"))
				break;
			int id = Integer.parseInt(regBits[0]);
			String name = regBits[1];
			String email = regBits[2];
			
			Member member = new Member(id, name, email);
			if (members.contains(member)) {
				System.out.println("이미 등록된 멤버입니다.");
				continue;
			}
				
			members.add(member);
		}
		
		Collections.sort(members);
		System.out.println("아이디	이름	이메일");
		for (Member m : members) {
			System.out.println(m);
		}
	}
}