package sec03.exam01;

public class PromotionExample {
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue; // 1byte -> 4byte, 자동 형변환(Promotion) 가능
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		intValue = charValue; // 2byte -> 4byte, 자동 형변환 가능
		System.out.println("intValue: " + intValue);
		
		intValue = 30;
		long longValue = intValue; // 4byte -> 8byte, 자동 형변환 가능
		System.out.println("longValue: " + longValue);
		
		longValue = 100;
		float floatValue = longValue; // 8byte -> 4byte 인데 자동 형변환 가능
		// 왜? 실제 저장 가능한 값의 범위는 float > long 이기 때문
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue; // 4byte -> 8byte, 자동 형변환 가능
		System.out.println("doubleValue: " + doubleValue);
		
		// 주의! byte -> char로 자동 형변환 불가
		// 1byte -> 2byte인데 왜 안되는가?
		// byte의 범위와 char의 범위가 다름 -> char는 음수 미포함, byte는 음수 포함
		byte byteVal = 65;
//		char charVal = byteVal;
	}
}
