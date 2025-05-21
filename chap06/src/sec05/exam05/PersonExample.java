package sec05.exam05;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.name);
		System.out.println(p1.ssn);
		
//		p1.nation = "usa"; // The final field Person.nation cannot be assigned
//		p1.ssn = "654321-6543217"; // The final field Person.ssn cannot be assigned
		p1.name = "홍삼원";
		System.out.println(p1.name);
	}
}
