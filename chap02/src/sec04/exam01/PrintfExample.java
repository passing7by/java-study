package sec04.exam01;

public class PrintfExample {
	public static void main(String[] args) {		
		int value = 123;
		System.out.printf("상품의 가격: %d원\n", value);
		System.out.printf("상품의 가격: %6d원\n", value);
		// [%6d: 정수를 입력받을거고, 6자리 이하면 왼쪽을 공백으로 표시]

		System.out.printf("상품의 가격: %-6d원\n", value);

		// [%-6d: 정수를 입력받을거고, 6자리 이하면 오른쪽을 공백으로 표시]

		System.out.printf("상품의 가격: %06d원\n", value);
		// [%06d: 
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %1$d인 원의 넓이: %2$010.2f\n", 10, area);
		System.out.printf("반지름이 %d인 원의 넓이: %010.2f\n", 10, area); // 순번을 생략하면 차례대로 대입됨
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s", 1, name, job);
	}
}
