package homework.homework10.polymorphism03.run;

import homework.homework10.polymorphism03.model.vo.Car;
import homework.homework10.polymorphism03.model.vo.ElectricEngine;
import homework.homework10.polymorphism03.model.vo.GasolineEngine;

public class Run {
	public static void main(String[] args) {
//		1. Car 클래스로 2개 객체 인스턴스화		
//		2. 각각의 매개변수 생성자의 매개변수로 GasolineEngine과 ElectricEngine 사용
		Car car1 = new Car(new GasolineEngine());
		Car car2 = new Car(new ElectricEngine());
		
//		3. 2개의 Car객체의 startEngine 메소드 호출
		car1.startEngine();
		car2.startEngine();
	}
}
