package homework;

import java.util.Scanner;

public class ConditionHomework6 {
	public static void main(String[] args) {
		System.out.println("=== 합격인가? 불합격인가? ===");
		
		Scanner sc = new Scanner(System.in);

		System.out.println("각 과목의 점수를 입력하세요.");
		System.out.println("소프트웨어설계 점수: ");
		int score1 = sc.nextInt();
		System.out.println("소프트웨어개발 점수: ");
		int score2 = sc.nextInt();
		System.out.println("데이터베이스구축 점수: ");
		int score3 = sc.nextInt();
		System.out.println("프로그래밍언어활용 점수: ");
		int score4 = sc.nextInt();
		System.out.println("정보시스템구축관리 점수: ");
		int score5 = sc.nextInt();
		
		boolean isPass = false;
		int avg = (score1 + score2 + score3 + score4 + score5) / 5;
		
		String failSubject = "";
		
		// 과락 과목이 여러개일 경우, 더 앞에 있는 과목을 출력
		if (score1 < 40) failSubject = "소프트웨어설계";
		else if (score2 < 40) failSubject = "소프트웨어개발";
		else if (score3 < 40) failSubject = "데이터베이스구축";
		else if (score4 < 40) failSubject = "프로그래밍언어활용";
		else if (score5 < 40) failSubject = "정보시스템구축관리";
		// 과락 과목이 없을 경우
		else isPass = true;
				
		String msg = "";
		
		// 과락 과목이 있으면서 평균 60점 이상일 수도 있고, 과락 과목이 없으면서 평균 60점 미만일 수도 있음
		if (isPass && avg >= 60) msg = "합격을 축하합니다.";
		// 평균이 60 미만이면서 과락 과목이 있을 경우, 평균 점수를 기준으로 불합격시킴
		else if (avg < 60) msg = "평균 점수 60점 미만으로 불합격입니다.";
		else if (!isPass) msg = failSubject + " 과목 과락으로 불합격입니다";
		
		System.out.println(msg);
	}
}
