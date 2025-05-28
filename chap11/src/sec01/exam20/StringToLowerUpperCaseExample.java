package sec01.exam20;

public class StringToLowerUpperCaseExample {
	public static void main(String[] args) {
		String str1 = "Java Programing";
		String str2 = "java Programing";
		
		System.out.println(str1.equals(str2)); // 알파벳 대소문자를 구분함
		
		// 대소문자 상관없이 비교하고 싶을 때
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1);
		System.out.println(lowerStr2);
		System.out.println(lowerStr1.equals(lowerStr2));
	}
}
