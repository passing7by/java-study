package homework.homework14.stream03;

import java.io.File;

public class FileDAO {
	// 존재하는 파일이 있는지 확인 후 반환
	public boolean checkName(String file) {
		// File 객체를 생성하는 매개변수 있는 생성자에 file을 매개변수로 넘겨줌
		// 해당 파일이 있는지 없는지에 대한 boolean 값을 반환		
		File f = new File(file);
		
		return false;
	}
	
	// 매개변수로 받은 파일 명에 문자열 저장
	public void fileSave(String file, String s) {
		// 매개변수로 들어온 file을 파일 명으로 이용하여 파일을 만들어주고 
		// String에 써서 저장
	}
	
	// 매개변수로 받은 파일 명을 이용하여 저장 되어 있는 데이터 반환
	public StringBuilder fileOpen(String file) {
		// 매개변수로 들어온 file로 파일을 찾아 StringBuilder에 값들 저장하여 반환
		return null;
	}
	
	// 매개변수로 받은 파일 명에 문자열 저장
	public void fileEdit(String file, String s) {
		// 매개변수로 들어온 file을 파일 명으로 이용하여 파일을 찾고
		// String에 써서 저장하되 이어서 저장될 수 있도록 함
	}
}
