package sec01.exam26;

public class ValueCompareExample {
	public static void main(String[] args) {
		// Wrapper 객체 내부의 값을 비교할 때는 ==을 사용하지 않는게 좋음
		// 언박싱 한 값으로 비교하거나, equals() 메소드를 사용
		System.out.println("[-128~127 초과값일 경우]");
		Integer obj1 = 300; // 자동 박싱
		Integer obj2 = 300; // 자동 박싱
		System.out.println("==결과: " + (obj1 == obj2));
		System.out.println("언박싱후 ==결과: " + (obj1.intValue() == obj2.intValue()));
		System.out.println("언박싱후 ==결과: " + ((int) obj1 == (int) obj2));
		System.out.println("equals() 결과: " + obj1.equals(obj2));
		System.out.println();
		
		// 예외: 범위값 안에 들어갈 경우 하나의 Integer 객체를 공유한다.
		System.out.println("[-128~127 범위값일 경우]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==결과: " + (obj3 == obj4)); // obj3과 obj4는 같은 객체를 참조함
		System.out.println("언박싱후 ==결과: " + (obj3.intValue() == obj4.intValue()));
		System.out.println("equals() 결과: " + obj1.equals(obj2));
	}
}
