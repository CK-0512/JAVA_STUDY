package exam;

import java.util.Scanner;

import dao.EmpDAO;
import dto.EmpDTO;

public class UpdateExma_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmpDAO dao = new EmpDAO();
		EmpDTO dto = new EmpDTO();
		System.out.print("기존부서 : ");
		int dno1 = sc.nextInt();
		System.out.print("변경부서 : ");
		int dno2 = sc.nextInt();
		
		int row = dao.EmpDnoUpdate(dno1, dno2);
		if (row != 0) {
			System.out.println("수정성공");
		} else {
			System.out.println("수정실패");
		}
	}
}
