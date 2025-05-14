package sec04.exam05;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputdata;
		
		while (true) {
			inputdata = scanner.nextLine(); // 스캐너에서 읽은 한 라인 전체(엔터키 이전까지)
			
			if(inputdata.equals("q")) break;
			
			System.out.println("입력된 문자열: \"" + inputdata + "\"");			
		}
		
		System.out.println("종료");
		
		// Quiz
		// 2개의 int 값을 입력받아 입력받은 값을 화면에 ,로 연결하여 출력하시오.
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		System.out.println(num1 + "," + num2);
	}
}
