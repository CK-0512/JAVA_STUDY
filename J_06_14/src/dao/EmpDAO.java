package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.DeptDTO;
import dto.EmpDTO;
import util.DBManger;

public class EmpDAO {
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
	public int EmpWriteDTOKey(EmpDTO dto) {
		// 반환타입 정의
		int row = 0;
		// query정의
		String query = "insert into CHAP10HW_EMP values(?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, dto.getEno());
			pstmt.setString(2, dto.getEname());
			pstmt.setString(3, dto.getJob());
			pstmt.setInt(4, dto.getManager());
			pstmt.setString(5, dto.getHiredate());
			pstmt.setInt(6, dto.getSalary());
			pstmt.setString(7, dto.getCommission());
			pstmt.setInt(8, dto.getDno());

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

	public int EmpDnoUpdate(int dno1, int dno2) {
		// 리턴타입
		int row = 0;
		// query 문장
		String query = "update CHAP10HW_EMP set dno = ? where dno = ? and salary > ?";

		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement("select avg(salary) as avgsal from chap10hw_emp where dno = ?");
			pstmt.setInt(1, dno1);
			rs = pstmt.executeQuery();
			
			rs.next();
			int avgSal = rs.getInt("avgsal");
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, dno2);
			pstmt.setInt(2, dno1);
			pstmt.setInt(3, avgSal);
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt);
		}

		return row;
	}

}
