package com.jslhrd.contest.controller;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.jslhrd.contest.service.ContestService;
import com.jslhrd.contset.dto.EntryDTO;
import com.jslhrd.contset.dto.ScoreDTO;

public class ContestController {
	private ContestService contestService;
	private Scanner sc;
	private DecimalFormat df;

	public ContestController(Scanner sc) {
		this.sc = sc;
		this.contestService = new ContestService();
		this.df = new DecimalFormat("0000");
	}

	public void entryRegister() {
		EntryDTO entryDTO;
		String aleadyJumin = null;

		System.out.println("참가자 정보 등록 화면");
		int entry_no = contestService.getLastEntryNo() + 1;
		System.out.printf("참가번호 : %s\n", df.format(entry_no));
		System.out.print("성명 : ");
		String entry_name = sc.next();
		System.out.print("주민번호 : ");
		String entry_jumin = sc.next();
		if (!entry_jumin.matches("^\\d{13}")) {
			System.out.println("잘못된 주민번호 형식입니다.");
			return;
		}
		for (String jumin : contestService.getJumin()) {
			if (jumin.equals(entry_jumin))
				aleadyJumin = jumin;
		}
		if (aleadyJumin != null) {
			System.out.println("이미 등록된 주민번호입니다.");
			return;
		}
		System.out.print("참가부문 : ");
		String entry_type = sc.next();
		System.out.print("지역 : ");
		String entry_area = sc.next();

		entryDTO = new EntryDTO();
		entryDTO.setEntry_no(df.format(entry_no));
		entryDTO.setEntry_name(entry_name);
		entryDTO.setEntry_jumin(entry_jumin);
		entryDTO.setEntry_type(entry_type);
		entryDTO.setEntry_area(entry_area);

		contestService.entryRegister(entryDTO);

		String type = "";

		System.out.println("참가번호	성명	주민번호	참가부문	지역");
		for (EntryDTO dto : contestService.getEntries()) {
			switch (dto.getEntry_type()) {
			case "1":
				type = "기악";
				break;
			case "2":
				type = "민요";
				break;
			case "3":
				type = "무용";
				break;
			case "4":
				type = "판소리";
				break;
			}

			System.out.printf("%s\t%s\t%s\t", df.format(Integer.valueOf(dto.getEntry_no().trim())), dto.getEntry_name(),
					dto.getEntry_jumin());
			System.out.printf("%s\t%s\n", type, dto.getEntry_area());
		}
	}

	public void scoreRegister() {
		ScoreDTO scoreDTO;

		System.out.println("경연점수 등록 화면");
		System.out.print("참가번호 : ");
		String entry_no = sc.next();
		String existsNo = contestService.getExistsEntryNo(entry_no);
		if (existsNo == null) {
			System.out.println("참가자 번호가 존재하지 않습니다.");
			return;
		}
		System.out.println("심사위원 심사점수(1~100)");
		System.out.print("김심사 : ");
		int score1 = sc.nextInt();
		System.out.print("이심사 : ");
		int score2 = sc.nextInt();
		System.out.print("박심사 : ");
		int score3 = sc.nextInt();
		System.out.print("황심사 : ");
		int score4 = sc.nextInt();
		System.out.print("조심사 : ");
		int score5 = sc.nextInt();

		int[] scores = { score1, score2, score3, score4, score5 };
		Arrays.sort(scores);
		
		int s_max = scores[0];
		int s_min = scores[4];

		int s_tot = Arrays.stream(scores).sum() - s_max - s_min;
		double s_avg = s_tot / 3.;

		scoreDTO = new ScoreDTO();
		scoreDTO.setEntry_no(entry_no);
		scoreDTO.setScore1(score1);
		scoreDTO.setScore2(score2);
		scoreDTO.setScore3(score3);
		scoreDTO.setScore4(score4);
		scoreDTO.setScore5(score5);
		scoreDTO.setS_max(s_max);
		scoreDTO.setS_min(s_min);
		scoreDTO.setS_tot(s_tot);
		scoreDTO.setS_avg(s_avg);

		contestService.scoreRegister(scoreDTO);

		System.out.println("참가번호	점수1	점수2	점수3	점수4	점수5	최대점수	최소점수	합계	평균");
		for (ScoreDTO dto : contestService.getScores()) {
			System.out.printf("%s\t%d\t%d\t", df.format(Integer.valueOf(dto.getEntry_no().trim())), dto.getScore1(),
					dto.getScore2());
			System.out.printf("%d\t%d\t%d\t", dto.getScore3(), dto.getScore4(), dto.getScore5());
			System.out.printf("%d\t%d\t%d\t%.2f\n", dto.getS_max(), dto.getS_min(), dto.getS_tot(), dto.getS_avg());
		}
	}

	public void scoreSearch() {
		ScoreDTO scoreDTO;
		System.out.println("경연 점수 조회 화면");
		System.out.print("참가번호를 입력하세요 : ");
		String entry_no = sc.next();
		scoreDTO = contestService.doSearch(entry_no);
		if (scoreDTO == null) {
			System.out.println("경연점수가 존재하지 않습니다.");
			return;
		}
		System.out.println("참가번호 " + df.format(Integer.valueOf(scoreDTO.getEntry_no().trim())) + "님의 경연결과 조회입니다.");
		System.out.println("참가번호 : " + scoreDTO.getEntry_no());
		System.out.println("성명 : " + scoreDTO.getEntry_name());
		System.out.println("생년월일 : " + scoreDTO.getEntry_birth());
		System.out.println("참가부문 : " + scoreDTO.getEntry_type());
		System.out.println("지역 : " + scoreDTO.getEntry_area());
		System.out.println("김심사 : " + scoreDTO.getScore1());
		System.out.println("이심사 : " + scoreDTO.getScore2());
		System.out.println("박심사 : " + scoreDTO.getScore3());
		System.out.println("황심사 : " + scoreDTO.getScore4());
		System.out.println("조심사 : " + scoreDTO.getScore5());
		System.out.println("총점 : " + scoreDTO.getS_tot());
		System.out.println("평균 : " + scoreDTO.getS_avg());

	}

	public void showResult() {
		List<ScoreDTO> scores = contestService.getResult();
		String gender = "";
		String type = "";
		String birth = "";

		System.out.println("최종등수조회");
		System.out.println("참가번호	성명	생년월일	참가부문	지역	총점	평균	등수");
		for (ScoreDTO dto : scores) {
			if (dto.getEntry_birth().substring(6).startsWith("1")) {
				gender = "남";
			} else {
				gender = "여";
			}
			
			switch (dto.getEntry_type()) {
			case "1":
				type = "기악";
				break;
			case "2":
				type = "민요";
				break;
			case "3":
				type = "무용";
				break;
			case "4":
				type = "판소리";
				break;
			}
			
			birth = dto.getEntry_birth().substring(0 , 2) + "년" + dto.getEntry_birth().substring(2, 4) + "월" + dto.getEntry_birth().substring(4, 6) + "일";
			
			System.out.printf("%s\t%s(%s)\t%s\t", df.format(Integer.valueOf(dto.getEntry_no().trim())), dto.getEntry_name(), gender, birth);
			System.out.printf("%s\t%s\t", type, dto.getEntry_area());
			System.out.printf("%d\t%.2f\t%d\n", dto.getS_tot(), dto.getS_avg(), dto.getRank());
		}
	}

}
