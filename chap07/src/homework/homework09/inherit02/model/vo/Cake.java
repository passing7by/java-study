package homework.homework09.inherit02.model.vo;

public class Cake {
	private double flour;
	private double cream;
	
	public Cake() {
	
	}
	
	public Cake(double flour, double cream) {
		this.flour = flour;
		this.cream = cream;
	}

	public double getFlour() {
		return flour;
	}

	public void setFlour(double flour) {
		this.flour = flour;
	}

	public double getCream() {
		return cream;
	}

	public void setCream(double cream) {
		this.cream = cream;
	}

	@Override
	public String toString() {
		return "Cake [flour=" + flour + ", cream=" + cream + "]";
	}
}
