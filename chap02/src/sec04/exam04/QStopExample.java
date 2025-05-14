package sec04.exam04;

public class QStopExample {
	public static void main(String[] args) throws Exception {
		int keyCode;
		
		while (true) { // 무한 반복
			keyCode = System.in.read();
			
			// q를 입력하면 종료되도록 만들기
//			if(keyCode == 113) break;
			if(keyCode == 'q') break;
//			if(String.valueOf(keyCode).equals("q")) break;
			/*
			 *  [안됨. 왜?
			 *  read()는 키코드를 읽어옴. 숫자를 읽어온다는 뜻.
			 *  String.valueOf(숫자) 해봤자 String 타입인 숫자가 반환됨.
			 *  따라서 String.valueOf(keyCode).equals("q") 불가.]
			 */
			
			System.out.println("keyCode: " + keyCode);
//			System.out.println(String.valueOf(keyCode));
		}
		
		System.out.println("종료");
	}

}
