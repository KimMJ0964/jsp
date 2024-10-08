package com.kh.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCTemplate {
	//모두 static 메소드
	//싱글톤 패턴 : 메모리 영역에 단 한번만 올려두고 매번 재사용하는 개념
	
	//1. Connection 객체 생성(DB접속) 후 해당 Connection 객체 반환
	public static Connection getConnection() {
		
		Connection conn = null;
		Properties prop = new Properties();
		
		// 읽어들이고자하는 classes 폴더내의 driver.properties파일의 물리적인 경로 가져오기
		
		try {
			//1) JDBC Driver 등록
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2) Connection 객체 생성
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "JSP_학습용계정", "JSP");
			conn.setAutoCommit(false);
			System.out.println("db연결 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	//2)commit 처리해주는 메소드(Connection 객체를 전달받아서 )
	public static void commit(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//3)rollback 처리해주는 메소드(Connection 객체를 전달받아서 )
	public static void rollback(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.rollback();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// JDBC 용 객체들을 전달받아서 반납처리해주는 메소드
	//4) Statement 관련 객체를 전달받아서 반납시켜주는 메소드
	public static void close(Statement stmt) {
		try {
			if(stmt != null && stmt.isClosed()) {
				stmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//4) Connection 관련 객체를 전달받아서 반납시켜주는 메소드
		public static void close(Connection conn) {
			try {
				if(conn != null && conn.isClosed()) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
		//4) ResultSet 관련 객체를 전달받아서 반납시켜주는 메소드
		public static void close(ResultSet rset) {
			try {
				if(rset != null && rset.isClosed()) {
					rset.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
}

