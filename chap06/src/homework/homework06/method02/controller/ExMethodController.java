package homework.homework06.method02.controller;

public class ExMethodController {
	// 1. 전달된 메세지를 출력하는 메소드
	public void print(String message) {
		System.out.println(message);
	}
	
	// 2. 1~100까지 합을 반환하는 메소드
	public int sum(int startNum, int endNum) {
		int sum = 0;
		for (int i = startNum; i <= endNum; i++) {
			sum += i;
		}
		return sum;
	}
	
	// 3. 전달된 정수가 홀수인지 짝수인지 반환하는 메소드
	public String judgeOddOrEven(int num) {
		if (num % 2 == 0) return "짝수";
		return "홀수";
	}
	
	// 4. 전달된 문자열에 영문자가 있는지 확인하는 결과를 반환하는 메소드
	public boolean isExistEnglish(String str) {
		for (int i = 0; i < str.length(); i++) {
			char targetCh = str.charAt(i);
			if (targetCh >= 'A' && targetCh <= 'z') return true;
		}
		return false;
	}
	
	// 5. 문자열, 문자를 전달받아 문자열에 문자가 몇개있는지 출력하는 메소드
	public void getCharNum(String s, char c) {
		int cnt = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char targetCh = s.charAt(i);
			if (targetCh == c) cnt++;
		}
		
		System.out.println(cnt);
	}
	
	// 6. 전달된 정수의 구구단을 출력하는 메소드
	public void getTimesTable(int num) {
		System.out.println(num + "단");
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
	}
}
