package loopHomework;

import java.util.Scanner;

public class LoopHomework2 {
	public static void main(String[] args) {
		// 입력
		Scanner sc = new Scanner(System.in);
		
		int num1 = 10;
		int num2 = -1;
		int num3 = 8;
		int num = 0;
		
		// 숫자는 계속 받음. 입력받는 숫자 유형에 따라 다른 반복문으로 들어감
		while (true) { // 숫자를 계속 입력받음
			System.out.println("숫자 : ");
			num = sc.nextInt();
			
			// 유형: 음수|9초과|0
			// 음수면
			while (num < 0) {
				System.out.println("양수만 입력해주세요.");
				num = sc.nextInt();
			}
			// 9를 초과하면
			while (num > 9) {
				System.out.println("9이하의 숫자를 입력해주세요.");
				num = sc.nextInt();
			}
			// 0이면
			if (num == 0) break;
			
			// 입력단~9단 구구단 출력
			for (int i = num; i <= 9; i++) {
				System.out.println("=== "+ i + "단 ===");
				for (int j = 1; j <= 9; j++) {
					System.out.println(i + "*" + j + "=" +(i*j));
				}
			}
		}
	}
}
