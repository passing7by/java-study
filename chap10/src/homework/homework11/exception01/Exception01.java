package homework.homework11.exception01;

import java.util.Scanner;

public class Exception01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int randomNum = (int) (Math.random() * 50) + 1;
		System.out.println(randomNum);
		int inputNum = 0;
		
		while (true) {
			try {
				System.out.print("1~50사이의 숫자 : ");
				inputNum = Integer.parseInt(sc.nextLine()); // 문자를 입력 시, NumberFormatException 발생하는 코드			
			} catch (NumberFormatException e) {
				System.out.println("잘못된 값입니다. 숫자를 입력해주세요.");
				continue;
			}
			
			if (inputNum == randomNum) {
				System.out.println("축하합니다~ 정답이에요");
				return;
			}
			else if (inputNum > randomNum) System.out.println("Down!");
			else System.out.println("up!");
		}
	}
}
