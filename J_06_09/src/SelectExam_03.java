import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class SelectExam_03 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null; //(SQL) 명령문
		ResultSet rs = null; // select 문자 결과 저장
		
		//JDBC 드라이버 로딩 및 커넥션 테스트
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "track2_12", "1234");
			System.out.println("conn : " + conn);
			// 명령문 처리
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select eno, ename, salary, salary*12 as yearsal from emp");
			System.out.println("번호\t이름\t월급\t연봉");
			while(rs.next()) {
				int eno = rs.getInt("eno");
				String ename = rs.getString("ename");
				int salary = rs.getInt("salary");
				int yearsal = rs.getInt("yearsal");
				System.out.println(eno + "\t" + ename + "\t" + salary + "\t" + yearsal);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null)
					rs.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			try {
				if(stmt != null)
					stmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			try {
				if(conn != null)
					conn.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
