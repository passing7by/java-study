package homework.homework08.object01.controller;

import homework.homework08.object01.model.vo.Member;

public class Run {
	public static void main(String[] args) {
		// 기본 생성자를 통해 Member 타입의 객체 생성
		Member m = new Member();
				
		// changeName 메소드를 호출해 memberName값 변경
		m.changeName("김민지");
		
		// printName 메소드를 호출해 memberName값 출력
		m.printName();
	}
}
