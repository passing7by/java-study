package homework.homework11.exception04.controller;

import homework.homework11.exception04.exception.NumRangeException;

public class NumberController {
	 public static boolean checkDouble(int num1, int num2) throws NumRangeException {
		 // 매개변수로 들어온 두 값이 1~100 사이일때
		 // num1이 num2의 배수이면 true
		 // num1이 num2의 배수가 아니라면 false 반환
	 	 // 1~100사이의 숫자가 아니라면
		 // NumRangeException 발생
		 // 에러 메시지는 출력 값 참고
		 
		 if ((num1 >= 1 && num1 <=100) && (num2 >= 1 && num2 <=100)) {
			 if (num1 % num2 == 0) return true;
			 else return false;
		 } else throw new NumRangeException("1부터 100사이의 값이 아닙니다.");
	 }
}
