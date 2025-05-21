package sec05.exam06;

public class Earth {
	// 불변의 값 상수 만들기
	static final double EARTH_RADIUS = 6400; // 관례적으로 모두 대문자로 작성, 단어와 단어 사이는 언더바로 연결
	static final double EARTH_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	
	// 생성자에서 초기화 할 수 없음
	// final은 됐는데 static final은 왜 안됨?
	// static 객체 생성 없이 사용하는 멤버 => 생성자로 객체를 생성해야 값이 들어간다는 게 모순
//	public Earth() {
//		EARTH_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
//	}
	
	// (참고)
	// 선언 시 초기화를 안했을 경우 static 블록에서 초기화
//	static {
//		// 클래스의 static 멤버가 메모리에 올라갈 때 실행 됨 (객체 생성 이전)
//		EARTH_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
//	}
}
