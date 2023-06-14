package exam;

import dao.DeptDAO;

public class DeleteExam_01 {
	public static void main(String[] args) {
		DeptDAO dao = new DeptDAO();
		int dno = 30;
		
		boolean flag = dao.deptDelete(dno);
		if (flag) {
			System.out.println("삭제성공");
		} else {
			System.out.println("삭제실패");
		}
	}
}
