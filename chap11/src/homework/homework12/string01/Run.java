package homework.homework12.string01;

public class Run {
	public static void main(String[] args) {
		String str ="김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";
		
		// str을 \n을 기준으로 3개의 문자열로 나누기
		String[] infoList = str.split("\n");
		
		// 위 3개의 문자열을 ,를 기준으로 하여 값을 잘라서 객체를 생성
		// 만들어진 3개의 객체를 toString()을 통해 출력
		for (String info : infoList) {
			String[] strs = info.split(",");
			Person p = new Person(strs[0], Integer.parseInt(strs[1]), strs[2], strs[3].charAt(0));
			System.out.println(p);
		}
	}
}
