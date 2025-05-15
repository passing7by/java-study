package homework;

import java.util.Scanner;

public class OperationHomework4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 :");
		int koSocore = sc.nextInt();
		System.out.println("수학 :");
		int mathSocore = sc.nextInt();
		System.out.println("영어 :");
		int enSocore = sc.nextInt();
		
		boolean isPass = koSocore >= 60 && mathSocore >= 60 && enSocore >= 60;
		
		int sum = koSocore + mathSocore + enSocore;
		int avg = sum / 3;
		System.out.println("합계 :" + sum + "점");
		System.out.println("평균 :" + avg + "점");
		
		String msg = (avg >= 90 && isPass)? "휴대폰을 바꿀 수 있습니다." : "휴대폰을 바꿀 수 없습니다." ;
		
		System.out.println(msg);
	}
}
