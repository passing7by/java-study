package sec01.exam03;

import java.util.Scanner;

public class IfElseIfElseExample {
	public static void main(String[] args) {		
		int score = 83;
		
		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		} else if (score >= 80){ // 80 <= score < 90
			System.out.println("점수가 80~89 입니다.");
			System.out.println("등급은 B 입니다.");
		} else if (score >= 70){ // 70 <= score < 80
			System.out.println("점수가 70~79 입니다.");
			System.out.println("등급은 C 입니다.");
		} else { // score < 70
			System.out.println("점수가 70 미만 입니다.");
			System.out.println("등급은 D 입니다.");
		}
		
		// 정리:
		// 1. 조건식을 여러 개 작성할 수 있다.(개수는 제한 없음)
		// 2. 조건식이 true가 되는 블록만 실행하고 if문을 빠져나간다.
		
		// Quiz
//		한 개의 문자를 입력받아
//		대문자, 소문자, 숫자, 기타문자인지를 출력하는 프로그램을 구현하시오.
//
//		[입력]   [출력]
//		  A  => 대문자
//		  a  => 소문자
//		  0  => 숫자
//		  가  => 기타문자
		
//		char c1 = 'A';
//		char c2 = 'a';
//		char c3 = '0';
//		char c4 = '가';
		
		Scanner sc = new Scanner(System.in);
		char inputC = sc.nextLine().charAt(0);
		String msg = "기타문자";
		
		// 문자는 다음과 같이 비교연산자 사용 가능
		// 'a' >= 'a' && 'a' < 'z'
		
		// 그니까, 직접 유니코드 값을 넣을 필요가 없다는거지... 왜? 그냥 Character 값 넣어서 비교하면 되니깐.
		// 근데 내가 처음에 갈피를 못 잡았던 이유? 이 파일의 윗부분 예제 코드에서 숫자로 비교하길래.... 뭔가 숫자를 비교해서 로직을 짜는 건 줄 알았음
		// 근데? 문제에는 그런 내용 없잖아? 내가 문제를 잘못 해석한거임.
				
		if (inputC >= 'A' && inputC <= 'Z') msg = "대문자";
		else if (inputC >= 'a' && inputC <= 'z') msg = "소문자";
		else if (inputC >= '0' && inputC <= '9') msg = "숫자";
		
		System.out.println(msg);
		
	}
}
