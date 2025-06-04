package sec01.exam06.quiz;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Quiz3 {
	// Quiz
//	태양계 행성들의 정보를 담고 있는 HashMap을 생성하세요.
//	이때 Key는 행성의 이름으로 하고, Value는 행성의 정보를 담고 있는 객체 Planet을 구성하여 사용하세요.
//	생성된 HashMap을 keySet()과 entrySet()을 사용하여 출력하세요.
//	keySet를 통해 출력할 때는 Getter를, entrySet을 통해 출력할 때는 toString을 활용하세요.
	
//	Planet 클래스
//	1. 필드
//		- name: String // 이름(한글)
//		- diameter: int // 지름(km)
//		- period: double // 공전주기(년)
//	2. 생성자
//		+ Planet()
//		+ Planet(name: String, diameter: int, period: double)
//	3. Getter
//	4. 메소드
//		출력 예시에 맞춰 toString() 재정의
	
//	[사용 데이터]
//	Key     | Value(name)  | Value(diameter) | Value(period)
//	--------------------------------------------------------
//	Mercury | 수성          | 4879            | 0.24
//	Venus   | 금성          | 12104           | 0.62
//	Earth   | 지구          | 12742           | 1.0
//	Mars    | 화성          | 6779            | 1.88
	
//	[출력]
//	*** keySet() 사용 ***
//	행성 이름: Earth(지구), 지름: 12742km, 공전주기: 1.0년
//	행성 이름: Mars(화성), 지름: 6779km, 공전주기: 1.88년
//	행성 이름: Venus(금성), 지름: 12104km, 공전주기: 0.62년
//	행성 이름: Mercury(수성), 지름: 4879km, 공전주기: 0.24년

//	*** entrySet() 사용 ***
//	키: Earth, 값: 지구(지름: 12742km, 공전주기: 1.0년)
//	키: Mars, 값: 화성(지름: 6779km, 공전주기: 1.88년)
//	키: Venus, 값: 금성(지름: 12104km, 공전주기: 0.62년)
//	키: Mercury, 값: 수성(지름: 4879km, 공전주기: 0.24년)
	
	public static void main(String[] args) {
		Map<String, Planet> solarSystem = new HashMap<String, Planet>();
		solarSystem.put("Earth", new Planet("지구", 12742, 1.0));
		solarSystem.put("Mars", new Planet("화성", 6779, 1.88));
		solarSystem.put("Venus", new Planet("금성", 12104, 0.62));
		solarSystem.put("Mercury", new Planet("수성", 4879, 0.24));
		
		System.out.println("*** keySet() 사용 ***");
		for (String key : solarSystem.keySet()) {
			Planet planet = solarSystem.get(key);
			String name = planet.getName();
			int diameter = planet.getDiameter();
			double period = planet.getPeriod();
			System.out.println("행성 이름: " + key + "(" + name + "), 지름: " + diameter + "km, 공전주기: " + period + "년");
		}
		
		System.out.println();
		
		System.out.println("*** entrySet() 사용 ***");
		for (Entry<String, Planet> entry : solarSystem.entrySet()) {
			String key = entry.getKey();
			Planet value = entry.getValue();
			System.out.println("키: " + key + ", 값: " + value);
		}
	}
}
