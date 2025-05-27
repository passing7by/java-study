package homework.homework10.polymorphism02.run;

import homework.homework10.polymorphism02.model.vo.Dish;
import homework.homework10.polymorphism02.model.vo.Drink;
import homework.homework10.polymorphism02.model.vo.Menu;

public class Run {
	public static void main(String[] args) {
//		1. 사이즈 5짜리 Menu 타입의 객체 배열을 생성
		Menu[] menus = new Menu[5];
		
//		2. 각 인덱스별로 무작위로 Drink, Dish 객체를 생성
//		String[] DrinkAndDish = {"Drink", "Dish"};
//		String DrinkOrDish = DrinkAndDish[(int) (Math.random() * 2)]; 
		
		menus[0] = new Dish("토마토파스타", 12000, "토마토");
		menus[1] = new Drink("체리콕", 4000, "체리에이드 + 콜라");
		menus[2] = new Dish("알리오올리오", 11000, "마늘");
		menus[3] = new Drink("아메리카노", 4000, "에스프레소 + 물");
		menus[4] = new Dish("나물비빔밥", 10000, "나물");
		
//		3. 반복문으로 각 인덱스별 객체의 cook() 메소드 실행
		for (Menu menu : menus) {
			menu.cook();
		}
	}
}
