package homework.homework09.inherit02.controller;

import homework.homework09.inherit02.model.vo.GreenTea;

public class GreenTeaController {
	private GreenTea gt = new GreenTea();
	
	// 받은 매개변수를 이용하여 필드들을 초기화하고 초기화한 정보와 결과 반환
	public String bakeGreenTeaCake(double flour, double cream, double powder, int cheese) {
		gt.setFlour(flour);
		gt.setCream(cream);
		gt.setPowder(powder);
		gt.setCheese(cheese);
		
		String result = "";
		result += "밀가루 : " + gt.getFlour() + "(g)\n";
		result += "크림 : " + gt.getCream() + "(g)\n";
		result += "녹차 파우더 : " + gt.getPowder() + "(개)\n";
		result += "치즈 큐브 : " + gt.getCheese() + "(개)";
		
		return result;
	}
}
