package sec01.exam03.quiz;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Quiz1 {
	// Quiz
//	FileOutputStream을 사용하여 
//	"C:/Temp/애국가1.dat" 파일을 생성하고
//	애국가1.dat 파일에 아래와 같은 문장을 출력하세요.
		
//	String song = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사"
//			+ "\n우리나라 만세 무궁화 삼천리 화려강산"
//			+ "\n대한사람 대한으로 길이 보전하세";
		
//  힌트: FileOutputStream은 바이트 기반 스트림이므로 문자열을 바이트로 변환해야 함
	
	public static void main(String[] args) {
		String song = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사"
				+ "\n우리나라 만세 무궁화 삼천리 화려강산"
				+ "\n대한사람 대한으로 길이 보전하세";
		
//		byte[] songByteArr = new byte[song.length()];
//		
//		// song의 문자들을 하나씩 byte로 변환해 songByteArr에 담음
//		for (int i = 0; i < song.length(); i++) {
//			songByteArr[i] = (byte) song.charAt(i);
//		}
		
		
		// OutputStream 생성 및 파일을 생성할 경로 지정
		try (OutputStream os = new FileOutputStream("C:/Windows/Temp/애국가1.dat")) {
			// 인코딩: 문자열을 바이트 배열로 바꾸는 과정
			byte[] songByteArr = song.getBytes("UTF-8"); // 글자 깨짐 방지를 위해 인코딩 명시, 생략하면 시스템 기본 문자셋
			
			// songByteArr의 모든 byte들을 출력함
			os.write(songByteArr);
			// 버퍼에 잔류하는 모든 byte 출력
			os.flush();
			
			System.out.println("파일 저장 완료!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
