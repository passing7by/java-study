package sec03.exam03.quiz;

public class InformalEmployee extends Employee {
	private int primaryPay;

	public InformalEmployee(String name, String dept, int primaryPay) {
		super("비정규직", name, dept);
		this.primaryPay = primaryPay;
	}

	@Override
	public int getPay() {
		return primaryPay;
	}

	@Override
	public String getInfo() {
		return super.getInfo() + ", " + primaryPay;
	}
	
	public int getPrimaryPay() {
		return primaryPay;
	}

	public void setPrimaryPay(int primaryPay) {
		this.primaryPay = primaryPay;
	}
}
