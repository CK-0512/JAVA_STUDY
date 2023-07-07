package com.jslhrd.artistProject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jslhrd.artistProject.dto.ArtistDTO;
import com.jslhrd.artistProject.dto.Join2DTO;
import com.jslhrd.artistProject.dto.JoinDTO;
import com.jslhrd.artistProject.dto.PointDTO;
import com.jslhrd.emp.util.DBManger;

public class ArtistDAO {
	private ArtistDAO() {}
	
	private static ArtistDAO instance = new ArtistDAO();
	
	public static ArtistDAO getInstance() {
		return instance;
	}
	
	public static int artistInsert(ArtistDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int row = 0;
		String query = "insert into tbl_artist_201905 values (?, ?, ?, ?, ?, ?)";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, dto.getArtist_id());
			pstmt.setString(2, dto.getArtist_name());
			pstmt.setString(3, dto.getArtist_gender());
			pstmt.setString(4, dto.getArtist_birth());
			pstmt.setString(5, dto.getTalent());
			pstmt.setString(6, dto.getAgency());
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt);
		}
		
		return row;
	}

	public List<ArtistDTO> artistList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<ArtistDTO> list = new ArrayList<>();
		String query = "select * from tbl_artist_201905 order by artist_id asc";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ArtistDTO dto = new ArtistDTO();
				dto.setArtist_id(rs.getString("artist_id"));
				dto.setArtist_name(rs.getString("artist_name"));
				dto.setArtist_gender(rs.getString("artist_gender"));
				dto.setArtist_birth(rs.getString("artist_birth"));
				dto.setTalent(rs.getString("talent"));
				dto.setAgency(rs.getString("agency"));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}
		
		return list;
	}

	public int pointInsert(PointDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int row = 0;
		String query = "insert into tbl_point_201905 values (?, ?, ?, ?)";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, dto.getSerial_no());
			pstmt.setString(2, dto.getArtist_id());
			pstmt.setString(3, dto.getMento_id());
			pstmt.setInt(4, dto.getPoint());
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt);
		}
		
		return row;
	}

	public List<PointDTO> pointList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<PointDTO> list = new ArrayList<>();
		String query = "select * from tbl_point_201905 order by serial_no asc";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				PointDTO dto = new PointDTO();
				dto.setSerial_no(rs.getInt("serial_no"));
				dto.setArtist_id(rs.getString("artist_id"));
				dto.setMento_id(rs.getString("mento_id"));
				dto.setPoint(rs.getInt("point"));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}
		
		return list;
	}

	public int pointUpdate(int serial_no, int point) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int row = 0;
		String query = "update tbl_point_201905 set point = ? where serial_no = ?";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, point);
			pstmt.setInt(2, serial_no);
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt);
		}
		 return row;
	}

	public int artistDelete(String artist_id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int row = 0;
		String query = "delete from tbl_artist_201905 where artist_id = ?";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, artist_id);
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt);
		}
		 return row;
	}

	public int pointDelete(int serial_no) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int row = 0;
		String query = "delete from tbl_point_201905 where serial_no = ?";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, serial_no);
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
		String query = "select p.serial_no, a.artist_id, a.artist_name, a.artist_birth, p.point, m.mento_name \r\n"
				+ "    from tbl_artist_201905 a,tbl_mento_201905 m,tbl_point_201905 p\r\n"
				+ "        where p.artist_id = a.artist_id and p.mento_id= m.mento_id";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				JoinDTO dto = new JoinDTO();
				dto.setSerial_no(rs.getString("serial_no"));
				dto.setArtist_id(rs.getString("artist_id"));
				dto.setArtist_name(rs.getString("artist_name"));
				dto.setArtist_birth(rs.getString("artist_birth"));
				dto.setPoint(rs.getInt("point"));
				dto.setMento_name(rs.getString("mento_name"));
				list.add(dto);
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
		
		String query = "select a.artist_id, artist_name, artist_gender, sum(point) sum, avg(point) avg\r\n"
				+ "    from tbl_artist_201905 a, tbl_point_201905 p \r\n"
				+ "        where a.artist_id = p.artist_id\r\n"
				+ "            group by a.artist_id, artist_name, artist_gender\r\n"
				+ "                order by sum(point) desc";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Join2DTO dto = new Join2DTO();
				dto.setArtist_id(rs.getString("artist_id"));
				dto.setArtist_name(rs.getString("artist_name"));
				dto.setArtist_gender(rs.getString("artist_gender"));
				dto.setSum(rs.getInt("sum"));
				dto.setAvg(rs.getDouble("avg"));
				list.add(dto);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}
		
		return list;
	}
}
