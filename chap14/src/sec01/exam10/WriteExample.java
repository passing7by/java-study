package sec01.exam10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {
	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("C:/Windows/Temp/test10.txt");
		
		// Writer는 문자열을 좀더 쉽게 보내기 위해서 write(String str) 메소드를 제공
		String str = "ABCDE";
		
		// 문자열 전체를 출력
//		writer.write(str);
		// 1번 인덱스부터 2개까지의 문자열을 출력
		writer.write(str, 1, 2);
		
		writer.flush();
		writer.close();
	}
}
