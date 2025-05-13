package sec02.exam08;

public class BooleanExample {
	public static void main(String[] args) {
		// boolean(1byte)
		// true, false 2가지 상태값을 저장
		// 제어문(조건문, 반복문)에서 실행 흐름을 변경할 때 주로 사용
		
//		boolean stop = true;
		boolean stop = false;
		
		if (stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
		
		// [부동소수점 혼자 테스트....]
		System.out.println("----");
		
		float a = 0.1f;
		float b = 3.1f;
		float c = a + b;
		boolean flag = (c == 3.2f);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(flag);
		
		System.out.println("----");

		float a2 = (float) Math.floor(0.1f);
		float b2 = (float) Math.floor(3.1f);
		float c2 = a2 + b2;
		boolean flag2 = (c2 == 3.2f);
		System.out.println(c2);
		System.out.println(flag2);
	}
}
