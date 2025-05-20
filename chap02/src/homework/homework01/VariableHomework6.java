package homework.homework01;

import java.util.Scanner;

public class VariableHomework6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("한 자리 숫자를 입력하세요 : ");
		char inputChar = sc.nextLine().charAt(0); // 문자열을 입력받아 첫 번째 문자를 저장
//		System.out.println(inputChar);

		// me
//		int inputInt = Integer.parseInt(inputChar + "");
		// char를 int에 저장할 경우, 유니코드가 저장됨
		// 문자의 숫자값 자체를 int로 변환하기 위해서 문자를 문자열로 만든 다음 Integer.parseInt() 사용		
		
		// 강사님
		int inputInt = inputChar -'0';
		
//		System.out.println(inputInt);
		int squareResult = (int) Math.pow(inputInt, 2);
		
		System.out.println("입력한 숫자의 제곱은 " + squareResult + "입니다.");
	}
}
