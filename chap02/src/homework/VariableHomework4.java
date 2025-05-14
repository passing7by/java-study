package homework;

import java.util.Scanner;

public class VariableHomework4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자를 입력하세요 : ");
		String str = sc.nextLine();
		char c = str.charAt(0);
		int i = c; // c의 유니코드가 i에 저장됨
		
		System.out.println(c + "의 유니코드 : " + i);
	}
}
