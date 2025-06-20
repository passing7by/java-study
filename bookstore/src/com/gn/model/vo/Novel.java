package com.gn.model.vo;

public class Novel extends Book {
	// 자식만의 필드는 없으므로 부모 생성자만을 이용하여 자식 객체 생성
	public Novel() {
		super();
		this.setType("소설");
	}

	public Novel(String isbn, int price) {
		super(isbn, "소설", price);
	}
	
	public Novel(String isbn, String type, int price) {
		super(isbn, type, price);
	}

	@Override
	public void printInfo() {
		System.out.print("[소설] ");
		super.printInfo();
	}
}
