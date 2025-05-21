package homework.homework08.object02.model.vo;

public class Rectangle {
	private int width;
	private int height;
	
	// 넓이, 높이의 기본값을 항상 1로 설정
	public Rectangle() {
		width = 1;
		height = 1;
	}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int calculateRound() {
		return width * 2 + height * 2;
	}
	
	public int calculateArea() {
		return width * height;
	}
	
	public void printInfo() {
		System.out.println("=== 사각형 정보 ==="); 
		System.out.println("1. 사각형의 둘레"); 
		System.out.println(calculateRound() + "cm"); 
		System.out.println("2. 사각형의 넓이"); 
		System.out.println(calculateArea() + "cm");	
	}
}
