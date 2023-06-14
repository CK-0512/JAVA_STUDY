package exam;

import dao.DeptDAO;

public class WriteExam_01 {
	public static void main(String[] args) {
		DeptDAO deptDAO = new DeptDAO();
		int row = deptDAO.deptWriteTest();
		if (row != 0) {
			System.out.println("등록성공");
		} else {
			System.out.println("등록실패");
		}
	}
}
