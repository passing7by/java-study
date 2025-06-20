package com.gn.service;

import com.gn.dao.BookDAO;
import com.gn.model.vo.Book;

public class BookServiceImpl implements BookService {
	
	private BookDAO bookDAO = new BookDAO();
	
	@Override
	public int insert(Book book) {
		// 게시글 정보를 전달하여 DB에 데이터 등록 요청
		int result = bookDAO.insert(book);
		// 적용된 데이터 개수를 반환
		// 0: 데이터 등록 실패
		// 1: 데이터 등록 성공
		
		if (result > 0) {
			System.out.println("데이터 등록 성공!");
		} else {
			System.out.println("데이터 등록 실패!");
		}
		
		return result;
	}

}
