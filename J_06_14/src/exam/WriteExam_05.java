package exam;

import java.util.Scanner;

import dao.EmpDAO;
import dto.EmpDTO;

public class WriteExam_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmpDAO dao = new EmpDAO();
		int eno = 0;
		String ename = "";
		String job = "";
		int manager = 0;
		String hiredate = "";
		int salary = 0;
		String commission = null;
		int dno = 0;
		for (int i = 0; i < 8; i++) {
			System.out.print("사원등록 : ");
			String cmd = sc.nextLine();
			String[] cmdBits = cmd.split(",");
			eno = Integer.parseInt(cmdBits[0]);
			ename = cmdBits[1];
			job = cmdBits[2];
			manager = Integer.parseInt(cmdBits[3]);
			hiredate = cmdBits[4];
			salary = Integer.parseInt(cmdBits[5]);
			commission = cmdBits[6];
			dno = Integer.parseInt(cmdBits[7]);
			
			EmpDTO dto = new EmpDTO();
			dto.setEno(eno);
			dto.setEname(ename);
			dto.setJob(job);
			dto.setManager(manager);
			dto.setHiredate(hiredate);
			dto.setSalary(salary);
			dto.setCommission(commission);
			dto.setDno(dno);
			
			int row = dao.EmpWriteDTOKey(dto);
			if (row != 0) {
				System.out.println("등록성공");
			} else {
				System.out.println("등록실패");
			}
		}
	}
}
