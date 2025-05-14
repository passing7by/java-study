package sec03.exam02;

import java.util.Scanner;

public class CastingExample {
	public static void main(String[] args) {
		int intValue = 44032;
//		int intValue = 65601; // 이 값을 char 타입으로 캐스팅 시, 오버플로우 발생하여 'A' 출력됨
		char charValue = (char) intValue; // char 타입으로 강제 형변환
		System.out.println("charValue: " + charValue);
		
		long longValue = 500;
//		long longValue = 20000000000L; // 이 값을 char 타입으로 캐스팅 시, 오버플로우 발생하여 '-1474836480' 출력됨
		intValue = (int) longValue; // 강제 형변환 시 8byte 중 마지막 4byte만 넣음
		System.out.println("intValue: " + intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue; // 정수 부분만 저장됨
		System.out.println("intValue: " + intValue);
		
		// Quiz
//		long 타입을 입력받아 변수 number에 저장 후 number 변수의 값을
//		int 형으로 변환한 결과를 출력하시오.
		Scanner sc = new Scanner(System.in);
		long number = sc.nextLong();
		System.out.println((int) number);
	}
}
