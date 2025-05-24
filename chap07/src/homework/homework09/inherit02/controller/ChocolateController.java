package homework.homework09.inherit02.controller;

import homework.homework09.inherit02.model.vo.Chocolate;

public class ChocolateController {
	private Chocolate c = new Chocolate();
	
	// 받은 매개변수를 이용하여 필드들을 초기화하고 초기화한 정보와 결과 반환
	public String bakeChocolateCake(double flour, double cream, int cherry, int chip) {
		c.setFlour(flour);
		c.setCream(cream);
		c.setCherry(cherry);
		c.setChip(chip);
		
		String result = "";
		result += "밀가루 : " + c.getFlour() + "(g)\n";
		result += "크림 : " + c.getCream() + "(g)\n";
		result += "체리 : " + c.getCherry() + "(개)\n";
		result += "초콜릿 칩 : " + c.getChip() + "(개)";
		
		return result;
	}
}
