// 각자 테마 변경 및 글자 크기 조정
// Window > Preferences
// 단축키: ctrl + 또는 -

// 주석 사용하기
// 한 줄 주석
/*
 * 여러 줄
 * 주석
 */
/**
 * document 주석: document 문서 생성에 사용
 */
// ctrl + shift + \ : 여러 줄 주석 해제
package sec03.exam01; // 패키지 선언: 해당 소스 파일이 sec03.exam01 패키지 밑에 있음

public class Hello { // 클래스 선언: 클래스 이름은 대문자로 시작하고 소스 파일의 이름과 동일
	// main(): 프로그램 실행 진입점
	public static void main(String[] args) { // main 메소드 선언: 자바 프로그램 실행 시 가장 먼저 실행되는 메소드
		// 콘솔에 출력하는 실행문
		System.out.println("안녕 Java야");
		// 저장을 누를 때마다 자동으로 컴파일 됨(만약 에러가 있으면 빨간줄 발생!)
		
	}
}