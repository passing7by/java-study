package homework.homework12.string04;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String totalInput = "";
		
		while (true) {			
			// 사용자로부터 문자를 반복해서 입력받음
			System.out.print("문자열 : ");
			String input = sc.nextLine();
			
			// 입력받은 문자가 n 또는 N이 되면 프로그램을 종료
			// 이때, 조건식에 논리연산자(&& 혹은 ||)를 사용할 수 없음
			if (input.toLowerCase().equals("n")) {
				System.out.println("프로그램을 종료합니다.");
				
				// 프로그램을 종료함과 동시에 지금까지 입력한 문자를 출력
				System.out.print("최종 문자열 : ");
				System.out.println(totalInput);
				return;
			}
			
			totalInput = totalInput.concat(input);
		}
		
	}
}
