package homework.homework08.object04.open.model.vo;

import homework.homework08.object04.open.controller.Person;

public class Run {
	public static void main(String[] args) {
		// getter, setter를 사용한 경우와 사용하지 않은 경우를 모두 구현
		// 출력 결과는 2가지 경우가 동일
		
		// 기본 생성자로 객체를 만드세요.
		Person p = new Person();
		
		// “김철수”, 20을 각각 이름과 나이 필드의 값으로 대입하세요.
		p.name = "김철수";
		p.age = 20;
		
		// 2번에서 대입한 값을 활용하여 출력하세요.
		System.out.println(p.name + "는 " + p.age + "살 입니다.");
	}
}
