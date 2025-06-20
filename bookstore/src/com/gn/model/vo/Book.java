package com.gn.model.vo;

public class Book {
	// 필드 - private: 캡슐화
	private String isbn;
	private String type;
	private int price;
	
	// 생성자 및 메서드 - public: 다른 패키지의 클래스에서 접근 가능하도록
	public Book() {
		
	}
	
	public Book(String isbn, int price) {
		this.isbn = isbn;
		this.price = price;
	}
	
	public Book(String isbn, String type, int price) {
		this.isbn = isbn;
		this.type = type;
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void printInfo() {
		System.out.println("ISBN : " + isbn + ", 가격 : " + price + "원");
	}

	public void recoverMissingDigit() {
		// 가중치가 1313... 으로 부여됨 => 짝수번째 인덱스는 가중치 1, 홀수번째 숫자는 가중치 3
		
		int starIdx = 0; // "*"이 있는 인덱스
		
		String[] isbnNumsOfStr = isbn.split("");
		
		// int[] 배열에 옮겨담음
		int[] isbnNums = new int[isbnNumsOfStr.length];
		for (int i = 0; i < isbnNums.length; i++) {
			try {
				isbnNums[i] = Integer.parseInt(isbnNumsOfStr[i]);				
			} catch (NumberFormatException e) {
				// "*"이 있는 자리에는 임시로 0을 넣고 인덱스 기억
				isbnNums[i] = 0;
				starIdx = i;
			}
		}
		// isbn 복구 시작
		// 1. 가중치 부여
		for (int i = 0; i < isbnNums.length; i++) {
			// i가 홀수면 가중치 3 부여 
			if (i % 2 != 0) isbnNums[i] = isbnNums[i] * 3;
		}
		
		// 2. isbnNums의 값을 모두 더해서 10으로 나눈 나머지가 0이 되게 하는 값을 찾기
		// 즉, 더했을 때 합을 10의 배수로 만드는 값을 찾아야 함
		// "*"가
		// 짝수 인덱스 -> 더했을 때 10의 배수로 만드는 숫자 [(0 + isbnNums의 합) % 10 == 0]
		// 홀수 인덱스 -> 3을 곱해서 더했을 때 10의 배수로 만드는 숫자 [(0*3 + isbnNums의 합) % 10 == 0]
		
		// isbnNums의 합을 구함
		int sumOfisbnNums = 0;
		for (int i : isbnNums) {
			sumOfisbnNums += i;
		}
		
		int recoveredNum = 0;
		// 0~9까지 돌면서 체크하되, 인덱스의 짝/홀에 따라 달리함
		for (int i = 0; i < 9; i++) {
			if (starIdx % 2 == 0) { // starIdx가 짝수면
				if ((i + sumOfisbnNums) % 10 == 0) {
					recoveredNum = i;
					break;
				}
			} else { // starIdx가 홀수면
				if ((i * 3 + sumOfisbnNums) % 10 == 0) {
					recoveredNum = i;
					break;
				}
			}
		}
		
		isbn = isbn.replace("*", String.valueOf(recoveredNum));
		System.out.println("isbn 복구 완료:" + isbn.replace("*", String.valueOf(recoveredNum)));
	}
	
	public boolean isValidISBN() {
		// 13자리가 아닌 ISBN은 입력 거부
		if (isbn.length() != 13) return false;
		
		// *이 여러 개 있을 경우 입력 거부
		int starCnt = 0; // *의 등장 횟수
		for (char c : isbn.toCharArray()) {
			// 숫자가 아닌 경우 -> *이고 starcount >=2 면 return false
			if (c < '0' || c > '9') {
				if (c != '*') return false;
				else {
					starCnt++;
					if (starCnt >= 2) return false;
				}
			}
		}
		
		// 유효성 통과 후 "*"이 있을 경우 복구 시도
		if (starCnt == 1) recoverMissingDigit();
		System.out.println("isbn: " + isbn);
		
		return true;
	}
	
}
