package sec02.exam11;

import java.util.Scanner;

public class ConditionalOperatorExample {
	public static void main(String[] args) {
		int score = 45;
		
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C'); // 삼항연산자 안에 삼항연산자 사용 가능
		System.out.println(score + "점은 " + grade + "등급입니다.");
		
		// Quiz
//		0~100사이의 점수를 입력받아
//		점수가 60점 이상이면 "합격",
//		60점 미만인 경우 "불합격"을 출력하는 프로그램을 구현하시오.
//		단 음수이거나 100이 넘는 점수는 "점수입력오류"로 출력한다.
//
//		[입력] [출력]
//		 85 => 합격
//		 50 => 불합격
//		-10 => 점수입력오류
		
//		int score1 = 60; // 합격
//		int score2 = 59; // 불합격
//		int score3 = 101; // 점수입력오류
		
		Scanner sc = new Scanner(System.in);
		int nowScore = sc.nextInt();
		
//		String result = (nowScore > 100) ? "점수입력오류" : (nowScore >= 60) ? "합격" : "불합격"; // 점수가 음수인 예외 케이스 커버 못함
//		String result = (nowScore > 100 || nowScore < 0) ? "점수입력오류" : (nowScore >= 60) ? "합격" : "불합격"; // 가독성 안좋음
		String result = (nowScore > 100 || nowScore < 0) ? 
						"점수입력오류" : 
						((nowScore >= 60) ? "합격" : "불합격");
		System.out.println(result);
	}
}
