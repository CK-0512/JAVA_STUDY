package com.jslhrd.smartProduct.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jslhrd.smartProduct.dto.ProcessDTO;
import com.jslhrd.smartProduct.dto.ProductDTO;
import com.jslhrd.smartProduct.dto.WorkListDTO;
import com.jslhrd.smartProduct.util.DBManger;

public class SmartProductDAO {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	String query;

	private SmartProductDAO() {
		this.conn = null;
		this.pstmt = null;
		this.rs = null;
		this.query = "";
	}
	
	private static SmartProductDAO instance = new SmartProductDAO();

	public static SmartProductDAO getInstance() {
		return instance;
	}
	
	public String productCodeSearch(String p_code) {
		String alreadyExistsCode = null;
		query = "select p_code from product where p_code = ?";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, p_code);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				alreadyExistsCode = rs.getString("p_code");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}
		
		return alreadyExistsCode;
	}
	
	public int productRegiseter(ProductDTO product) {
		int row = 0;
		query = "insert into product values(?, ?, ?, ?, ?)";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, product.getP_code());
			pstmt.setString(2, product.getP_name());
			pstmt.setString(3, product.getP_size());
			pstmt.setString(4, product.getP_type());
			pstmt.setInt(5, product.getP_price());
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt);
		}
		
		return row;
	}

	public List<ProductDTO> getProducts() {
		ProductDTO product = null;
		List<ProductDTO> products = null;
		query = "select * from product order by p_code asc";
		
		try {
			products = new ArrayList<>();
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				product = new ProductDTO();
				product.setP_code(rs.getString("p_code"));
				product.setP_name(rs.getString("p_name"));
				product.setP_size(rs.getString("p_size"));
				product.setP_type(rs.getString("p_type"));
				product.setP_price(rs.getInt("p_price"));
				products.add(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}
		
		return products;
	}
	
	public int getLastW_workNo() {
		int lastW_workNo = 0;
		query = "select max(w_workno) lastW_workNo from worklist";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				lastW_workNo = rs.getInt("lastW_workNo");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}
		
		return lastW_workNo;
	}

	public int workListRegiseter(WorkListDTO workList) {
		int row = 0;
		query = "insert into worklist values(?, ?, ?, ?)";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, workList.getW_workNo());
			pstmt.setString(2, workList.getP_code());
			pstmt.setInt(3, workList.getW_quentity());
			pstmt.setString(4, workList.getW_workdate());
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt);
		}
		
		return row;
	}

	public List<WorkListDTO> getWorkLists() {
		WorkListDTO workList = null;
		List<WorkListDTO> workLists = null;
		query = "select w.w_workno, p.p_code, p.p_name, p.p_size, p.p_type, w.w_quentity, w.w_workdate"
				+ " from worklist w, product p where w.p_code = p.p_code order by w.w_workno asc";
		
		try {
			workLists = new ArrayList<>();
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				workList = new WorkListDTO();
				workList.setW_workNo(rs.getString("w_workno"));
				workList.setP_code(rs.getString("p_code"));
				workList.setP_name(rs.getString("p_name"));
				workList.setP_size(rs.getString("p_size"));
				workList.setP_type(rs.getString("p_type"));
				workList.setW_quentity(rs.getInt("w_quentity"));
				workList.setW_workdate(rs.getString("w_workdate"));
				workLists.add(workList);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}
		
		return workLists;
	}
	
	public String workListWorkNoSearch(String w_workNo) {
		String alreadyExistsWorkNo = null;
		query = "select w_workno from worklist where w_workno = ?";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, w_workNo);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				alreadyExistsWorkNo = rs.getString("w_workNo");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}
		
		return alreadyExistsWorkNo;
	}

	public int processRegister(ProcessDTO process) {
		int row = 0;
		query = "insert into process values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, process.getW_workNo());
			pstmt.setString(2, process.getP_p1());
			pstmt.setString(3, process.getP_p2());
			pstmt.setString(4, process.getP_p3());
			pstmt.setString(5, process.getP_p4());
			pstmt.setString(6, process.getP_p5());
			pstmt.setString(7, process.getP_p6());
			pstmt.setString(8, process.getW_lastDate());
			pstmt.setString(9, process.getW_lastTime());
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt);
		}
		
		return row;
	}

	public List<ProcessDTO> getProcesses() {
		ProcessDTO process = null;
		List<ProcessDTO> processes = null;
		query = "select * from process order by w_workno asc";
		
		try {
			processes = new ArrayList<>();
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				process = new ProcessDTO();
				process.setW_workNo(rs.getString("w_workno"));
				process.setP_p1(rs.getString("p_p1"));
				process.setP_p2(rs.getString("p_p2"));
				process.setP_p3(rs.getString("p_p3"));
				process.setP_p4(rs.getString("p_p4"));
				process.setP_p5(rs.getString("p_p5"));
				process.setP_p6(rs.getString("p_p6"));
				process.setW_lastDate(rs.getString("w_lastdate"));
				process.setW_lastTime(rs.getString("w_lasttime"));
				processes.add(process);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}
		
		return processes;
	}

	public List<ProcessDTO> getResult() {
		ProcessDTO result = null;
		List<ProcessDTO> results = null;
		query = "select pr.w_workno, pd.p_code, pd.p_name, pr.p_p1, pr.p_p2, pr.p_p3, pr.p_p4, pr.p_p5, pr.p_p6, pr.w_lastdate, pr.w_lasttime"
				+ " from process pr, product pd, worklist w where pr.w_workno = w.w_workno and w.p_code = pd.p_code order by pr.w_workno asc";
		
		try {
			results = new ArrayList<>();
			conn = DBManger.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				result = new ProcessDTO();
				result.setW_workNo(rs.getString("w_workno"));
				result.setP_code(rs.getString("p_code"));
				result.setP_name(rs.getString("p_name"));
				result.setP_p1(rs.getString("p_p1"));
				result.setP_p2(rs.getString("p_p2"));
				result.setP_p3(rs.getString("p_p3"));
				result.setP_p4(rs.getString("p_p4"));
				result.setP_p5(rs.getString("p_p5"));
				result.setP_p6(rs.getString("p_p6"));
				result.setW_lastDate(rs.getString("w_lastdate"));
				result.setW_lastTime(rs.getString("w_lasttime"));
				results.add(result);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.close(conn, pstmt, rs);
		}
		
		return results;
	}

}
