package com.ezen.ex01;

import java.sql.*;
import java.util.*;

public class SeoulHotel {
	private static String driver="oracle.jdbc.driver.OracleDriver";
	private static String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private static String user="scott";
	private static String pwd="1234";

	public static void main(String[] args) {
		Connection conn = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		//ResultSet rs = null;
		
		ArrayList<DataDAO> list = CrawlingEx04.seoulHotel();
		
		try {
			Class.forName(driver);
			System.out.println("드라이브 로드 성공");
			
			conn = DriverManager.getConnection(url,user,pwd);
			System.out.println(conn);
			
			String sql = "INSERT INTO SEOUL_HOTEL VALUES(?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			for(DataDAO dl : list) {
				pstmt.setInt(1,dl.num);
				pstmt.setString(2, dl.name);
				pstmt.setString(3, dl.imgAddress);
				pstmt.setString(4, dl.link);
				pstmt.setInt(5, dl.review);
				pstmt.setFloat(6, dl.score);
				pstmt.setString(7, dl.address);
				pstmt.executeUpdate();
				
			}
			//int num = pstmt.executeUpdate();
			//System.out.println(num);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}