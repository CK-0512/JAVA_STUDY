package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.DeptDTO;
import util.DBManger;

public class SalDAO {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	// 1.등록(insert) 메소드 정의
	public int deptWriteTest() {
		// 반환타입 정의
		int row = 0;
		// query정의
		String query = "insert into dept_temp(dno, dname, loc) values(20, '총무부', '서울')";

		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);

			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt);
		}
		return row;
	}

	// 키보드 입력에 의한 등록
	public int deptWriteKey(int dno, String dname, String loc) {
		// 반환타입 정의
		int row = 0;
		// query정의
		String query = "insert into dept_temp(dno, dname, loc) values(?, ?, ?)";

		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, dno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);

			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt);
		}
		return row;
	}

	// 키보드입력에 DTO이용
	public int deptWriteDTOKey(DeptDTO dto) {
		// 반환타입 정의
		int row = 0;
		// query정의
		String query = "insert into dept_temp(dno, dname, loc) values(?, ?, ?)";

		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, dto.getDno());
			pstmt.setString(2, dto.getDname());
			pstmt.setString(3, dto.getLoc());

			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt);
		}
		return row;
	}

	// 삭제 -> 부서번호
	public boolean deptDelete(int dno) {
		// 리턴타입
		boolean flag = false;
		// query 문장
		String query = "delete from dept_temp where dno = ?";

		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, dno);
			int row = pstmt.executeUpdate();
			if (row != 0) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt);
		}

		return flag;
	}

	// 수정 -> 부서번호, 부서명, 지역명 수정
	public int deptUpdate(DeptDTO dto) {
		// 리턴타입
		int row = 0;
		// query 문장
		String query = "update dept_temp set dname = ?, loc = ? where dno = ?";

		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, dto.getDname());
			pstmt.setString(2, dto.getLoc());
			pstmt.setInt(3, dto.getDno());
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt);
		}

		return row;
	}

}
