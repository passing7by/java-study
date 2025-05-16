package homework1;

import java.util.Scanner;

public class ConditionHomework3 {
	public static void main(String[] args) {
		System.out.println("=== 세개의 정수 비교하기 ===");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수 :");
		int num1 = sc.nextInt();
		System.out.println("두 번째 정수 :");
		int num2 = sc.nextInt();
		System.out.println("세 번째 정수 :");
		int num3 = sc.nextInt();
				
		int min = (num1 > num2) ?
				  ((num2 > num3) ? num3 : num2) : 
				  ((num1 > num3) ? num3 : num1);
		
		System.out.println("세 수 중에서 가장 작은 수는 " + min + "입니다.");
	}
}
