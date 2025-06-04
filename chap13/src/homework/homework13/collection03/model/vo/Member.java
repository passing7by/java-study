package homework.homework13.collection03.model.vo;

public class Member {
	private String password;
	private String name;
	
	public Member() {
	
	}
	
	public Member(String password, String name) {
		this.password = password;
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// TODO 출력 형식에 맞춰 수정 필요
	@Override
	public String toString() {
		return "Member [password=" + password + ", name=" + name + "]";
	}
}
