package homework.homework06.method02.run;

import homework.homework06.method02.controller.ExMethodController;

public class Run {
	public static void main(String[] args) {
		ExMethodController controller = new ExMethodController();
		
		// 1. 전달된 메세지를 출력하는 메소드
		controller.print("안녕하세요~");
		
		// 2. 1~100까지 합을 반환하는 메소드
		System.out.println(controller.sum(1, 4)); // 10
		
		// 3. 전달된 정수가 홀수인지 짝수인지 반환하는 메소드
		System.out.println(controller.judgeOddOrEven(1)); // 홀수
		System.out.println(controller.judgeOddOrEven(2)); // 짝수
		
		// 4. 전달된 문자열에 영문자가 있는지 확인하는 결과를 반환하는 메소드
		System.out.println(controller.isExistEnglish("안녕요")); // false
		System.out.println(controller.isExistEnglish("안녕요. Hi")); // true
		
		// 5. 문자열, 문자를 전달받아 문자열에 문자가 몇개있는지 출력하는 메소드
		controller.getCharNum("Happy", 'p'); // 2
		
		// 6. 전달된 정수의 구구단을 출력하는 메소드
		controller.getTimesTable(9);
	}
}
