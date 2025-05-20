package homework.homework02;

import java.util.Scanner;

public class OperationHomework2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구슬의 개수 : ");
		int ballNum = sc.nextInt();
		
		String oddOrEven = (ballNum % 2 == 0)? "짝수" : "홀수";
		
		System.out.println("구슬의 개수는 " + oddOrEven + "입니다.");
	}
}
