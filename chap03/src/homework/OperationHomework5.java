package homework;

import java.util.Scanner;

public class OperationHomework5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		String residentNum1 = "123456-1234567"; // 남성
//		String residentNum2 = "123456-7891234"; // 잘못된 값
//		String residentNum3 = "123456-2234567"; // 여성
		
		System.out.println("주민번호(-) :");
		String residentNum = sc.nextLine();
		char genderNum = residentNum.charAt(7);
		
		boolean isMan = genderNum == '1' || genderNum == '3';
		boolean isWoman = genderNum == '2' || genderNum == '4';
		
		String gender = isMan ? "남성" : (isWoman ? "여성" : "잘못된 값");
		
		System.out.println("입력하신 주민번호는 " + gender + "입니다.");
	}
}
