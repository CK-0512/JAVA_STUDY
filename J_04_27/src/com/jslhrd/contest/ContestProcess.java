package com.jslhrd.contest;

import java.util.Scanner;

public class ContestProcess {
	private Member[] members = new Member[10];
	private MemberScore[] membersScore = new MemberScore[10];
	private int cntMember;
	private int cntScore;

	public void memberRegister(Scanner sc) {
		while (cntMember < 10) {
			System.out.print("등록 : ");
			int num = sc.nextInt();
			if (num == 0) {
				break;
			}
			
			if (num < 1000 || num > 9999) {
				System.out.println("참가번호는 4자리 입니다.");
				continue;
			}
			
			Member memberAlready = null;
			for (int i = 0; i < cntMember; i ++) {
				if (num == members[i].getNum()) {
					memberAlready = members[i];
				}
			}
			if (memberAlready != null) {
				System.out.println("이미 등록된 참가자입니다.");
				continue;
			}
			
			String name = sc.next();
			String gender = sc.next();
			String phoneNumber = sc.next();
			String type = sc.next();
			Member member = new Member (num, name, gender, phoneNumber, type);
			members[cntMember] = member;
			cntMember++;
		}
	}

	public void scoreRegister(Scanner sc) {
		while (cntScore < cntMember) {
			System.out.print("등록 : ");
			int memberNum = sc.nextInt();
			if (memberNum == 0) {
				break;
			}
			
			Member memberAlready = null;
			for (int i = 0; i < cntMember; i ++) {
				if (memberNum == members[i].getNum()) {
					memberAlready = members[i];
				}
			}
			if (memberAlready == null) {
				System.out.println("등록된 참가자가 없습니다.");
				continue;
			}
			
			MemberScore scoreAlready = null;
			for (int i = 0; i < cntScore; i++) {
				if (memberNum == membersScore[i].getMemberNum()) {
					scoreAlready = membersScore[i];
				}
			}
			if (scoreAlready != null) {
				System.out.println("이미 등록된 채점정보입니다.");
				continue;
			}
			
			int[] score = new int[9];
			for (int i = 0; i < 5; i++) {
				score[i] = sc.nextInt();
			}
			
			MemberScore memberScore = new MemberScore(memberNum, score);
			memberScore.setMemberName(memberAlready.getName());
			memberScore.setMemberType(memberAlready.getType());
			membersScore[cntScore] = memberScore;
			cntScore++;
			if (cntScore == cntMember) {
				System.out.println("모든 채점 정보가 등록되었습니다.");
			}
		}
	}
	
	private void scoreCalculate() {
		int[] score = new int[9];
		for (int i = 0; i < cntScore; i++) {
			score = membersScore[i].getScore();
			int max = score[0];
			int min = score[0];
			int sum = 0;
			for (int j = 1; j < 5; j++) {
				if (score[j] > max) {
					max = score[j];
				} else if (score[j] < min) {
					min = score[j];
				}
				sum += score[j];
			}
			sum = sum - max - min;
			score[5] = max;
			score[6] = min;
			score[7] = sum;
			score[8] = sum / 3;
			membersScore[i].setScore(score);
		}
	}

	public void memberPrint() {
		if (cntMember == 0) {
			System.out.println("등록된 참가자가 없습니다.");
			return;
		}
		
		System.out.println("참가자 정보 출력");
		System.out.println("참가번호	이름	성별	전화번호	참가부문");
		for (int i = 0; i < cntMember; i++) {
			System.out.printf("%d		%s	%s	", members[i].getNum(), members[i].getName(), members[i].getGender());
			System.out.printf("%s	%s\n", members[i].getPhoneNumber(), members[i].getType());
		}
	}

	public void scorePrint() {
		if (cntScore == 0) {
			System.out.println("등록된 채점 정보가 없습니다.");
			return;
		}
		
		scoreCalculate();
		
		System.out.println("채점 정보 출력");
		System.out.println("참가번호	이름	참가부문	점수1	점수2	점수3	점수4	점수5	최대	최소	총점	평균");
		for (int i = 0; i < cntScore; i++) {
			System.out.printf("%d		%s	%s		", membersScore[i].getMemberNum(), membersScore[i].getMemberName(), membersScore[i].getMemberType());
			for (int score : membersScore[i].getScore()) {
				System.out.printf("%d	", score);
			}
			System.out.println();
		}
	}

}
