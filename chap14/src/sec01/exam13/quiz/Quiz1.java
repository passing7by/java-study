package sec01.exam13.quiz;

import java.io.FileReader;
import java.io.Reader;

public class Quiz1 {
	// Quiz
//	FileReader를 사용하여 
//	"C:/Temp/output.txt" 파일을 읽어와서 콘솔에 표준 출력하세요.
		
//  힌트: 읽은 char 배열을 문자열로 변환 후 출력 
//	     또는 읽은 문자 수만큼 반복하면서 배열에 저장된 문자를 하나씩 출력
	public static void main(String[] args) {
		char[] buffer = new char[100];
		
		// Reader 생성 하고 읽어올 파일의 경로 지정
		// 읽어올 데이터가 있다면 buffer 배열에 read()의 결과를 담음
		// new String(char[])로 읽어온 결과를 문자열로 변환
		// 변환한 문자열 출력
		
		try (Reader r = new FileReader("C:/Windows/Temp/output.txt")) {
			int readDataCnt = r.read(buffer);

			if (readDataCnt == -1) System.out.println("데이터를 읽어오지 못했습니다.");
			else System.out.println(new String(buffer, 0, readDataCnt));			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
