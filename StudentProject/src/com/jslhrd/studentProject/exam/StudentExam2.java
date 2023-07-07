package com.jslhrd.studentProject.exam;

import java.util.List;
import java.util.Scanner;

import com.jslhrd.studentProject.dao.StudentDAO;
import com.jslhrd.studentProject.dto.ScoreDTO;
import com.jslhrd.studentProject.dto.StudentDTO;

public class StudentExam2 {
	public static void main(String[] args) {
		StudentDAO dao = StudentDAO.getInstance();
		Scanner sc = new Scanner(System.in);
		List<ScoreDTO> list;
		ScoreDTO dto;
		int row = 0;
		
		System.out.println("성적등록 화면");
		System.out.print("학년 : ");
		String syear = sc.next();
		System.out.print("반 : ");
		String sclass = sc.next();
		System.out.print("번호 : ");
		String sno = sc.next();
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int mat = sc.nextInt();
		
		dto = new ScoreDTO(syear, sclass, sno, kor, eng, mat);
		
		row = dao.scoreRegister(dto);
		
		list = dao.scoreList();
		System.out.println("학년	반	번호	국어	영어	수학	총점	평균");
		for(ScoreDTO sdto : list) {
			System.out.printf("%s\t%s\t%s\t", sdto.getSyear(), sdto.getSclass(), sdto.getSno());
			System.out.printf("%d\t%d\t%d\t", sdto.getKor(), sdto.getEng(), sdto.getMat());
			System.out.printf("%d\t%.1f\n", sdto.getSum(), sdto.getAvg());
		}
	}
}
