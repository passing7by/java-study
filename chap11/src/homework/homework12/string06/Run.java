package homework.homework12.string06;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String sentence = "the quick brown fox jumps over the lazy dog";
		
//		사용자로부터 단어를 입력받음
		System.out.print("단어를 입력하세요: ");
		String input = sc.nextLine();
		
//		입력받은 단어가 sentence에 존재하는지 확인
		boolean isExist =  sentence.contains(input);
		
		String[] words = sentence.split(" ");
		
//		단어가 존재하지 않으면:
//		- “존재하지 않는 단어입니다.”라고 출력하세요.
		if (!isExist) {
			System.out.println("존재하지 않는 단어입니다.");
			return;
		}
		
//		단어가 존재하면 :
//		- 해당 단어 뒤에 오는 단어를 출력합니다.
//		- 만약 입력된 단어가 마지막 단어라면, “마지막 단어입니다.”라고 출력하세요.
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(input)) {
				if (i < words.length - 1) System.out.println(words[i] + " 다음 단어: " + words[i+1]);
				else System.out.println("마지막 단어입니다.");
				
				break;
			}
		}
	}
}
