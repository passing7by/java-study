package homework.homework05.me;

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
		
		outer: while (true) {
			while (true) {				
				System.out.println("가위바위보 : ");
				inputStr = sc.nextLine();
				
				if ("stop".equals(inputStr)) break outer;
				else if ("가위".equals(inputStr) || "바위".equals(inputStr) || "보".equals(inputStr)) break;
				else System.out.println("잘못 입력하셨습니다.");
			}
			int input = 0;
			
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
			
			cnt++;
			
			switch (result) {
				case 0: {
					System.out.println("비겼습니다.");
					break;
				}
				case -1: {
					System.out.println("졌습니다.....ㅠㅠ");
					lose++;
					break;
				}
				case -2: {
					System.out.println("이겼습니다!! 오예!");
					win++;
					break;
				}
			}			
		}
		System.out.println(cnt+ "전 " + win + "승 " + draw + "무 " + lose + "패");
	}
}
