package homework.homework06.method01;

public class Utility {
	// 문자열 두 개를 합쳐 반환하는 메서드
	String concat(String s1, String s2) {
		return s1 + s2;
	}
	
	// 정수 두 개의 곱을 반환하하는 메서드
	int multiply(int i1, int i2) {
		// i1 < i2인 경우
		if (i1 < i2) {
			System.out.println("계산할 수 없습니다.");
			return 0;
		}
		// 아닌 경우
		return i1 * i2;
	}
	
	// 문자열 두 개의 값이 같으면 true를 반환하는 메서드
	boolean isEqual(String s1, String s2) {
		if (s1.equals(s2)) return true;
		else return false;
	}
}
