package homework.homework04.me;

import java.util.Scanner;

public class LoopHomework8 {
	public static void main(String[] args) {
		// 입력
		Scanner sc = new Scanner(System.in);	
		
		char answer = 'n';
		
		do {
			System.out.println("문자열 : ");
			String inputStr = sc.nextLine();
			System.out.println("문자 : ");
			char inputCh = sc.nextLine().charAt(0);
			
			int cnt = 0;
			
			// 해당 문자열에 그 문자가 몇 개 있는지 개수를 출력
			for (int i = 0; i < inputStr.length(); i++) {
				if (inputStr.charAt(i) == inputCh) cnt++;
			}
			
			System.out.println("포함된 개수 : " + cnt);
			
			// 출력이 끝난 후 분기 및 입력 반복
			
			System.out.println("다시 입력하시겠습니까? : ");
			answer = sc.nextLine().charAt(0);
			
			while (answer != 'n' && answer != 'y') {
				System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
				
				System.out.println("다시 입력하시겠습니까? : ");
				answer = sc.nextLine().charAt(0);				
			}
		} while (answer == 'y');
	}
}
