package homework.homework09.inherit02.model.vo;

public class Chocolate extends Cake {
	private int cherry;
	private int chip;
	
	public Chocolate() {

	}
	
	public Chocolate(int cherry, int chip) {
		this.cherry = cherry;
		this.chip = chip;
	}

	public int getCherry() {
		return cherry;
	}

	public void setCherry(int cherry) {
		this.cherry = cherry;
	}

	public int getChip() {
		return chip;
	}

	public void setChip(int chip) {
		this.chip = chip;
	}

	@Override
	public String toString() {
		return "Chocolate [cherry=" + cherry + ", chip=" + chip + "]";
	}
}
