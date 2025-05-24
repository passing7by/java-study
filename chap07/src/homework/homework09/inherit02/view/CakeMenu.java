package homework.homework09.inherit02.view;

import java.util.Scanner;

import homework.homework09.inherit02.controller.ChocolateController;
import homework.homework09.inherit02.controller.GreenTeaController;

public class CakeMenu {
	// 필드
	private Scanner sc = new Scanner(System.in);
	private ChocolateController cc = new ChocolateController();
	private GreenTeaController gtc = new GreenTeaController();
	
	// 메인메뉴 출력, 잘못 입력했을 시 다시 받도록 반복
	public void mainMenu() {
//		===== 어떤 케이크를 만드시겠습니까? =====
//		1. 초콜릿 케이크(밀가루 : 200g, 크림 : 300g, 체리 : 10개, 초콜릿 칩 : 100개)
//		2. 녹차 케이크(밀가루 : 250g, 크림 : 400g, 녹차 파우더 : 10g, 치즈 큐브 : 50개)
//		9. 취소
//		메뉴 번호 : 
		
		// 1. 메뉴 설명 출력 및 메뉴 번호 입력받기
		System.out.println("===== 어떤 케이크를 만드시겠습니까? =====");
		System.out.println("1. 초콜릿 케이크(밀가루 : 200g, 크림 : 300g, 체리 : 10개, 초콜릿 칩 : 100개)");
		System.out.println("2. 녹차 케이크(밀가루 : 250g, 크림 : 400g, 녹차 파우더 : 10g, 치즈 큐브 : 50개)");
		System.out.println("9. 취소");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		sc.nextLine();
		
		// 2. 메뉴 정보 입력받기
		switch (menuNum) {
		case 1:
			chocolateMenu();
			mainMenu();
			break;
			
		case 2:
			greenTeaMenu();
			mainMenu();
			break;

		case 9:
			System.out.println("종료합니다.");
			return;
			
		default:
			System.out.println("잘못된 번호입니다.");
			mainMenu();
			break;
		}
		
		
		// 3. Controller를 이용하여 필드 초기화
	}

	// 초콜릿 케이크 재료 및 결과 출력
	public void chocolateMenu() {
//		밀가루(g) : 
//		크림(g) : 
//		체리(개) : 
//		초콜릿 칩(개) :
		
		// 데이터를 ChocolateController(cc)의 bakeChocolateCake()의 매개변수로 보내 반환 값 출력
		System.out.print("밀가루(g) : ");
		double flour = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("크림(g) : ");
		double cream = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("체리(개) : ");
		int cherry = sc.nextInt();
		sc.nextLine();
		
		System.out.print("초콜릿 칩(개) : ");
		int chip = sc.nextInt();
		sc.nextLine();
		
		System.out.println(cc.bakeChocolateCake(flour, cream, cherry, chip));
		
		System.out.println("초콜릿 케이크가 완성되었습니다.");
	}
	
	// 녹차 케이크 재료 및 결과 출력
	public void greenTeaMenu() {
//		밀가루(g) :
//		크림(g) : 
//		녹차 파우더(g) : 
//		치즈 큐브(개) :
		
		// 데이터를 GreenTeaController(gtc)의 bakeGreenTeaCake()의 매개변수로 보내 반환 값 출력
		System.out.print("밀가루(g) : ");
		double flour = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("크림(g) : ");
		double cream = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("녹차 파우더(g) : ");
		double powder = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("치즈 큐브(개) : ");
		int cheese = sc.nextInt();
		sc.nextLine();
		
		System.out.println(gtc.bakeGreenTeaCake(flour, cream, powder, cheese));
		
		System.out.println("녹차 케이크가 완성되었습니다.");
	}
}
