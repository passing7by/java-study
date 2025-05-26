package homework.homework10.polymorphism01.model.vo;

public class Food extends Product {
	private int expirationDays;

	public Food() {
	
	}
	
	public Food(String name, int price, int expirationDays) {
		super(name, price);
		this.expirationDays = expirationDays;
	}

	public int getExpirationDays() {
		return expirationDays;
	}
	
	// 유통기한이 남은 일자에 따라서 달라지는 할인율을 정수형태로 리턴
	public int calculateDiscountRate() {
		if (expirationDays <= 1) return 80;
		else if (expirationDays <= 5) return 50;
		else if (expirationDays <= 10) return 20;
		
		return 0;
	}
	
	// calculateDiscountRate 함수를 호출하여 할인 %에 사용
	@Override
	public int calculatePrice() {
		return (int) (super.getPrice() - (super.getPrice() * (calculateDiscountRate() * 0.01)));
	}
	
	
	
	
}
