package homework.homework06.method01;

public class UtilityExample {
	
	public static void main(String[] args) {
		Utility myUtility = new Utility();
		System.out.println(myUtility.concat("야", "호"));
		System.out.println(myUtility.multiply(1, 2));
		System.out.println(myUtility.multiply(2, 1));
		System.out.println(myUtility.isEqual("Hi", "Hi"));
		System.out.println(myUtility.isEqual("Hello", "Hi"));
	}
}
