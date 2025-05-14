package homework;

import java.util.Scanner;

public class VariableHomework5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 : ");
		double koScore = sc.nextInt();
		System.out.println("영어 : ");
		double enScore = sc.nextInt();
		System.out.println("수학 : ");
		double mathScore = sc.nextInt();
		
		int sum = (int) (koScore + enScore + mathScore);
		int avg = (int) (sum / 3);
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}
}
