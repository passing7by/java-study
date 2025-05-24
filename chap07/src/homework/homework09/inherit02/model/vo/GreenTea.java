package homework.homework09.inherit02.model.vo;

public class GreenTea extends Cake {
	private double powder;
	private int cheese;
	
	public GreenTea() {

	}
	
	public GreenTea(double powder, int cheese) {
		this.powder = powder;
		this.cheese = cheese;
	}

	public double getPowder() {
		return powder;
	}

	public void setPowder(double powder) {
		this.powder = powder;
	}

	public int getCheese() {
		return cheese;
	}

	public void setCheese(int cheese) {
		this.cheese = cheese;
	}

	@Override
	public String toString() {
		return "GreenTea [powder=" + powder + ", cheese=" + cheese + "]";
	}
}
