package homework.homework08.object03.controller;

import homework.homework08.object03.model.vo.Employee;

public class Run {
	public static void main(String[] args) {
		// 기본 생성자를 통해 객체를 구성
		Employee e = new Employee();
		
		// Setter를 이용해 값 변경
		e.setEmpNo(100);
		e.setEmpName("홍길동");
		e.setDept("영업부 ");
		e.setJob("과장");
		e.setAge(25);
		e.setGender('남');
		e.setSalary(3000000);
		e.setBonus(0.05);
		e.setPhone("010-123-4567");
		e.setAddress("서울시 강남구");
		
		// Getter를 이용해 출력
		System.out.println("=== " + e.getEmpName() + "의 정보 ===");
		System.out.println("사번 : " + e.getEmpNo());
		System.out.println("부서 : " + e.getDept());
		System.out.println("직급 : " + e.getJob());
		System.out.println("나이 : " + e.getAge());
		System.out.println("월급 : " + e.getSalary());
		System.out.println("전화번호 : " + e.getPhone());
		System.out.println("주소 : " + e.getAddress());
	}
}
