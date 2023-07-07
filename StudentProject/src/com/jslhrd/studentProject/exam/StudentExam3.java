package com.jslhrd.studentProject.exam;

import java.util.Scanner;

import com.jslhrd.studentProject.dao.StudentDAO;

public class StudentExam3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentDAO dao = StudentDAO.getInstance();
		int row = 0;
		
		System.out.println("학생정보 삭제");
		System.out.print("학번입력 : ");
		String hak = sc.next();
		String syear = hak.substring(0, 1);
		String sclass = hak.substring(1, 3);
		String sno = hak.substring(3);
		
		row = dao.scoreDelete(syear, sclass, sno);
		if (row != 0) {
			System.out.println(hak + " 성적정보가 삭제되었습니다.");
		} else {
			System.out.println(hak + " 성적정보가 존재하지 않습니다.");
		}
		row = dao.studentDelete(syear, sclass, sno);
		if (row != 0) {
			System.out.println(hak + " 학생정보가 삭제되었습니다.");
		} else {
			System.out.println(hak + " 학생정보가 존재하지 않습니다.");
			return;
		}
	}
}
