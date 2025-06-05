package sec01.exam03.quiz;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Quiz2 {
	// Quiz
//	FileOutputStream을 사용하여 
//	"C:/Temp" 폴더에 생성된 애국가1.dat 파일에 아래와 같은 문장을 추가하세요.
//	실행을 할 때마다 한 번씩 추가돼야 합니다.
		
//	String str = "\n남산위에 저 소나무 철갑을 두른듯"
//			+ "\n바람서리 불변함은 우리기상 일세"
//			+ "\n무궁화 삼천리 화려강산 "
//			+ "\n대한사람 대한으로 길이보전하세";
		
//  힌트: FileOutputStream 생성자의 두 번째 매개변수(append: 덧붙이다)를 설정
	
	public static void main(String[] args) throws IOException {
		String str = "\n남산위에 저 소나무 철갑을 두른듯"
					 + "\n바람서리 불변함은 우리기상 일세"
					 + "\n무궁화 삼천리 화려강산 "
					 + "\n대한사람 대한으로 길이보전하세";
		
//		byte[] strByteArr = new byte[str.length()];
//		
//		// str의 문자들을 하나씩 byte로 변환해 strByteArr에 담음
//		for (int i = 0; i < str.length(); i++) {
//			strByteArr[i] = (byte) str.charAt(i);
//		}
		
		// OutputStream 생성 및 파일을 생성할 경로 지정
		try (OutputStream os = new FileOutputStream("C:/Windows/Temp/애국가1.dat", true)) {
			// 인코딩: 문자열을 바이트 배열로 바꾸는 과정
			byte[] strByteArr = str.getBytes("UTF-8"); // 글자 깨짐 방지를 위해 인코딩 명시, 생략하면 시스템 기본 문자셋
			
			// strByteArr의 모든 byte들을 출력함
			os.write(strByteArr);
			// 버퍼에 잔류하는 모든 byte 출력
			os.flush();
			
			System.out.println("파일 저장 완료!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
