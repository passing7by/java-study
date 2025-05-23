package sec03.exam02;

public class Cat extends Animal { // The type Cat must implement the inherited abstract method Animal.sound()
	public Cat() {
		
	}
	
	@Override
	public void sound() {
		System.out.println("야옹😺");
	}

}
