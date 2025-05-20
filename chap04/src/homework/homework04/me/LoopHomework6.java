package homework.homework04.me;

public class LoopHomework6 {
	public static void main(String[] args) {
		int cntBlank = 4; // 4~0 
		int cntStar = 1; // 1~9
		
		for(int i = 1; i <= 5; i++) { // 줄 수(5줄) 결정
			String str = "";
			
			// 앞쪽 빈칸 영역
			for(int j = 0; j <= cntBlank; j++) str += " ";
			// 별 영역
			for(int j = 1; j <= cntStar; j++) str += "*";
			// 뒤쪽 빈칸 영역
			for(int j = 0; j <= cntBlank; j++) str += " ";
			
			System.out.println(str);
			
			// 한 줄이 끝날 때마다 빈칸과 별의 수 증감
			cntBlank--;
			cntStar += 2;
		}
	}
}
