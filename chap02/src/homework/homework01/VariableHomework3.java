package homework.homework01;

import java.util.Scanner;

public class VariableHomework3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		char char1 = str.charAt(0);
		char char2 = str.charAt(1);
		char char3 = str.charAt(2);
		
		System.out.println("첫번째 문자 : " + char1);
		System.out.println("두번째 문자 : " + char2);
		System.out.println("세번째 문자 : " + char3);
	}
}
