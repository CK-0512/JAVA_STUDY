package com.jslhrd.studentProject.exam;

import java.util.List;
import java.util.Scanner;

import com.jslhrd.studentProject.dao.StudentDAO;
import com.jslhrd.studentProject.dto.JoinDTO;
import com.jslhrd.studentProject.dto.ScoreDTO;

public class StudentExam6 {
	public static void main(String[] args) {
		StudentDAO dao = StudentDAO.getInstance();
		Scanner sc = new Scanner(System.in);
		JoinDTO dto;

		System.out.print("학번입력 : ");
		String hak = sc.next();
		String[] hakBits;
		String syear;
		String sclass;
		String sno;
		if (hak.matches("^\\d{1}-\\d{2}-\\d{2}$")) {
			hakBits = hak.split("-");
			syear = hakBits[0];
			sclass = hakBits[1];
			sno = hakBits[2];
		} else if(hak.matches("^\\d{5}")) {
			syear = hak.substring(0,1);
			sclass = hak.substring(1,3);
			sno = hak.substring(3); 
		} else {
			System.out.println("학번입력오류");
			return;
		}

		dto = dao.studentJoin(syear, sclass, sno);
		System.out.println("학년-반-번호	이름	성별	국어	영어	수학	총점	평균");
		System.out.printf("%s-%s-%s\t\t", dto.getSyear(), dto.getSclass(), dto.getSno());
		System.out.printf("%s\t%s\t", dto.getSname(), dto.getGender());
		System.out.printf("%d\t%d\t%d\t", dto.getKor(), dto.getEng(), dto.getMat());
		System.out.printf("%d\t%.1f\n", dto.getSum(), dto.getAvg());

	}
}
