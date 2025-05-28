package homework.homework12.string03;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 사용자로부터 이메일 주소를 입력 받음
		// 입력받은 이메일에 앞뒤 공백을 제거
		String email = sc.nextLine().trim();
		
		// 이메일이 @goodee.co.kr로 끝나는지 확인
		// 만일 @뒤에 글자가 위와 다를 경우 “유효하지 않은 이메일입니다.”를 출력
		// 유효한 이메일이라면, 아이디(@앞부분)을 추출하면 대문자로 변환한 뒤 출력
		if (!email.endsWith("@goodee.co.kr")) System.out.println("유효하지 않은 이메일입니다.");
		else {
			String upperCaseId = email.substring(0, email.indexOf("@")).toUpperCase();
			System.out.println("아이디 : " + upperCaseId);
		}
	}
}
