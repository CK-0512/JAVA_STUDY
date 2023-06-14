package exam;

import java.util.Scanner;

import dao.DeptDAO;
import dto.DeptDTO;

public class WriteExam_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DeptDAO dao = new DeptDAO();
		int dno = 0;
		String dname = "";
		String loc = "";
		for (int i = 0; i < 4; i++) {
			System.out.print("부서등록 : ");
			String cmd = sc.nextLine();
			String[] cmdBits = cmd.split(",");
			dno = Integer.parseInt(cmdBits[0]);
			dname = cmdBits[1];
			loc = cmdBits[2];
			DeptDTO dto = new DeptDTO();
			dto.setDno(dno);
			dto.setDname(dname);
			dto.setLoc(loc);
			int row = dao.deptWriteDTOKey(dto);
			if (row != 0) {
				System.out.println("등록성공");
			} else {
				System.out.println("등록실패");
			}
		}
	}
}
