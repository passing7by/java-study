package homework.homework09.inherit01.model.vo;

public class Student extends Person {
	private int grade;
	private String major;
	
	public Student() {

	}
	
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		this.name = name;
		this.grade = grade;
		this.major = major;
	}

	@Override
	public String toString() {
		String str = "";
		str += super.toString();
		str += "\n";
		str += "학년 : " + grade + "\n";
		str += "전공 : " + major;
		return str;
	}

	// getter/setter 추가
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
}
