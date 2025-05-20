package homework.homework05;

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
		
		String menuStr = "";
		String newMenuStr = "";
		for (int i = 0; i < menu.length; i++) {
			menuStr += menu[i];
			if (i < menu.length - 1) menuStr += ", ";
		}
		for (int i = 0; i < newMenu.length; i++) {
			newMenuStr += newMenu[i];
			if (i < newMenu.length - 1) newMenuStr += ", ";
		}
		
		System.out.println("어제 메뉴판: " + menuStr);
		System.out.println("오늘 메뉴판: " + newMenuStr);
	}
}
