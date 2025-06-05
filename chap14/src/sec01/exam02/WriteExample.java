package sec01.exam02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
	public static void main(String[] args) throws IOException {
		// Quiz: 데이터 도착지를 test2.db 파일로 하는 바이트 기반 파일 출력 스트림을 생성
		OutputStream os = new FileOutputStream("C:/Windows/Temp/test2.db");
		
		// 출력할 바이트 배열
		byte[] array = {10, 20, 30};
		
		// 배열의 모든 바이트를출력
		os.write(array);
		
		os.flush();
		os.close();
	}
}
