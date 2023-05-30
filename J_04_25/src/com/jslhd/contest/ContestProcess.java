package com.jslhd.contest;

import java.util.Scanner;

public class ContestProcess {
	
	private Contest[] contests = new Contest[10];
	private int cnt;
	
	public void contestRegister(Scanner sc) {
		cnt = 0;
		while (cnt < 10) {
			System.out.print("참가자 등록 : ");
			int num = sc.nextInt();
			
			if (num == 0) {
				break;
			}
			
			boolean flag = false;
			for (int i = 0; i < cnt; i++) {
				if (num == contests[i].getNum()) {
					flag = true;
				}
			}
			if (flag) {
				System.out.println("이미 등록된 참가자 입니다.");
				continue;
			}

			String name = sc.next();
			
			System.out.print("점수 등록 : ");
			int score[] = new int[7];
			for (int i = 0; i < score.length; i++) {
				score[i] = sc.nextInt();
			}
			Contest contest = new Contest(num, name, score);
			contests[cnt] = contest;
			cnt++;
		}
		calculateMaxMinSumAvg();
		contestRanked();
	}
	
	private void calculateMaxMinSumAvg() {
		for (int i = 0; i < cnt; i++) {
			int score[] = contests[i].getScore();
			int max = score[0];
			int min = score[0];
			int sum = 0;
			for (int j = 0; j < score.length; j++) {
				if (score[j] > max) {
					max = score[j];
				} else if (score[j] < min) {
					min = score[j];
				}
				sum += score[j];
			}
			contests[i].setScore(score);
			contests[i].setMax(max);
			contests[i].setMin(min);
			contests[i].setSum(sum - max - min);
			contests[i].setAvg((sum - max - min) / 5. );
		}
	}
	
	private void contestRanked() {
		for (int i = 0; i < cnt; i++) {
			contests[i].setRank(1);
			int rank = contests[i].getRank();
			for (int j = 0; j < cnt; j++) {
				if (contests[i].getSum() < contests[j].getSum()) {
					rank++;
				}
			}
			contests[i].setRank(rank);
		}
		contestSortByRank();
	}
	
	private void contestSortByRegister() {
		for (int i = 0; i < cnt; i++) {
			for (int j = i + 1; j < cnt; j++) {
				if (contests[i].getNum() > contests[j].getNum()) {
					Contest contest = contests[i];
					contests[i] = contests[j];
					contests[j] = contest;
				}
			}
		}
	}
	
	private void contestSortByRank() {
		for (int i = 0; i < cnt; i++) {
			for (int j = i + 1; j < cnt; j++) {
				if (contests[i].getRank() > contests[j].getRank()) {
					Contest contest = contests[i];
					contests[i] = contests[j];
					contests[j] = contest;
				}
			}
		}
	}

	public void contestPrintByRegister() {
		contestSortByRegister();
		System.out.println("입력 자료순 출력");
		System.out.println("참가번호	이름	점수1	점수2	점수3	점수4	점수5	점수6	점수7	최대	최소	합게	평균	순위");
		for (int i = 0; i < cnt; i++) {
			int score[] = contests[i].getScore();
			System.out.printf("%d		%s	", contests[i].getNum(), contests[i].getName());
			for (int j = 0; j < contests[i].getScore().length; j++) {
				System.out.printf("%d	", score[j]);
			}
			System.out.printf("%d	%d	%d	%.2f	%d\n", contests[i].getMax(), contests[i].getMin(), contests[i].getSum(), contests[i].getAvg(), contests[i].getRank());
		}
	}

	public void contestPrintByRank() {
		contestSortByRank();
		System.out.println("순위(성적)순 출력");
		System.out.println("참가번호	이름	점수1	점수2	점수3	점수4	점수5	점수6	점수7	최대	최소	합게	평균	순위");
		for (int i = 0; i < cnt; i++) {
			int score[] = contests[i].getScore();
			System.out.printf("%d		%s	", contests[i].getNum(), contests[i].getName());
			for (int j = 0; j < contests[i].getScore().length; j++) {
				System.out.printf("%d	", score[j]);
			}
			System.out.printf("%d	%d	%d	%.2f	%d\n", contests[i].getMax(), contests[i].getMin(), contests[i].getSum(), contests[i].getAvg(), contests[i].getRank());
		}
	}

}
