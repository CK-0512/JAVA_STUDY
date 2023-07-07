package com.jslhrd.shophingMall.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jslhrd.shophingMall.dto.Member;
import com.jslhrd.shophingMall.dto.Money;
import com.jslhrd.shophingMall.util.DBManger;

public class ShoppingMallDAO {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	String query;

	private ShoppingMallDAO() {
		this.conn = null;
		this.pstmt = null;
		this.rs = null;
		this.query = "";
	}
	
	private static ShoppingMallDAO instance = new ShoppingMallDAO();

	public static ShoppingMallDAO getInstance() {
		return instance;
	}

	public int getLastCustNo() {
		int lastCustNo = 0;
		query = "select Max(custno) lastcustno from member";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				lastCustNo = rs.getInt("lastcustno");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}
		return lastCustNo;
	}

	public int memberRegist(Member member) {
		int row = 0;
		query = "insert into member values(?, ?, ?, ?, ?, ?, ?)";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, member.getCustNo());
			pstmt.setString(2, member.getCustName());
			pstmt.setString(3, member.getPhone());
			pstmt.setString(4, member.getGender());
			pstmt.setString(5, member.getJoinDate());
			pstmt.setString(6, member.getGrade());
			pstmt.setString(7, member.getCity());
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt);
		}
		return row;
	}

	public Member memberSearchByCustNo(int custNo) {
		Member isExistsMember = null;
		query = "select * from member where custno = ?";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, custNo);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				isExistsMember = new Member();
				isExistsMember.setCustNo(rs.getInt("custno"));
				isExistsMember.setCustName(rs.getString("custname"));
				isExistsMember.setPhone(rs.getString("phone"));
				isExistsMember.setGender(rs.getString("gender"));
				isExistsMember.setJoinDate(rs.getString("joindate"));
				isExistsMember.setGrade(rs.getString("grade"));
				isExistsMember.setCity(rs.getString("city"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}
		
		return isExistsMember;
	}

	public int moneyRegist(Money money) {
		int row = 0;
		query = "insert into money values(?, ?, ?, ?, ?, ?, ?)";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, money.getCustNo());
			pstmt.setInt(2, money.getSaleNo());
			pstmt.setInt(3, money.getPcost());
			pstmt.setInt(4, money.getAmount());
			pstmt.setInt(5, money.getPrice());
			pstmt.setString(6, money.getPcode());
			pstmt.setString(7, money.getSdate());
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt);
		}
		return row;
	}

	public List<Member> getMembers() {
		List<Member> members = null;
		Member member = null;
		query = "select * from member order by custno asc";
		
		try {
			members = new ArrayList<>();
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				member = new Member();
				member.setCustNo(rs.getInt("custno"));
				member.setCustName(rs.getString("custname"));
				member.setPhone(rs.getString("phone"));
				member.setGender(rs.getString("gender"));
				member.setJoinDate(rs.getString("joindate"));
				member.setGrade(rs.getString("grade"));
				member.setCity(rs.getString("city"));
				members.add(member);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}
		return members;
	}

	public List<Money> getMoneys() {
		List<Money> moneys = null;
		Money money = null;
		query = "select * from money order by saleno asc";
		
		try {
			moneys = new ArrayList<>();
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				money = new Money();
				money.setCustNo(rs.getInt("custno"));
				money.setSaleNo(rs.getInt("saleno"));
				money.setPcost(rs.getInt("pcost"));
				money.setAmount(rs.getInt("amount"));
				money.setPrice(rs.getInt("price"));
				money.setPcode(rs.getString("pcode"));
				money.setSdate(rs.getString("sdate"));
				moneys.add(money);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}
		return moneys;
	}

	public List<Member> getMembersWithCityName() {
		List<Member> members = null;
		Member member = null;
		query = "select m.custno, m.custname, m.phone, m.gender, m.joindate, m.grade, c.cityname from member m, city c where m.city = c.city order by custno asc";
		
		try {
			members = new ArrayList<>();
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				member = new Member();
				member.setCustNo(rs.getInt("custno"));
				member.setCustName(rs.getString("custname"));
				member.setPhone(rs.getString("phone"));
				member.setGender(rs.getString("gender"));
				member.setJoinDate(rs.getString("joindate"));
				member.setGrade(rs.getString("grade"));
				member.setCityName(rs.getString("cityname"));
				members.add(member);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}
		return members;
	}

	public List<Member> getMembersSal() {
		List<Member> members = null;
		Member member = null;
		query = "select m.custno, m.custname, m.phone, m.grade, sum(mo.price) sal"
				+ " from member m, money mo"
				+ " where m.custno = mo.custno"
				+ " group by m.custno, m.custname, m.phone, m.grade"
				+ " order by sal desc";
		
		try {
			members = new ArrayList<>();
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				member = new Member();
				member.setCustNo(rs.getInt("custno"));
				member.setCustName(rs.getString("custname"));
				member.setPhone(rs.getString("phone"));
				member.setGrade(rs.getString("grade"));
				member.setSal(rs.getInt("sal"));
				members.add(member);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}
		return members;
	}
	
	

}
