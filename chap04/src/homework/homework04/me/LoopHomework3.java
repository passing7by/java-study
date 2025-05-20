package homework.homework04.me;

import java.util.Scanner;

public class LoopHomework3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = "";
		
		do {			
			System.out.println("입력 : ");
			input = sc.nextLine();
		} while (!("탈출".equals(input)));
		
		System.out.println("프로그램 종료");
	}
}
