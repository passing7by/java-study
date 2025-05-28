package homework.homework12.string02;

public class Practice {
	public static String takeState(String address) {
		String[] strArr = address.split(" ");
		
		for (String str : strArr) {
			if(str.endsWith("구")) return str;	
		}
		
		return null;
	}
}
