package homework2;

import java.util.Scanner;

public class LoopHomework5 {
	public static void main(String[] args) {
		// 입력 (0이 아니면 반복)
		Scanner sc = new Scanner(System.in);
		int inputNum = 0;
		int sum = 0;
		
		do {
			System.out.println("숫자(0을 입력하면 종료) : ");
			inputNum = sc.nextInt();

			if (inputNum < 0) continue;
			sum += inputNum;
		} while (inputNum != 0);
		
		// 출력 (0이 입력되면)
		System.out.println("양수의 합계 : " + sum);
		
		
	}
}
