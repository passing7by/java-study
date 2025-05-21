package homework.homework07.field01.controller;

import homework.homework07.field01.model.vo.Employee;

public class Run {
	public static void main(String[] args) {		
		Employee e1 = new Employee("김철수", "교육운영팀");
		Employee e2 = new Employee("이영희", "경영지원팀");
		
		System.out.println("이름=" + e1.getName() + ", 팀=" + e1.getTeam());
		System.out.println("이름=" + e2.getName() + ", 팀=" + e2.getTeam());
	}
}
