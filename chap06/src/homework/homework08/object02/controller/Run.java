package homework.homework08.object02.controller;

import homework.homework08.object02.model.vo.Rectangle;

public class Run {
	public static void main(String[] args) {
		// 기본 생성자를 통해 Rectangle type의 객체 생성
		Rectangle r1 = new Rectangle();
		
		// 매개변수 생성자를 통해서 Rectangle type의 객체 생성
		Rectangle r2 = new Rectangle(3, 5);
		
		// printInfo() 메소드를 호출하여 위 2개 객체의 정보를 출력
		r1.printInfo();
		r2.printInfo();
	}
}
