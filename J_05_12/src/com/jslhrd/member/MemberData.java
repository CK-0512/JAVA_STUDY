package com.jslhrd.member;

import java.util.Scanner;

public class MemberData {

	Member[] members = new Member[10];
	Scanner sc = new Scanner(System.in);
	int cnt = 0;

	public void memberRegister() {
		while (cnt < 10) {
			System.out.print("자료입력 : ");
			String input = sc.nextLine();
			if (input.startsWith("end")) {
				break;
			}
			
			String[] inputBits = input.split(",");
			if (inputBits.length > 4) {
				System.out.println("입력 오류입니다.");
				break;
			}

			int num = Integer.parseInt(inputBits[0]);
			String name = inputBits[1];
			String sSNumber = inputBits[2];
			for (int i = 0; i < cnt; i++) {
				if (members[i].getsSNumber().equals(sSNumber)) {
					System.out.println("중복된 자료입니다.");
					break;
				}
			}
			String phoneNumber = inputBits[3];
			Member member = new Member(num, name, sSNumber, phoneNumber);

			int yearNum;
			String year;
			if (Integer.parseInt(sSNumber.substring(0, 2)) > 23) {
				yearNum = Integer.parseInt(19 + sSNumber.substring(0, 2));
				year = yearNum + "년";
			} else {
				yearNum = Integer.parseInt(20 + sSNumber.substring(0, 2));
				year = yearNum + "년";
			}
			String month = sSNumber.substring(2, 4) + "월";
			String day = sSNumber.substring(4, 6) + "일";
			String birth = year + month + day;
			member.setBirth(birth);

			String gender;
			if (Integer.parseInt(sSNumber.substring(7)) % 2 == 1)
				gender = "남성";
			else 
				gender = "여성";
			member.setGender(gender);
			
			int age = 2023 - yearNum + 1;
			member.setAge(age);
			
			members[cnt] = member;
		}
	}

	public void dataPrint() {
		System.out.println("이름	전화번호	생년월일	성별	나이");
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%s	%s	%s	", members[i].getName(), members[i].getPhoneNumber(), members[i].getBirth());
			System.out.printf("%s	%d\n", members[i].getGender(), members[i].getAge());
		}
		System.out.println();
		
		System.out.printf("평균 나이 : %d\n", avgAgeCal());
		sortMemberByAgeDESC();
		System.out.printf("나이가 가장 많은 회원 : %s	%s	%d\n", members[0].getName(), members[0].getPhoneNumber(), members[0].getAge());
		sortMemberByAgeASC();
		System.out.printf("나이가 가장 적은 회원 : %s	%s	%d\n", members[0].getName(), members[0].getPhoneNumber(), members[0].getAge());
	}
	
	public int avgAgeCal() {
		int sumAge = 0;
		for (int i = 0; i < cnt; i++) {
			sumAge += members[i].getAge();
		}
		return sumAge / cnt;
	}
	
	public Member sortMemberByAgeASC() {
		for (int i = 0; i < cnt - 1; i++) {
			for (int j = i + 1; j < cnt; j++) {
				if (members[i].getAge() > members[j].getAge()) {
					Member member = members[i];
					members[i] = members[j];
					members[j] = member;
				}
			}
		}
		return members[0];
	}
	
	public Member sortMemberByAgeDESC() {
		for (int i = 0; i < cnt - 1; i++) {
			for (int j = i + 1; j < cnt; j++) {
				if (members[i].getAge() < members[j].getAge()) {
					Member member = members[i];
					members[i] = members[j];
					members[j] = member;
				}
			}
		}
		return members[0];
	}

}
