package com.ezen.ex01;

import java.sql.*;

public class DBTest01 {
	
	private static String driver="oracle.jdbc.driver.OracleDriver";
	private static String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private static String user="scott";
	private static String pwd="1234";

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			System.out.println("드라이브 로드 성공");
			
			conn = DriverManager.getConnection(url,user,pwd);
			System.out.println(conn);
			
			stmt = conn.createStatement();
			
			String sql = "INSERT INTO MEMBER VALUES('0000','홍길동',170,78,26)";
			int num = stmt.executeUpdate(sql);
			System.out.println(num);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
