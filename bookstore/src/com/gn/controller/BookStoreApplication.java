package com.gn.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.gn.model.vo.Book;
import com.gn.model.vo.Novel;
import com.gn.model.vo.Poem;
import com.gn.service.BookService;
import com.gn.service.BookServiceImpl;

public class BookStoreApplication {
	private static Scanner sc = new Scanner(System.in);
	private static BookService bookService = new BookServiceImpl(); // 도서관 비즈니스 로직 객체
	private static List<Book> bookList = null; // 책 목록
	private static Book book; // 책 객체
	
	// 평균 가격을 계산하는 메서드
	private static double calulateAvgPrice(List<Book> bookList) {
		double priceSum = 0;
		for (Book book : bookList) {
			priceSum += book.getPrice();
		}
		double priceAvg = priceSum / bookList.size();
		
		return (double) Math.round(priceAvg * 100) / 100;
	}
	
	public static void main(String[] args) {
		/*
		bookList = new ArrayList<Book>();
		bookList.add(new Novel("97*8937460449", 14000));
		bookList.add(new Poem("9791193937655", 9000));
		bookList.add(new Novel("97889*7461798", 15000));
		
		// 도서 정보 출력 전에 손상된 isbn 복구
		bookList.forEach(book -> book.recoverMissingDigit());
		
		// 전체 도서 정보 출력
		bookList.forEach(book -> book.printInfo());
		
		System.out.println();
		
		// 평균 가격 출력
		double priceSum = 0;
		for (Book book : bookList) {
			priceSum += book.getPrice();
		}
		double priceAvg = priceSum / bookList.size();
		System.out.println("총 평균 가격 : " +  (double) Math.round(priceAvg * 100) / 100);
		*/
				
		bookList = new ArrayList<Book>();
		
		boolean isKeepInput = true;
		while (isKeepInput) {
			String bookType = "";
			String isbn = "";
			int price = 0;
			
			while (true) {
				System.out.print("책 종류를 입력하세요 (소설/시): ");
				bookType = sc.nextLine();
				
				if ("소설".equals(bookType)) {
					book = new Novel();
					break;
				} else if ("시".equals(bookType)) {
					book = new Poem();
					break;
				}
				else System.out.println("잘못된 종류입니다. 다시 입력해주세요.");
			}

			while (true) {
				System.out.print("ISBN을 입력하세요 (13자리, * 포함 가능): ");
				isbn = sc.nextLine();
				book.setIsbn(isbn);
				
				if (book.isValidISBN()) {
					break;
				}
				else System.out.println("유효하지 않은 ISBN입니다");
			}
			
			while (true) {
				System.out.print("가격을 입력하세요: ");
				
				try {
					price = sc.nextInt();
					sc.nextLine();
				} catch (NumberFormatException e) {
					System.out.println("숫자를 입력해 주세요.");
					continue;
				}
				
				book.setPrice(price);
				break;
			}
			
			bookService.insert(book);
			bookList.add(book);

			System.out.print("입력을 종료하시겠습니까? (y/Y 입력 시 종료): ");
			if (sc.nextLine().equalsIgnoreCase("Y")) isKeepInput = false;
			else isKeepInput = true;
		}
		
		System.out.println();
		
		System.out.println("===== 도서 목록 =====");
		
		// 전체 도서 정보 출력
		bookList.forEach(book -> book.printInfo());
		
		System.out.println();
		
		// 평균 가격 출력
		System.out.println("총 평균 가격 : " +  calulateAvgPrice(bookList));
	}
}
