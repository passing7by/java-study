package homework.homework04.me;

import java.util.Scanner;

public class LoopHomework1 {
	public static void main(String[] args) {
//		TODO: 출력 양식도 고려하여 수정하기
		// 입력
		Scanner sc = new Scanner(System.in);
		int num = 0;			
		
		// 분기 및 반복
		do {
			System.out.println("1~50 사이의 정수를 입력하세요.");
			num = sc.nextInt();			
		} while (num < 1 || num > 50);
		
		// 실행
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			if (i % 2 == 0) sum += i;
		}
		
		// 출력
		System.out.println("합계: " + sum);
	}
}
