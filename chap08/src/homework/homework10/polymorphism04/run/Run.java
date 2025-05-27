package homework.homework10.polymorphism04.run;

import homework.homework10.polymorphism04.model.vo.GalaxyS24;
import homework.homework10.polymorphism04.model.vo.Iphone15;
import homework.homework10.polymorphism04.model.vo.SmartPhone;

public class Run {
	public static void main(String[] args) {
//		1. GalaxyS24와 Iphone15를 동시에 참조하기 위한 Smartphone 타입의 배열 생성(크기 2로 지정)
		SmartPhone[] smartphones = new SmartPhone[2];
		
//		2. 각각의 인덱스에 GalaxyS24, Iphone15 객체 생성
		smartphones[0] = new GalaxyS24();
		smartphones[1] = new Iphone15();
		
//		3. for문을 이용하여 SmartPhone 객체 배열에 있는 GalaxyS24와Iphon15에 접근
//		4. 오버라이딩한 모든 메소드 호출
		for (SmartPhone sp : smartphones) {
			sp.printMaker();
			sp.makeCall();
			sp.takeCall();
			sp.touch();
			sp.charge();
			sp.picture();
			System.out.println();
		}
	}
}
