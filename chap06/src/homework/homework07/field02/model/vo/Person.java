package homework.homework07.field02.model.vo;

public class Person {
	// 이름, 주소, 전화번호, 키, 몸무게 필드
	/*
	 * - 이름, 주소는 클래스 내부에서만 활용 가능
	 * - 전화번호, 키, 몸무게는 외부 패키지에서 활용 가능
	 */
	private String name;
	private String address;
	public String phoneNum;
	public double height;
	public double weight;
	
	public Person() {

	}
	
	public Person(String phoneNum, double height, double weight) {
		this.phoneNum = phoneNum;
		this.height = height;
		this.weight = weight;
	}
	
	public String getPhoneNum() {
		return phoneNum;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWeight() {
		return weight;
	}
}
