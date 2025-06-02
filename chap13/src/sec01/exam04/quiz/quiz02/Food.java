package sec01.exam04.quiz.quiz02;

import java.util.Objects;

public class Food {
	private String name;
	private int price;
	
	public Food() {
	
	}
	
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}
	
	@Override
	public boolean equals(Object obj) {
		// 같은 객체인지 체크
		if (this == obj) return true;
		
		// 같은 타입인지 체크
		if (obj instanceof Food food) {
			if (this.name.equals(food.name) && this.price == food.price) return true;
		}
		
		return false;
	}

	@Override
	public String toString() {
		return name + ":" + price;
	}
}
