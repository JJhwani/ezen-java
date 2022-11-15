package com.ezen.ex02;

import java.sql.*;
import java.util.*;

public class JDBC {
	private static String driver="oracle.jdbc.driver.OracleDriver";
	private static String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private static String user="scott";
	private static String pwd="1234";
	
	public static void main(String[] args) {
		Connection conn = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		//ResultSet rs = null;
		
		ArrayList<SeoulHotelVO> list = Seoul_Hotel.seoulHotel();
		
		try {
			Class.forName(driver);
			System.out.println("드라이브 로드 성공");
			
			conn = DriverManager.getConnection(url,user,pwd);
			System.out.println(conn);
			
			String sql = "INSERT INTO SEOUL_HOTEL VALUES(?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			for(SeoulHotelVO vo : list) {
				pstmt.setInt(1,vo.no);
				pstmt.setString(2, vo.hotelName);
				pstmt.setString(3, vo.imgAddress);
				pstmt.setString(4, vo.links);
				pstmt.setInt(5, vo.reviewCnt);
				pstmt.setDouble(6, vo.gradeCnt);
				pstmt.setString(7, vo.SeoulAddress);
				pstmt.executeUpdate();
				
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
