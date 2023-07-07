package com.jslhrd.studentProject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jslhrd.studentProject.dto.Join2DTO;
import com.jslhrd.studentProject.dto.JoinDTO;
import com.jslhrd.studentProject.dto.ScoreDTO;
import com.jslhrd.studentProject.dto.StudentDTO;
import com.jslhrd.studentProject.util.DBManger;

public class StudentDAO {
	private StudentDAO() {
	}

	private static StudentDAO instance = new StudentDAO();

	public static StudentDAO getInstance() {
		return instance;
	}

	public int studentRegister(StudentDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int row = 0;
		String query = "insert into tbl_student values(?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, dto.getSyear());
			pstmt.setString(2, dto.getSclass());
			pstmt.setString(3, dto.getSno());
			pstmt.setString(4, dto.getSname());
			pstmt.setString(5, dto.getBirth());
			pstmt.setString(6, dto.getGender());
			pstmt.setString(7, dto.getTel1());
			pstmt.setString(8, dto.getTel2());
			pstmt.setString(9, dto.getTel3());
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt);
		}
		return row;
	}

	public List<StudentDTO> studentList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<StudentDTO> list = new ArrayList<>();
		String query = "select * from tbl_student";

		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				StudentDTO dto = new StudentDTO();
				dto.setSyear(rs.getString("syear"));
				dto.setSclass(rs.getString("sclass"));
				dto.setSno(rs.getString("sno"));
				dto.setSname(rs.getString("sname"));
				dto.setBirth(rs.getString("birth"));
				dto.setGender(rs.getString("gender"));
				dto.setTel1(rs.getString("tel1"));
				dto.setTel2(rs.getString("tel2"));
				dto.setTel3(rs.getString("tel3"));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}
		return list;
	}

	public int scoreRegister(ScoreDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int row = 0;
		String query = "insert into tbl_score values(?, ?, ?, ?, ?, ?)";

		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, dto.getSyear());
			pstmt.setString(2, dto.getSclass());
			pstmt.setString(3, dto.getSno());
			pstmt.setInt(4, dto.getKor());
			pstmt.setInt(5, dto.getEng());
			pstmt.setInt(6, dto.getMat());
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt);
		}
		return row;
	}

	public List<ScoreDTO> scoreList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<ScoreDTO> list = new ArrayList<>();
		String query = "select syear, sclass, sno, kor, eng, mat, (kor+eng+mat) as tot, round(kor+eng+mat) as avg from tbl_score";

		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ScoreDTO dto = new ScoreDTO();
				dto.setSyear(rs.getString("syear"));
				dto.setSclass(rs.getString("sclass"));
				dto.setSno(rs.getString("sno"));
				dto.setKor(rs.getInt("kor"));
				dto.setEng(rs.getInt("eng"));
				dto.setMat(rs.getInt("mat"));
				dto.setSum(rs.getInt("tot"));
				dto.setAvg(rs.getDouble("avg"));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}
		return list;
	}

	public int studentDelete(String syear, String sclass, String sno) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int row = 0;
		String query = "delete from tbl_student where syear = ? and sclass = ? and sno = ?";

		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, syear);
			pstmt.setString(2, sclass);
			pstmt.setString(3, sno);
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt);
		}
		return row;
	}

	public int scoreDelete(String syear, String sclass, String sno) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int row = 0;
		String query = "delete from tbl_score where syear = ? and sclass = ? and sno = ?";

		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, syear);
			pstmt.setString(2, sclass);
			pstmt.setString(3, sno);
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt);
		}
		return row;
	}

	public List<JoinDTO> joinList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<JoinDTO> list = new ArrayList<>();
		String query = "select s.syear, s.sclass, s.sno, s.sname, s.gender, c.kor, c.eng, c.mat from tbl_student s, tbl_score c where s.syear = c.syear and s.sclass = c.sclass and s.sno = c.sno";

		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				JoinDTO dto = new JoinDTO();
				dto.setSyear(rs.getString("syear"));
				dto.setSclass(rs.getString("sclass"));
				dto.setSno(rs.getString("sno"));
				dto.setSname(rs.getString("sname"));
				dto.setGender(rs.getString("gender"));
				dto.setKor(rs.getInt("kor"));
				dto.setEng(rs.getInt("eng"));
				dto.setMat(rs.getInt("mat"));
				dto.setSum(rs.getInt("kor") + rs.getInt("eng") + rs.getInt("mat"));
				dto.setAvg(dto.getSum() / 3.);
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}
		return list;
	}

	public List<Integer> sumList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Integer> list = new ArrayList<>();
		String query = "select sum(kor) ksum, sum(eng) esum, sum(mat) msum from tbl_score group by syear";

		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int ksum = rs.getInt("ksum");
				int esum = rs.getInt("esum");
				int msum = rs.getInt("msum");
				list.add(ksum);
				list.add(esum);
				list.add(msum);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}
		return list;
	}

	public List<Double> avgList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Double> list = new ArrayList<>();
		String query = "select round(avg(kor), 2) kavg, round(avg(eng),2) eavg, round(avg(mat),2) mavg from tbl_score group by syear";

		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				double kavg = rs.getDouble("kavg");
				double eavg = rs.getDouble("eavg");
				double mavg = rs.getDouble("mavg");
				list.add(kavg);
				list.add(eavg);
				list.add(mavg);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}
		return list;
	}

	public List<Join2DTO> join2List() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Join2DTO> list = new ArrayList<>();
		String query = "select t.syear, t.sclass, t.tname, sum(kor) totkor, sum(eng) toteng, sum(mat) totmat, avg(kor) avgkor, avg(eng) avgeng, avg(mat) avgmat from tbl_teacher t, tbl_score s where t.syear = t.syear and t.sclass = s.sclass group by t.syear, t.sclass, t.tname";

		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Join2DTO dto = new Join2DTO();
				dto.setSyear(rs.getString("syear"));
				dto.setSclass(rs.getString("sclass"));
				dto.setTname(rs.getString("tname"));
				dto.setTotKor(rs.getInt("totkor"));
				dto.setTotEng(rs.getInt("toteng"));
				dto.setTotMat(rs.getInt("totmat"));
				dto.setAvgKor(rs.getDouble("avgkor"));
				dto.setAvgEng(rs.getDouble("avgeng"));
				dto.setAvgMat(rs.getDouble("avgmat"));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}
		return list;
	}
	
	public JoinDTO studentJoin(String syear, String sclass, String sno) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		JoinDTO dto = new JoinDTO();
		String query = "select s.syear, s.sclass, s.sno, s.sname, s.gender, c.kor, c.eng, c.mat from tbl_student s, tbl_score c where s.syear = c.syear and s.sclass = c.sclass and s.sno = c.sno and s.syear = ? and s.sclass = ? and s.sno = ?";

		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, syear);
			pstmt.setString(2, sclass);
			pstmt.setString(3, sno);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				dto.setSyear(rs.getString("syear"));
				dto.setSclass(rs.getString("sclass"));
				dto.setSno(rs.getString("sno"));
				dto.setSname(rs.getString("sname"));
				dto.setGender(rs.getString("gender"));
				dto.setKor(rs.getInt("kor"));
				dto.setEng(rs.getInt("eng"));
				dto.setMat(rs.getInt("mat"));
				dto.setSum(rs.getInt("kor") + rs.getInt("eng") + rs.getInt("mat"));
				dto.setAvg(dto.getSum() / 3.);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}
		return dto;
	}
}
