package homework1;

import java.util.Scanner;

public class ConditionHomework1 {
	public static void main(String[] args) {
		System.out.println("=== 놀이동산 입장료 계산하기 ===");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 : ");
		int age = sc.nextInt();
		int charge;
		
		if (age < 3 || 65 <= age) charge = 0;
		else if (12 >= age) charge = 10000;
		else if (18 >= age) charge = 20000;
		else charge = 30000;
		
		System.out.println("당신의 놀이동산 요금은 " + charge + "원입니다.");
	}
}
