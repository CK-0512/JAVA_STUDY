package com.jslhrd.studentProject.exam;

import java.util.List;
import java.util.Scanner;

import com.jslhrd.studentProject.dao.StudentDAO;
import com.jslhrd.studentProject.dto.JoinDTO;

public class StudentExam4 {
	public static void main(String[] args) {
		StudentDAO dao = StudentDAO.getInstance();
		List<JoinDTO> list;
		List<Integer> sum;
		List<Double> avg;

		list = dao.joinList();
		System.out.println("학년-반-번호	이름	성별	국어	영어	수학	총점	평균");
		for(JoinDTO dto : list) {
			System.out.printf("%s-%s-%s\t\t", dto.getSyear(), dto.getSclass(), dto.getSno());
			System.out.printf("%s\t%s\t", dto.getSname(), dto.getGender());
			System.out.printf("%d\t%d\t%d\t", dto.getKor(), dto.getEng(), dto.getMat());
			System.out.printf("%d\t%.1f\n", dto.getSum(), dto.getAvg());
		}
		
		sum = dao.sumList();
		System.out.print("\t\t학년총점\t");
		for(int i : sum) {
			System.out.printf("%d\t",i);
		}
		System.out.println();
		
		avg = dao.avgList();
		System.out.print("\t\t학년평균\t");
		for(double d : avg) {
			System.out.printf("%.1f\t",d);
		}
	}
}
