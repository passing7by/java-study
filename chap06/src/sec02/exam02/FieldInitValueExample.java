package sec02.exam02;

public class FieldInitValueExample {
	public static void main(String[] args) {
		// 객체 생성
		FieldInitValue f = new FieldInitValue();
		
		System.out.println("byteField: " + f.byteField);
		System.out.println("shortField: " + f.shortField);
		System.out.println("intField: " + f.intField);
		System.out.println("longField: " + f.longField);

		System.out.println("booleanField: " + f.booleanField);
		System.out.println("charField: " + f.charField); // 빈 공백

		System.out.println("floatField: " + f.floatField);
		System.out.println("doubleField: " + f.doubleField);
				
		System.out.println("arrField: " + f.arrField);
		System.out.println("referenceField: " + f.referenceField);
	}
}
