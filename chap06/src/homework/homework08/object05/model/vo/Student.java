package homework.homework08.object05.model.vo;

public class Student {
	// 학생 정보로는 학번, 이름, 교실명이 있습니다. 
	/*
	 * - 멤버 변수는 모두 직접 접근이 불가능합니다.
	   - 학번은 기본 생성자로 객체를 생성할 때마다 자동으로 1씩 큰 값이 부여됩니다.
	   - 학번은 출력은 되지만 수정은 불가능하도록 만들어주세요.
   	   - 그 외 다른 멤버 변수는 모두 수정과 조회가 가능하게 설계합니다.
	 */
	private static int studentNum;
	private String studentName;
	private String roomName;
	
	public Student() {
		++studentNum;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	
	
}
