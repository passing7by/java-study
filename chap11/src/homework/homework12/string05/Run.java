package homework.homework12.string05;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 사용자로부터 이름과 생년월일을 입력받기
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("생년월일 : ");
		String birthDate = sc.nextLine();
		
		// 입력받은 이름과 생년월일을 활용하여 아래 규칙에 따라 암호를 생성
		// 이름에서 첫글자를 추출
		// 생년월일에서 연도와 월을 추출
		// 이름의 첫글자+연도끝두자리+일+나머지 이름 형식으로 암호를 만들기
		char nameFirstCh = name.charAt(0);
		String yearMonth = birthDate.substring(2, 6);
		String remaningName = name.substring(1, name.length());
		
		System.out.print("생년월일 : " + nameFirstCh + yearMonth + remaningName);
	}
}
