package test3;

public class InstanceExample {
	public static void main(String[] args) {
		Parent parent = new Child(); // 자동 타입 변환이 일어남
		
//		System.out.println(parent instanceof Child); // true
//		System.out.println(parent instanceof Child child); // true
//		
//		boolean type1 = parent instanceof Child;
//		boolean type2 = parent instanceof Child child2;
//		
//		System.out.println(type1);
//		System.out.println(type2);
//		
//		
		if (parent instanceof Child child) {
			child.field1 = "";
		}
	}
}
