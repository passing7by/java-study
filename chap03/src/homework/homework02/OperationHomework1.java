package homework.homework02;

import java.util.Scanner;

public class OperationHomework1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("말해보세요 : ");
		String inputStr = sc.nextLine();
		
//		String parrotMsg = inputStr.equals("간다")? "온다" : "간다";
		
		// 위의 코드의 경우, inputStr가 만약 null이라면 nullPointerException 발생
		// 리스크를 줄이는 방법 - 문자열 비교 시, 한 쪽이 문자열 리터럴이라면 리터럴을 앞에다 쓰기
		String parrotMsg = "간다".equals(inputStr)? "온다" : "간다";
		
		System.out.println("앵무새 : " + parrotMsg);
	}
}
