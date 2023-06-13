package com.jslhrd.jdbcExam.exam;

import java.sql.Connection;

import com.jslhrd.jdbcExam.util.DBManger;

public class ConTest {
	public static void main(String[] args) {
		Connection conn = DBManger.getConnection();
		
		System.out.println("Conn :" + conn);
	}
}
