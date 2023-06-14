package exam;

import dao.DeptDAO;
import dto.DeptDTO;

public class UpdateExma_01 {
	public static void main(String[] args) {
		DeptDAO dao = new DeptDAO();
		int dno = 40;
		String dname = "관리부";
		String loc = "제주";
		DeptDTO dto = new DeptDTO();
		dto.setDno(dno);
		dto.setDname(dname);
		dto.setLoc(loc);
		
		int row = dao.deptUpdate(dto);
		if (row != 0) {
			System.out.println("수정성공");
		} else {
			System.out.println("수정실패");
		}
	}
}
