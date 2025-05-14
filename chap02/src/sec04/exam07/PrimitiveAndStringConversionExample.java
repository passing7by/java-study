package sec04.exam07;

public class PrimitiveAndStringConversionExample {
	public static void main(String[] args) {
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		
//		System.out.println(Integer.parseInt("1a")); // NumberFormatException: For input string: "1a"
		// 숫자로 변환 불가한 경우 예외 발생
//		System.out.println(Byte.parseByte("128")); //NumberFormatException: Value out of range. Value:"128" Radix:10
		// byte 값의 범위를 벗어남
		
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("str1: " +  str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
		
		// [추가 학습: 기본 타입의 타입값 얻기 -> 래퍼 클래스로 Boxing 하여 확인]
		int intVal = 12;
		double doubleVal = 12.12;
		boolean booleanVal = true;
		System.out.println(((Object)intVal).getClass().getName());
		System.out.println(((Object)doubleVal).getClass().getName());
		System.out.println(((Object)booleanVal).getClass().getName());
	}
}
