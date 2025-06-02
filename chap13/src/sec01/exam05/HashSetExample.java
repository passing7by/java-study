package sec01.exam05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import sec01.exam01_2.Student;

public class HashSetExample {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		// 인스턴스는 다르지만 내부 데이터가 동일한 경우
		// 객체의 hashCode()와 equals()를 기준으로 판단
		set.add(new Member("김재현", 30));
		set.add(new Member("김재현", 30));

		// hashCode()와 equals()를 재정의하지 않으면 삭제 안됨
		set.remove(new Member("김재현", 30));
		
		// 이 외에도 동등 객체로 판단하는 많은 메소드들이 제대로 동작하려면 재정의 필수임
		
		System.out.println("총 객체수: " + set.size());
		for (Member member : set) {
			System.out.println("\t" + member);
		}
		
		// 요소 정렬
		// Integer, String과 같은 경우 Collections.sort() 바로 사용 가능
		// Member처럼 사용자 정의 객체끼리 비교한 경우 비교 불가능
		// 정렬 기준으로 어떤 값을 사용할지 별도로 구현해야 함
		// Member 클래스가 CompareTo 메소드를 구현
		
		// Set -> List 변환
		List<Member> list = new ArrayList<Member>(set);
		list.add(new Member("김재현", 20));
		list.add(new Member("명재현", 22));
		list.add(new Member("이상혁", 28));
		
		// 정렬
		Collections.sort(list);

		for (Member m : list) {
			System.out.println(m.getName() + "-" + m.getAge());
		}
		
		System.out.println();
		
		// 다시 Set으로 (순서 유지하려면 LinkedHashSet)
		Set<Member> sortedSet = new LinkedHashSet<Member>(list);
		for (Member m : sortedSet) {
			System.out.println(m.getName() + "-" + m.getAge());
		}
		
		System.out.println();
		
		// ArrayList의 요소에서 중복 제거하기
		List<Member> memList = new ArrayList<Member>();
		memList.add(new Member("김재현", 30));
		memList.add(new Member("김재현", 30)); // 중복
		memList.add(new Member("김지남", 28));
		memList.add(new Member("김지남", 28)); // 중복
		memList.add(new Member("강민지", 15));
		memList.add(new Member("효민룩", 50));
		
		// Quiz
		Set<Member> memSet = new HashSet<Member>(memList);
		memList = new ArrayList<Member>(memSet);
		for (Member m : memList) {
			System.out.println(m.getName() + "-" + m.getAge());
		}
	}
}
