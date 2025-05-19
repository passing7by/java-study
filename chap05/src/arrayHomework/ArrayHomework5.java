package arrayHomework;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayHomework5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] choices = {"가위", "바위", "보"};
		
		String inputStr = "";
		int cnt = 0;
		int win = 0;
		int lose = 0;
		int draw = cnt - (win + lose);
		
		while (true) {
			cnt++;
			
			System.out.println("가위바위보 : ");
			inputStr = sc.nextLine();
			int input = 0;
			
			if ("stop".equals(inputStr)) break;
			// TODO: 잘못 입력했을 때 입력 다시 받는 것 구현하기
			
			switch(inputStr) {
			case "바위":
				input = 1;
			case "보":
				input = 2;
			}
			
			int computer =  (int) Math.random()*3;
			String computerStr =  choices[computer];
			
			System.out.println("컴퓨터: " + computerStr);
			System.out.println("사용자: " + inputStr);
			
			// 결과 출력
			// 사용자 - 컴퓨터
			// 가위(0) - 바위(1) -1 왼쪽 짐
			// 가위(0) - 보(2) -2 왼쪽 이김
			// 바위(1) - 보(2) -1 왼쪽 짐
			// 가위(0) - 보(2) -2 왼쪽 이김
			
			int result = input - computer;
			
			switch (result) {
				case 0: {
					System.out.println("비겼습니다.");
					break;
				}
				case -1: {
					System.out.println("졌습니다.....ㅠㅠ");
					break;
				}
				case -2: {
					System.out.println("이겼습니다!! 오예!");
					break;
				}
			}
		}
	}
}
