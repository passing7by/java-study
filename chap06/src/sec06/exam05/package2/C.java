package sec06.exam05.package2;

import sec06.exam05.package1.A;

public class C {
	public C() {
		// 클래스 내부에서는 모두 사용 가능
		A a = new A();
		a.field1 = 1;
//		a.field2 = 1;
//		a.field3 = 1;
		
		a.method1();
//		a.method2();
//		a.method3();
	}
	
	public void method() {
		A a = new A();
		a.field1 = 1;
//		a.field2 = 1;
//		a.field3 = 1;
		
		a.method1();
//		a.method2();
//		a.method3();
	}

}
