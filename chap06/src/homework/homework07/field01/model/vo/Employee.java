package homework.homework07.field01.model.vo;

public class Employee {
	// 이름, 팀, 직책, 월급, 보너스 필드
	/*
	 * - 이름, 팀은 외부 패키지에서 수정, 접근 가능
	 * - 직책, 월급은 내부 패키지에서만 수정, 접근 가능
	 * - 보너스는 클래스 내부에서만 수정, 접근 가능
	 */
	public String name;
	public String team;
	String position;
	int salary;
	private int bonus;

	public Employee() {

	}
	
	public Employee(String name, String team) {
		this.name = name;
		this.team = team;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTeam() {
		return team;
	}
}
