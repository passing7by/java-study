package homework.homework05.me;

import java.util.Arrays;

public class ArrayHomework1 {
	public static void main(String[] args) {
		int[] heights = {152, 180, 165, 158, 171};
		
		// 내 코드
//		for (int i = 0; i < heights.length; i++) {
//			for (int j = i + 1; j < heights.length; j++) {
//				if (heights[i] > heights[j]) {
//					int temp = heights[i];
//					heights[i] = heights[j];
//					heights[j] = temp;
//				}
//			}
//		}
		
		// 강사님 코드
		for (int i = 0; i < heights.length - 1; i++) {
			for (int j = 0; j < heights.length - 1 - i; j++) {
				if (heights[j] > heights[j + 1]) {
					int temp = heights[j];
					heights[j] = heights[j + 1];
					heights[j + 1] = temp;
				}
			}
		}
		
		System.out.print(Arrays.toString(heights));
		
		// 디버깅 실습
//		1. Step Into(F5)
//		현재 실행 중인 코드 줄에서 호출하는 메소드 내부로 들어감
//		메소드의 세부 구현을 보고 싶을 때 사용
//		사용 시기: 호출된 메소드 내부 로직을 살펴보고 싶을 때
//		
//		2. Step Over(F6)
//		현재 코드 줄을 실행하고 다음 줄로 이동하지만, 호출된 메소드 내부로는 들어가지 않음
//		메소드의 결과만 보고 내부 동작은 관심 없을 때 사용
//		사용 시기: 로직 흐름을 빠르게 따라가고 싶을 때, 메소드 내부는 중요하지 않을 때
//		
//		3. Resume(F8)
//		다음 중단점까지 코드 실행을 계속 진행
//		더 이상 한 줄씩 실행하지 않고, 프로그램이 알아서 흐름을 따라가게 둠
//		사용 시기: 다음 중단점까지 실행을 이어가고 싶을 때

	}
}
