package com.jslhrd.sawon.exam;

import java.util.Scanner;

import com.jslhrd.sawon.dao.EmpDAO;
import com.jslhrd.sawon.dto.EmpDTO;

/* 키보드로 사원번호, 입사일, 급여, 부서 입력
 * 사원번호에 해당하는 사원의 입사일, 급여, 부서를 변경하시오
 *  2222,
 */
public class EmpUpdate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		EmpDTO emp = new EmpDTO();
		
		System.out.print("사원번호 : ");
		emp.setEno(sc.nextInt());
		System.out.print("입사일 : ");
		emp.setHiredate(sc.next());
		System.out.print("급여 : ");
		emp.setSalary(sc.nextInt());
		System.out.print("부서번호 : ");
		emp.setDno(sc.nextInt());
		
		EmpDAO dao = EmpDAO.getInstance();
		int row = dao.empUpdate(emp);
		if (row == 1) {
			System.out.println("수정성공");
		} else {
			System.out.println("해당하는 사원이 존재하지 않습니다.");
		}
	}
}
