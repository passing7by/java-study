package arrayHomework;

import java.util.Arrays;

public class ArrayHomework8 {
	public static void main(String[] args) {
		String[] menu = {"Burger", "Pizza", "Pasta"};
		String[] add = {"Salad","Soup"};
		
		String[] newMenu = new String[menu.length + add.length];
		for (int i = 0; i < menu.length; i++) {
			newMenu[i] = menu[i];
		}
		for (int i = 0; i < add.length; i++) {
			newMenu[i + menu.length] = add[i];
		}
		
		System.out.println("어제 메뉴판: " + Arrays.toString(menu));
		System.out.println("오늘 메뉴판: " + Arrays.toString(newMenu));
	}
}
