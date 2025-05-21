package homework.homework07.field02.controller;

import homework.homework07.field02.model.vo.Person;

public class Run {
	public static void main(String[] args) {
		Person p1 = new Person("01012345678", 190.5, 100.2);
		Person p2 = new Person("01056434563", 175.4, 65.6);

		System.out.println("전화번호=" + p1.getPhoneNum() + ", 키=" + p1.getHeight() + ", 몸무게=" + p1.getWeight());
		System.out.println("전화번호=" + p2.getPhoneNum() + ", 키=" + p2.getHeight() + ", 몸무게=" + p2.getWeight());
	}
	
}
