package homework.homework01;

import java.util.Scanner;

public class VariableHomework2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가로 : ");
		double width = sc.nextDouble(); // 가로
		System.out.println("세로 : ");
		double length = sc.nextDouble(); // 세로
		
		double area =  width * length; // 면적
		double circumference =  (width + length) * 2; // 둘레
		
		System.out.println("면적 : " + area);
		System.out.println("둘레 : " + circumference);
	}
}
