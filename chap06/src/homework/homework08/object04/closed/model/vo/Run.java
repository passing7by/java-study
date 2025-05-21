package homework.homework08.object04.closed.model.vo;

import homework.homework08.object04.closed.controller.Person;

public class Run {
	public static void main(String[] args) {
		// getter, setter를 사용한 경우와 사용하지 않은 경우를 모두 구현
		// 출력 결과는 2가지 경우가 동일
		
		// 기본 생성자로 객체를 만드세요.
		Person p = new Person();
		
		// setter를 이용해 이름과 나이 값을 변경하세요. - “김철수”, 20
		p.setName("김철수");
		p.setAge(20);
		
		// getter를 이용해 출력하세요.
		System.out.println(p.getName() + "는 " + p.getAge() + "살 입니다.");
	}
}
