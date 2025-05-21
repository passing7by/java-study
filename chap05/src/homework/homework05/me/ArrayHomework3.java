package homework.homework05.me;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayHomework3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		while (true) {
			System.out.println("정수 : ");
			num = sc.nextInt();
			
			if (num % 2 == 0 || num < 3) System.out.println("다시 입력하세요");
			else break;
		}
		
		int[] arr = new int[num];
		
		// 내 코드
		// 첫 번째 인덱스의 값 = 마지막 인덱스의 값
		int start = 0;
		int end = arr.length-1;
		int mid = end / 2;
		int val = 1;
		
		while (start <= mid) {
			arr[start] = val;
			arr[end] = val;
			
			start++;
			end--;
			val++;
		}
		
		// 강사님 코드
		// 수를 증가시키다가
		// 받은 숫자를 2로 나눈 몫의 값에 해당하는 인덱스보다 큰 경우에는 수를 감소시키면 됨
		for (int i = 0; i < arr.length; i++) {
			
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
