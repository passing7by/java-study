package test;

public class Test {
	public static void main(String[] args) {
		char testCh = 'A';
		System.out.println(++testCh);
		
		// do-while문 작성 시,
		// while문이 내가 원하는대로 조건이 잘 안 만들어진다면?
		// do 구문 안의 논리가 정말로 내가 원하는 결과값의 반댓값이 확실한지 체크해야 함
		int cnt = 0;
		
		do {
			cnt++;
		} while (cnt < 5);
		System.out.println("로그인 횟수 " + cnt + "번 초과");
	}
}
