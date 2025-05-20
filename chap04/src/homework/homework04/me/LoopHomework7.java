package homework.homework04.me;

import java.util.Scanner;

public class LoopHomework7 {
	public static void main(String[] args) {
		// 입력
		Scanner sc = new Scanner(System.in);		
		System.out.println("정수: ");
		int inputNum = sc.nextInt();
		
		// 분기및 반복
		// 양수가 아닌 경우 안내메시지 출력 후 다시 입력
		while (inputNum <= 0) {
			System.out.println("양수가 아닙니다.");
			System.out.println("정수: ");
			inputNum = sc.nextInt();
		}
		
		// 양수인 경우 결과 출력
		for (int i = 1; i <= inputNum; i++) {
			if (i % 2 == 0) System.out.print("수");
			else System.out.print("박");
		}
	}
}
