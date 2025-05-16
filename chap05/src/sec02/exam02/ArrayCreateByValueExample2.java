package sec02.exam02;

public class ArrayCreateByValueExample2 {
	public static void main(String[] args) {
		// 2. 배열 변수 선언 후 나중에 값 대입
		int[] scores;
		
//		scores = {83, 90, 87}; // Array constants can only be used in initializers
		// 컴파일 에러(문법적으로 허용 안함)
		
		scores = new int[] {83, 90, 87};
		
		System.out.println("총합: " + add(scores));
		
		// 배열 변수에 배열 객체를 만드어서 넘기는 겨웅
//		int sum2 = add({83, 90, 87}); // 컴파일 에러
		int sum2 = add(new int[] {83, 90, 87});
		System.out.println("총합: " + sum2);
	}
	
	// 메소드 선언
	public static int add(int[] scores) {
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		return sum;
	}
}
