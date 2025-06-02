package sec01.exam04.quiz.quiz03;

import java.util.Objects;

public class Equipment {
	private String name;
	private int pricePerDay;
	
	public Equipment() {
	
	}	
	
	public Equipment(String name, int pricePerDay) {
		this.name = name;
		this.pricePerDay = pricePerDay;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, pricePerDay);
	}
	
	@Override
	public boolean equals(Object obj) {
		// 같은 객체인지 체크
		if (this == obj) return true;
		
		// 같은 타입인지 체크
		if (obj instanceof Equipment e) {
			if (this.name.equals(e.name) && this.pricePerDay == e.pricePerDay) return true;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return name + ":" + pricePerDay + "원";
	}
}
