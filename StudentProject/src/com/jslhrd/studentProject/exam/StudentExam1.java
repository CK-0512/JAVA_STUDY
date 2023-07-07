package com.jslhrd.studentProject.exam;

import java.util.List;
import java.util.Scanner;

import com.jslhrd.studentProject.dao.StudentDAO;
import com.jslhrd.studentProject.dto.StudentDTO;

public class StudentExam1 {
	public static void main(String[] args) {
		StudentDAO dao = StudentDAO.getInstance();
		Scanner sc = new Scanner(System.in);
		List<StudentDTO> list;
		StudentDTO dto;
		int row = 0;
		
		System.out.println("학생등록 화면");
		System.out.print("학년 : ");
		String syear = sc.next();
		System.out.print("반 : ");
		String sclass = sc.next();
		System.out.print("번호 : ");
		String sno = sc.next();
		System.out.print("이름 : ");
		String sname = sc.next();
		System.out.print("생년월일 : ");
		String birth = sc.next();
		System.out.print("성별 : ");
		String gender = sc.next();
		System.out.print("전화번호 : ");
		String tel1 = sc.next();
		String tel2 = sc.next();
		String tel3 = sc.next();
		
		dto = new StudentDTO(syear, sclass, sno, sname, birth, gender, tel1, tel2, tel3);
		
		row = dao.studentRegister(dto);
		
		list = dao.studentList();
		System.out.println("학년	반	번호	이름	생년월일	성별	전화1	전화2	전화3");
		for(StudentDTO sdto : list) {
			System.out.printf("%s\t%s\t%s\t", sdto.getSyear(), sdto.getSclass(), sdto.getSno());
			System.out.printf("%s\t%s\t%s\t", sdto.getSname(), sdto.getBirth(), sdto.getGender());
			System.out.printf("%s\t%s\t%s\n", sdto.getTel1(), sdto.getTel2(), sdto.getTel3());
		}
	}
}
