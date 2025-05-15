package homework;

import java.util.Scanner;

public class OperationHomework3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("친구 수 :");
		int friendNum = sc.nextInt();
		System.out.println("사탕의 수 :");
		int candyNum = sc.nextInt();
		int candyPerPerson = candyNum / friendNum;
		int remainingCandy = candyNum % friendNum;
		
		System.out.println("1인당 사탕 개수 :" + candyPerPerson + "개");
		System.out.println("남는 사탕 개수 :" + remainingCandy + "개");
	}
}
