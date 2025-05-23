package homework.homework09.inherit01.run;

import java.util.Scanner;

import homework.homework09.inherit01.model.vo.Employee;
import homework.homework09.inherit01.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 3명의 학생 정보를 기록할 수 있게 객체 배열 할당 (Student[])
		Student[] studentList = new Student[3];

		// 사용데이터 참고하여 3명의 학생 정보 초기화 
		studentList[0] = new Student("김철수", 20, 178.2, 70.0, 1, "정보시스템공학과");
		studentList[1] = new Student("이영희", 23, 167.0, 54.0, 4, "물리학과");
		studentList[2] = new Student("홍길동", 21, 197.6, 86.0, 2, "경영학과");
		
		// 위의 학생 정보 모두 출력
		for (int i = 0; i < studentList.length; i++) {
			System.out.println(studentList[i].toString());
		}
		
		// 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당 (Employee[]) 
		Employee[] employeeList = new Employee[10];
		
		// 사원 10명이 다 차지 않은 상태에서 
		
		// 사원들의 정보를 키보드로 계속 입력 받고   --> while(true) 무한 반복문을 통해 
		// 입력받은 정보들을 가지고 매개변수 생성자를 이용하여 객체배열에 객체 생성 
		// 한 명씩 추가 될 때마다 카운트함 
		System.out.println("=== 사원 입력받기 ===");
		
		int empCnt = 0;
		boolean isAdd = true;
		
		while(isAdd) {
			System.out.print("이름 : ");
//			String name = "주인성";
			String name = sc.nextLine();
			
			System.out.print("나이 : ");
//			int age = Integer.parseInt("28");
			int age = sc.nextInt();
			sc.nextLine();
			
			System.out.print("키 : ");
//			double height = Double.parseDouble("180.3");
			double height = sc.nextDouble();
			sc.nextLine();
			
			System.out.print("몸무게 : ");
//			double weight = Double.parseDouble("72.0");
			double weight = sc.nextDouble();
			sc.nextLine();
			
			System.out.print("급여 : ");
//			int salary = Integer.parseInt("2000000");
			int salary = sc.nextInt();
			sc.nextLine();
			
			System.out.print("부서 : ");
//			String dept = "영업부";
			String dept = sc.nextLine();
			
			employeeList[empCnt] = new Employee(name, age, height, weight, salary, dept);
			empCnt++;
			
			// 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가 
			// ‘n’일 경우 더 이상 그만 입력 받도록.. 
			String answer = "";
			while(true) {
				System.out.print("계속 추가하시겠습니까? (Y/N 혹은 y/n)");
				
				answer = sc.nextLine(); // 스캐너로 받을 값
				
				if (!(answer.equalsIgnoreCase("N") || answer.equalsIgnoreCase("Y"))) {
					System.out.println("Y/N 혹은 y/n으로 입력해 주세요.");
				}
				if (answer.equalsIgnoreCase("N")) {
					isAdd = false;
					break;
				}
			}
		}
		
		// 배열에 담긴 사원들의 정보를 모두 출력
		for (int i = 0; i < employeeList.length; i++) {
			if (employeeList[i] == null) continue;
			System.out.println(employeeList[i].toString());
		}
	}
}
