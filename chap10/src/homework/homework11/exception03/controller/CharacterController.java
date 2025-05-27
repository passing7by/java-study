package homework.homework11.exception03.controller;

import homework.homework11.exception03.exception.CharCheckException;

public class CharacterController {
	public static int countAlpha(String s)	throws CharCheckException {
	// 매개변수로 들어온 값에 있는 영문자를 세어 반환
	// 문자열에 공백이 있다면 CharCheckException발생, 에러 메시지는 출력 값 참고
		int engCnt = 0;
		for (int i = 0; i < s.length(); i++) {
			char targetCh = s.charAt(i);
			if (targetCh == ' ') throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
			if (targetCh >= 'A' && targetCh <= 'z') engCnt++;
		}
		
		return engCnt;
	}
}
