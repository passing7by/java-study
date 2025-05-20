package homework.homework05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayHomework6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1. 입력
		
		// 2. 배열에 값을 추가할 것인지 질문 후 분기
		// Y/y -> 추가 데이터 입력받기
		// N/n -> 더이상 입력받지 않고 배열 출력
		// 다른 값 -> “입력할 수 없는 값입니다.” 출력 후 2.로 돌아감
		
		boolean flag = true;
		int arrLength = 0;
		String answer = "N";
		String[] arr = null;
		
		outer: while (flag) {
			// 1. 입력
			System.out.println("배열의 크기를 입력하세요 : ");
			arrLength = sc.nextInt();
			// 입력받은 수만큼의 길이를 갖는 배열 생성
			arr = new String[arrLength];
			
			// 배열을 돌며 값 넣기
			for (int i = 0; i < arr.length; i++) {
				System.out.println(i + 1 + "번째 문자열 : ");
				arr[i] = sc.next();
			}
			
			// 2. 배열에 값을 추가할 것인지 질문 후 분기
			while (true) {
				System.out.println("더 값을 입력하시겠습니까?(Y/N) : ");
				answer = sc.next();
				
				// N/n -> 더이상 입력받지 않고 배열 출력
				if (answer.equalsIgnoreCase("N")) break outer;
				// Y/y -> 추가 데이터 입력받기
				else if (answer.equalsIgnoreCase("Y")) break;
				// 다른 값 -> “입력할 수 없는 값입니다.” 출력 후 2.로 돌아감
				else System.out.println("입력할 수 없는 값입니다.");
			}
			
			// 추가 데이터 입력 및 실행
			while (true) {
				System.out.println("더 입력하고 싶은 개수 : ");
				int moreLength = sc.nextInt();
				
				// 입력받은 만큼 늘어난 배열 생성 후 기존 배열의 값 복사
				String[] newArr = Arrays.copyOf(arr, arr.length + moreLength);
				
				// 배열을 돌며 값 넣기
				for (int i = arr.length; i < newArr.length; i++) {
					System.out.println(i + 1 + "번째 문자열 : ");
					newArr[i] = sc.next();
				}
				
				// arr를 newArr로 초기화
				arr = Arrays.copyOf(newArr, newArr.length);
				
				// 더 받을건지 질문 후 분기
				while (true) {
					System.out.println("더 값을 입력하시겠습니까?(Y/N) : ");
					String answer2 = sc.next();
					if (answer2.equalsIgnoreCase("N")) break outer;
					else if (answer.equalsIgnoreCase("Y")) break;
					else System.out.println("입력할 수 없는 값입니다.");
				}
			}
		}
		// 배열 출력
		for (String str : arr) System.out.println(str);
	}
}
