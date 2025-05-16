package homework1;

import java.util.Scanner;

public class ConditionHomework4 {
	public static void main(String[] args) {
		System.out.println("=== 세개의 정수 비교하기 ===");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수집된 코드 :");
		int num = sc.nextInt();
		
		String msg = "";
		
		switch (num) {
		case 400:
			msg = "잘못된 요청입니다.";
			break;
		case 404:
			msg = "요청하신 서비스를 찾을 수 없습니다.";
			break;
		case 500:
			msg = "처리 방법을 알 수 없는 문제가 발생했습니다.";
			break;
		case 503:
			msg = "일시적인 서버 오류가 발생하였습니다.";
			break;
		default:
			msg = "알 수 없는 오류가 발생하였습니다.";
			break;
		}
		
		System.out.println(msg);
	}
}
