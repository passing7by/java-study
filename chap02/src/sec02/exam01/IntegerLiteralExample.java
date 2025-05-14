package sec02.exam01;

public class IntegerLiteralExample {
	public static void main(String[] args) {
		// int(4byte)
		
		int var1 = 0b1011; // 2진수 (하드웨어 제어 프로그래밍 시)
		/*
		 * [0: 양수(0 포함)
		 * b: 2진수
		 * 1011: 1*(2^3) + 0*(2^2) + 1*(2^1) + 1*(2^0)
		 * ]
		 */
		int var2 = 013; // 8진수
		/*
		 * [0: 양수(0 포함)
		 * 13: 1*(8^1) + 3*(8^0)
		 * ]
		 */
		int var3 = 11; // 10진수 (주로 사용)
		int var4 = 0xb3; // 16진수 (RGB 색상값 저장 시)
		/*
		 * [0: 양수(0 포함)
		 * x: 16진수
		 * 이 이후의 문자는 0~9 와 a b c d e f 로 구성됨
		 * b3: 11*(16^1) + 3*(16^0)
		 */
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
	}
}
