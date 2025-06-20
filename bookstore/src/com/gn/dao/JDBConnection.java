package com.gn.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBConnection {
	public Connection conn;
	public Statement stmt;
	public PreparedStatement psmt;
	public ResultSet rs;

	public JDBConnection() {
		String url = "jdbc:mysql://127.0.0.1:3306/library_project";
		String id = "root";
		String pw = "mysql1234";
		
		try {
			conn = DriverManager.getConnection(url, id, pw);
			
			System.out.println("DB 연결 성공!");
		} catch (SQLException e) {
			System.out.println("DB 연결 실패!");
			e.printStackTrace();
		}
		
	}
	
	// DB 연결 테스트
//	public static void main(String[] args) {
//		JDBConnection jdbc = new JDBConnection();
//	}
}
