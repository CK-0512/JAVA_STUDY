package com.jslhrd.contest.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jslhrd.contest.util.DBManger;
import com.jslhrd.contset.dto.EntryDTO;
import com.jslhrd.contset.dto.ScoreDTO;

public class ContestDAO {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	String query;

	public ContestDAO() {
		this.conn = null;
		this.pstmt = null;
		this.rs = null;
		this.query = "";
	}

	public void entryRegister(EntryDTO entryDTO) {
		query = "insert into entry values(?, ?, ?, ?, ?)";

		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, entryDTO.getEntry_no());
			pstmt.setString(2, entryDTO.getEntry_name());
			pstmt.setString(3, entryDTO.getEntry_jumin());
			pstmt.setString(4, entryDTO.getEntry_type());
			pstmt.setString(5, entryDTO.getEntry_area());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt);
		}
	}

	public void scoreRegister(ScoreDTO scoreDTO) {
		query = "insert into record values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, scoreDTO.getEntry_no());
			pstmt.setInt(2, scoreDTO.getScore1());
			pstmt.setInt(3, scoreDTO.getScore2());
			pstmt.setInt(4, scoreDTO.getScore3());
			pstmt.setInt(5, scoreDTO.getScore4());
			pstmt.setInt(6, scoreDTO.getScore5());
			pstmt.setInt(7, scoreDTO.getS_max());
			pstmt.setInt(8, scoreDTO.getS_min());
			pstmt.setInt(9, scoreDTO.getS_tot());
			pstmt.setDouble(10, scoreDTO.getS_avg());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt);
		}
	}

	public ScoreDTO doSearch(String entry_no) {
		ScoreDTO scoreDTO = null;
		query = "select e.entry_no, e.entry_name, e.entry_jumin, e.entry_type, e.entry_area, r.score1, r.score2, r.score3, r.score4, r.score5, r.s_tot, r.s_avg from entry e, record r where e.entry_no = r.entry_no and e.entry_no = ?";

		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, entry_no);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				scoreDTO = new ScoreDTO();
				scoreDTO.setEntry_no(rs.getString("entry_no"));
				scoreDTO.setEntry_name(rs.getString("entry_name"));
				scoreDTO.setEntry_birth(rs.getString("entry_jumin"));
				scoreDTO.setEntry_type(rs.getString("entry_type"));
				scoreDTO.setEntry_area(rs.getString("entry_area"));
				scoreDTO.setScore1(rs.getInt("score1"));
				scoreDTO.setScore2(rs.getInt("score2"));
				scoreDTO.setScore3(rs.getInt("score3"));
				scoreDTO.setScore4(rs.getInt("score4"));
				scoreDTO.setScore5(rs.getInt("score5"));
				scoreDTO.setS_tot(rs.getInt("s_tot"));
				scoreDTO.setS_avg(rs.getDouble("s_avg"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}

		return scoreDTO;
	}
	
	public List<ScoreDTO> getResult() {
		ScoreDTO scoreDTO;
		List<ScoreDTO> scores = null;
		query = "select e.entry_no, e.entry_name, e.entry_jumin, e.entry_type, e.entry_area, r.s_tot, r.s_avg from entry e, record r where e.entry_no = r.entry_no order by r.s_avg desc";

		try {
			scores = new ArrayList<>();
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				scoreDTO = new ScoreDTO();
				scoreDTO.setEntry_no(rs.getString("entry_no"));
				scoreDTO.setEntry_name(rs.getString("entry_name"));
				scoreDTO.setEntry_birth(rs.getString("entry_jumin"));
				scoreDTO.setEntry_type(rs.getString("entry_type"));
				scoreDTO.setEntry_area(rs.getString("entry_area"));
				scoreDTO.setS_tot(rs.getInt("s_tot"));
				scoreDTO.setS_avg(rs.getDouble("s_avg"));
				scores.add(scoreDTO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}

		return scores;
	}

	public int getLastEntryNO() {
		int lastEntryNo = 0;
		query = "select max(entry_no) e from entry";

		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				lastEntryNo = Integer.valueOf(rs.getString("e").trim());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}

		return lastEntryNo;
	}

	public List<String> getJumin() {
		List<String> jumins = null;
		query = "select entry_jumin from entry";

		try {
			jumins = new ArrayList<>();
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				jumins.add(rs.getString("entry_jumin"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}

		return jumins;
	}

	public List<EntryDTO> getEntries() {
		EntryDTO dto;
		List<EntryDTO> entries = null;
		query = "select * from entry";

		try {
			entries = new ArrayList<>();
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				dto = new EntryDTO();
				dto.setEntry_no(rs.getString("entry_no"));
				dto.setEntry_name(rs.getString("entry_name"));
				dto.setEntry_jumin(rs.getString("entry_jumin"));
				dto.setEntry_type(rs.getString("entry_type"));
				dto.setEntry_area(rs.getString("entry_area"));
				entries.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}

		return entries;
	}

	public String getExistsEntryNo(String entry_no) {
		String existsEntryNo = null;
		query = "select entry_no from entry where entry_no = ?";

		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, entry_no + "   ");
			rs = pstmt.executeQuery();
			if (rs.next()) {
				existsEntryNo = rs.getString("entry_no");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}

		return existsEntryNo;
	}

	public List<ScoreDTO> getScores() {
		ScoreDTO dto;
		List<ScoreDTO> scores = null;
		query = "select * from record";

		try {
			scores = new ArrayList<>();
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				dto = new ScoreDTO();
				dto.setEntry_no(rs.getString("entry_no"));
				dto.setScore1(rs.getInt("score1"));
				dto.setScore2(rs.getInt("score2"));
				dto.setScore3(rs.getInt("score3"));
				dto.setScore4(rs.getInt("score4"));
				dto.setScore5(rs.getInt("score5"));
				dto.setS_max(rs.getInt("s_max"));
				dto.setS_min(rs.getInt("s_min"));
				dto.setS_tot(rs.getInt("s_tot"));
				dto.setS_avg(rs.getDouble("s_avg"));
				scores.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}

		return scores;
	}

}
