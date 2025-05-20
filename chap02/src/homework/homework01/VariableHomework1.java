package homework.homework01;

import java.util.Scanner;

public class VariableHomework1 {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몸무게(kg) : ");
		double weight = sc.nextDouble();
		System.out.println("키(m) : ");
		double height = sc.nextDouble();
		
		double bmi =  weight / (height * height);
		
		System.out.printf("BMI 지수 : %.1f", bmi);
	}
}
