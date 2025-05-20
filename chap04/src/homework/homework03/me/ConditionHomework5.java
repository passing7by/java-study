package homework.homework03.me;

import java.util.Scanner;

public class ConditionHomework5 {
	public static void main(String[] args) {
		System.out.println("=== 헬스 마니아 철수 ===");
		
		System.out.println("1. 스쿼트");
		System.out.println("2. 데드리프트");
		System.out.println("3. 벤치 프레스");
		System.out.println("4. 풀업");
		System.out.println("5. 종료");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); 
		
		String msg = "";
		
		// me
//		if (num > 5) msg = "목록에 있는 숫자만 입력해주세요.";
//		if (num <= 0) msg = "양수만 입력해주세요.";
//		if (num == 1) msg = "스쿼트 운동 시간입니다.";
//		if (num == 2) msg = "데드리프트 운동 시간입니다.";
//		if (num == 3) msg = "벤치 프레스 운동 시간입니다.";
//		if (num == 4) msg = "풀업 운동 시간입니다.";
//		if (num == 5) msg = "오늘도 수고하셨습니다.";
		
		
		// 중첩 if~else문 사용
//		if (num > 5 || num <= 0) {
//			if (num > 5) msg = "목록에 있는 숫자만 입력해주세요.";
//			else msg = "양수만 입력해주세요.";
//		} else {			
//			if (num == 1) msg = "스쿼트 운동 시간입니다.";
//			if (num == 2) msg = "데드리프트 운동 시간입니다.";
//			if (num == 3) msg = "벤치 프레스 운동 시간입니다.";
//			if (num == 4) msg = "풀업 운동 시간입니다.";
//			if (num == 5) msg = "오늘도 수고하셨습니다.";
//		}
//		
//		System.out.println(msg);

		// 강사님
		if (num <= 0) {
        	System.out.println("양수만 입력해주세요.");
        	return;
        }
        
        if (num == 1) {
            System.out.println("스쿼트 운동 시간입니다.");
        } else if (num == 2) {
            System.out.println("데드리프트 운동 시간입니다.");
        } else if (num == 3) {
            System.out.println("벤치 프레스 운동 시간입니다.");
        } else if (num == 4) {
            System.out.println("풀업 운동 시간입니다.");
        } else if (num == 5) {
            System.out.println("오늘도 수고하셨습니다.");
        } else {
            System.out.println("목록에 있는 숫자만 입력해주세요.");
        }
	}
}
