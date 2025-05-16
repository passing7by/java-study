package sec02.exam10;

import java.util.Scanner;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		int result = 0;		
		
		result += 10;
		System.out.println("result=" + result);	// 10
		
		result -= 5;
		System.out.println("result=" + result);	// 5	
		
		result *= 3;
		System.out.println("result=" + result);	// 15
		
		result /= 5;
		System.out.println("result=" + result);	// 3
		
		result %= 3;
		System.out.println("result=" + result);	// 0
		
		// Quiz
//		금액을 입력받아 500원, 100원, 50원, 10원, 1원 동전으로 변경하려고 합니다.
//		최소 필요한 동전의 개수를 출력하는 프로그램을 구현하시오.
//
//		[입력]
//		5640
//
//		[출력]
//		500원:11개
//		100원:1개
//		50원:0개
//		10원:4개
//		1원:0개
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		// me
		int num500 = num / 500;
		System.out.println("500원: " + num500 + "개");
		
		int num100 = (num % 500) / 100;
		System.out.println("100원: " + num100 + "개");
		
		int num50 = (num % 100) / 50;
		System.out.println("50원: " + num50 + "개");
		
		int num10 = (num % 50) / 10;
		System.out.println("10원: " + num10 + "개");
		
		int num1 = num % 10;
		System.out.println("원: " + num1 + "개");
		
		// 강사님
		int coin500 = num / 500;
		num %= 500;
		
		int coin100 = num / 100;
		num %= 100;
		
		int coin50 = num / 50;
		num %= 50;
				
		int coin10 = num / 10;
		num %= 10;
		
		int coin1 = num; // 남은 금액은 전부 1원
		
		System.out.println("500원: " + coin500 + "개");
		System.out.println("100원: " + coin100 + "개");
		System.out.println("50원: " + coin50 + "개");
		System.out.println("10원: " + coin10 + "개");
		System.out.println("1원: " + coin1 + "개");
		
		sc.close();
	}

}
