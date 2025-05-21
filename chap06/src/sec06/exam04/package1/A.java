package sec06.exam04.package1;

// 아무것도 안 붙이면 default 접근 제한 => 같은 패키지에서만 사용할 수 있음
public class A {
	// 클래스 내부에서는 public, default, private 3개의 생성자를 전부 사용 가능
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	// 생성자 오버로딩
	public A(boolean b) {}
	A(int b) {}
	private A(String s) {}
}
