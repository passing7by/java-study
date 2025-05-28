package sec01.quiz_string;

import java.util.Scanner;

public class Quiz3 {
	// Quiz
//	원본 문자열과 찾는 문자열을 입력 받아 개수를 출력하는 프로그램을 구현하기 위해 
//	실행 클래스의 count 메서드를 작성하시오.
//	count(원본문자열, 찾는문자열) 메서드는 원본 문자열에서 찾는 문자열의 개수를 리턴하는 메소드입니다.
//	※ 정적(static) 메소드 안에서 인스턴스 메소드를 쓸 수 없습니다.
	
//	[입력]
//	1) 123AB123 AB
//	2) 123AB123 13
	
//	[출력]
//	1) 1
//	2) 0

//  [힌트]
//	indexOf(String str, int fromIndex)를 이용해 반복해서 찾기
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
//        String str1 = "123AB123";
//        String str2 = "AB";
        System.out.println(count(str1, str2));
	}
	
	// 내 코드
//	public static int count(String str1, String str2) {
//		int cnt = 0;
//		int existIdx = 0;
//		for (int i = 0; i < str1.length(); i++) {
//			if (str1.indexOf(str2, i) != existIdx && str1.indexOf(str2, i) > -1) {
//				cnt++;
//				existIdx = str1.indexOf(str2, i);
//			}
//		}
//		
//		return cnt;
//	}
	
	// 강사님 코드
	public static int count(String original, String target) {
		int count = 0;
		int index = 0;
		
		// indexOf를 이용해 반복해서 찾기
//		index = original.indexOf(target);
//		while (index != -1) {
//			count++;
//			index += target.length(); // 다음 검색 위치로 이동
//			index = original.indexOf(target, index); // 다음 위치에서 다시 검색
//		}
		
		// 축약형: indexOf를 한 번만 쓰기
		while ((index = original.indexOf(target, index)) != -1) {
			count++;
			index += target.length(); // 다음 검색 위치로 이동
		}
		
		return count;
	}
}
