package homework.homework08.object01.model.vo;

public class Member {
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	// memberName값 변경
	public void changeName(String memberName) {
		this.memberName = memberName;
	}
	
	// memberName값 출력
	public void printName() {
		System.out.println(memberName);
	}
}
