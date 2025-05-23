package sec02.exam05;

public class InstanceExample {
	public static void main(String[] args) {
		Parent parent = new Child(); // 자동 타입 변환이 일어남
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		// Parent 타입에는 없으므로 쓸 수 없다.
//		parent.field2 = "data2"; // field2 cannot be resolved or is not a field
//		parent.method3(); // The method method3() is undefined for the type Parent
		
//		Child child = parent; // Type mismatch: cannot convert from Parent to Child
		Child child = (Child) parent; // 강제 타입 변환
		
		// Child 타입으로 변환 후에는 Child의 멤버에 접근 가능해짐
		child.field2 = "yyy";
		child.method3();
	}
}
