package sec03.exam02;

// 상품의 정보를 저장하기 위한 클래스
public class Product {
	private int pno;
	private String name;
	private int price;
	private int stock;

	public Product(int pno, String name, int price, int stock) {
		this.pno = pno;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	
	
	public int getPno() {
		return pno;
	}



	public void setPno(int pno) {
		this.pno = pno;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public int getStock() {
		return stock;
	}



	public void setStock(int stock) {
		this.stock = stock;
	}



	@Override
	public String toString() {
		return "Product [pno=" + pno + ", name=" + name + ", price=" + price + ", stock=" + stock + "]";
	}
}
