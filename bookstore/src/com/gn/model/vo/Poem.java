package com.gn.model.vo;

public class Poem extends Book {
	// 자식만의 필드는 없으므로 부모 생성자만을 이용하여 자식 객체 생성
	public Poem() {
		super();
		this.setType("시");
	}

	public Poem(String isbn, int price) {
		super(isbn, "시", price);
	}
	
	public Poem(String isbn, String type, int price) {
		super(isbn, type, price);
	}

	@Override
	public void printInfo() {
		System.out.print("[시] ");
		super.printInfo();
	}
}
