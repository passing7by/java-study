package homework.homework10.polymorphism01.model.vo;

public class Product {
	private String name;
	private int price;
	
	public Product() {
	
	}
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	
	// 10% 할인된 금액을 리턴
	public int calculatePrice() {
		return (int) (price - (price * 0.1));
	}
	
	
	
	
}
