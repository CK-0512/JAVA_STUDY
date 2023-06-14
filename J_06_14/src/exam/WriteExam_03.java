package exam;

import dao.DeptDAO;
import dto.DeptDTO;
import util.DBManger;

public class WriteExam_03 {
	public static void main(String[] args) {
		DeptDAO dao = new DeptDAO();
		int dno = 40;
		String dname = "회계부";
		String loc = "인천";
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
