package com.gn.dao;

import java.sql.SQLException;

import com.gn.model.vo.Book;

public class BookDAO extends JDBConnection {
	
	public int insert(Book book) {
		int result = 0; // DB에 적용된 데이터 개수
		
		String sql = "INSERT INTO book (isbn, type, price) "
				   + "VALUES (?, ?, ?)";
		
		try {
			psmt = conn.prepareStatement(sql); // SQL 실행 객체 생성
			psmt.setString(1, book.getIsbn()); // 첫 번째 ?에 문자열 isbn 매핑
			psmt.setString(2, book.getType()); // 두 번째 ?에 문자열 type 매핑
			psmt.setInt(3, book.getPrice()); // 세 번째 ?에 정수 price 매핑
			
			result = psmt.executeUpdate(); // SQL 실행 요청
			// executeUpdate()
			// SQL(INSERT, UPDATE, DELETE) 실행 시 적용된 데이터 개수를 int 타입으로 받아와서 반환
			// 예: 게시글 1개 적용 시
			// 성공: result = 1
			// 실패: result = 0
		} catch (SQLException e) {
			System.out.println("책 등록 - 예외 발생");
			e.printStackTrace();
		}
		
		return result;
	}
	
}
