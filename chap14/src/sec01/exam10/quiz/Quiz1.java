package sec01.exam10.quiz;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Quiz1 {
	// Quiz
//	FileWriter를 사용하여 
//	"C:/Temp/output.txt" 파일을 생성하고
//	output.txt 파일 안에 아래 배열의 요소를 한 줄에 하나씩 추가해주세요.
//	String[] lines = {"첫 번째 줄입니다.", "두 번째 줄입니다.", "세 번째 줄입니다."};

//  힌트: 줄바꿈하는 방법 "\r\n" 또는 "\n"
	
	public static void main(String[] args) {
		// Writer 생성 및 파일을 생성할 경로 지정
		// 배열을 순회하면서 한 줄 + "\n"씩 write()
		
		String[] lines = {"첫 번째 줄입니다.", "두 번째 줄입니다.", "세 번째 줄입니다."};
		
		try (Writer w = new FileWriter("C:/Windows/Temp/output.txt")) {
			for (String string : lines) {
				w.write(string + "\n");
			}
			
			w.flush();			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
