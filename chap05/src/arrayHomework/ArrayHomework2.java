package arrayHomework;

import java.util.Scanner;

public class ArrayHomework2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 : ");
		int length = sc.nextInt();
		
		int[] arr = new int[length];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for (int i : arr) {
			System.out.print(i + " ");
			sum += i;
		}
		
		System.out.println();
		System.out.println(sum);
	}
}
