package homework.homework09.inherit01.model.vo;

public class Employee extends Person {
	private int salary;
	private String dept;
	
	public Employee() {

	}
	
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		String str = "";
		str += super.toString();
		str += "\n";
		str += "급여 : " + salary + "\n";
		str += "부서 : " + dept;
		return str;
	}
	
	// getter/setter 추가
}
