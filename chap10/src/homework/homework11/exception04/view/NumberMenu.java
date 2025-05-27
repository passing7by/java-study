package homework.homework11.exception04.view;

import java.util.Scanner;

import homework.homework11.exception04.controller.NumberController;
import homework.homework11.exception04.exception.NumRangeException;

public class NumberMenu {
	public static void menu() {
		// 사용자에게 두 정수 입력 받음
		// NumberController의 checkDouble에 매개변수 넘겨줌
		// 반환값 출력
		// checkDouble() 메소드 호출부분을
		// try~catch를 이용하여 예외처리
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수1 : ");
		int num1 = sc.nextInt();
		System.out.println("정수2 : ");
		int num2 = sc.nextInt();
		
		try {
			boolean isDouble = NumberController.checkDouble(num1, num2);
			System.out.println(num1 + "은(는) " + num2 + "의 배수인가? " + isDouble);
		} catch (NumRangeException e) {
			e.printStackTrace();
		}
	}
}
