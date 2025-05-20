package homework.homework03.me;

import java.util.Scanner;

public class ConditionHomework2 {
	public static void main(String[] args) {
		System.out.println("=== 일기예보 ===");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월 : ");
		int month = sc.nextInt();
		System.out.println("기온: ");
		int degree = sc.nextInt();
		
		String season = "";
		
		String msg = "";
		
		// me
//		if (month > 12 || month < 1) msg = "해당하는 계절이 없음";
//		else if (month <= 5) season = "봄";
//		else if (month <= 8) season = "여름";
//		else if (month <= 11) season = "가을";
//		else season = "겨울";
		
//		if(season.equals("겨울")) {
//			if (degree <= -15) msg = " 한파 경보";
//			else if (degree <= -12) msg = " 한파 주의보";
//		}
//		
//		if(season.equals("여름")) {
//			if (degree >= 35) msg = " 폭염 경보";
//			else if (degree >= 33) msg = " 폭염 주의보";
//		}

//		System.out.println(season + msg);

		// 강사님
		// Early Return 패턴
		// 에러나 예외 조건을 먼저 검사하고 처리한 다음, 성공 케이스는 마지막에 처리하는 구조
		// 장점: 1) 코드 가독성이 좋아짐 2) 코드의 중첩을 줄일 수 있음
		if (month > 12 || month < 1) {
			System.out.println("해당하는 계절이 없음");
			return;
		}

		if (month >= 3 && month <= 5) {
        	season = "봄";
        } else if (month >= 6 && month <= 8) {
        	season = "여름";
        	
        	if (degree >= 35) {
            	season += " 폭염 경보";
            } else if (degree >= 33) {
            	season += " 폭염 주의보";
            }
        } else if (month >= 9 && month <= 11) {
        	season = "가을";
        } else {
        	season = "겨울";
        	
        	if (degree <= -15) {
            	season += " 한파 경보";
            } else if (degree <= -12) {
            	season += " 한파 주의보";
            }
        }
        
        System.out.println(season);
	}
}
