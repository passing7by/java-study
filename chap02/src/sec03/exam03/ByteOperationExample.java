package sec03.exam03;

public class ByteOperationExample {
	public static void main(String[] args) {
		// 기본 전제: 두 개의 값 중 크기가 큰 타입으로 자동 변환
		
		// 산술 연산에서 int 타입 이하일 경우에는 int로 자동 변환
		byte x = 10;
		byte y = 20;
//		byte result = x + y; // Type mismatch: cannot convert from int to byte
		// byte끼리의 연산 시, 각각의 byte가 int로 자동 형변환 되어 연산이 시작 됨. 연산 결과가 int가 됨.
	}
}
