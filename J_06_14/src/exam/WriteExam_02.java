package exam;

import dao.DeptDAO;

public class WriteExam_02 {
	public static void main(String[] args) {
		DeptDAO deptDAO = new DeptDAO();
		int dno = 30;
		String dname = "인사부";
		String loc = "경기";
		int row = deptDAO.deptWriteKey(dno, dname, loc);
		if (row != 0) {
			System.out.println("등록성공");
		} else {
			System.out.println("등록실패");
		}
	}
}
