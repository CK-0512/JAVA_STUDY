package com.jslhrd.studentProject.exam;

import java.util.List;

import com.jslhrd.studentProject.dao.StudentDAO;
import com.jslhrd.studentProject.dto.Join2DTO;

public class StudentExam5 {
	public static void main(String[] args) {
		StudentDAO dao = StudentDAO.getInstance();
		List<Join2DTO> list;

		list = dao.join2List();
		System.out.println("학년	반	교사명	국어총점	영어총점	수학총점	국어평균	수학평균	영어평균");
		for(Join2DTO dto : list) {
			System.out.printf("%s\t%s\t%s\t", dto.getSyear(), dto.getSclass(), dto.getTname());
			System.out.printf("%d\t\t%d\t\t%d\t\t", dto.getTotKor(), dto.getTotEng(), dto.getTotMat());
			System.out.printf("%.1f\t\t%.1f\t\t%.1f\n", dto.getAvgKor(), dto.getAvgEng(), dto.getAvgMat());
		}
		
	}
}
