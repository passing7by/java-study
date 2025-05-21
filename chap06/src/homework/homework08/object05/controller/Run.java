package homework.homework08.object05.controller;

import homework.homework08.object05.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		// 실행 클래스(Run)에서 객체 3개를 만들어주세요. 
		// 생성된 객체에 setter로 값을 부여하고, getter로 출력 예시와 같이 출력하세요. 
		Student s1 = new Student();
		s1.setStudentName("김철수");
		s1.setRoomName("A");
		System.out.println(s1.getStudentNum() + " " + s1.getStudentName() + " " + s1.getRoomName());
		
		Student s2 = new Student();
		s2.setStudentName("홍길동");
		s2.setRoomName("F");
		System.out.println(s2.getStudentNum() + " " + s2.getStudentName() + " " + s2.getRoomName());
		
		Student s3 = new Student();		
		s3.setStudentName("이영희");
		s3.setRoomName("B");
		System.out.println(s3.getStudentNum() + " " + s3.getStudentName() + " " + s3.getRoomName());		
	}
}
