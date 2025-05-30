package homework.homework13.collection01.run;

import homework.homework13.collection01.view.BookMenu;

public class Run {
	public static void main(String[] args) {
		/* BookController 메서드 Test
		BookController bc = new BookController();
		
		bc.insertBook(new Book("혼자 공부하는 자스", "생텍쥐페리", "소설", 4000));
		
		for (Book b : bc.selectList()) {
			System.out.println(b);
		}
		
		System.out.println();
		
		for (Book b : bc.searchBook("혼자")) {
			System.out.println(b);
		}
		
		System.out.println();
		
		System.out.println("삭제할 책: " + bc.deleteBook("혼자 공부하는 자바", "신용권"));
		
		System.out.println();		
		
		for (Book b : bc.selectList()) {
			System.out.println(b);
		}
		
		System.out.println();
		
		System.out.println("오름차순 정렬 결과(성공: 1): " + bc.ascBook());
		
		System.out.println();
		
		for (Book b : bc.selectList()) {
			System.out.println(b);
		}
		*/

		/* BookMenu 메서드 Test
		BookMenu bm = new BookMenu();
		
//		bm.mainMenu();
//		bm.selectList();
//		bm.insertBook();
//		bm.selectList();
//		bm.searchBook();
//		bm.deleteBook();
//		bm.selectList();
//		bm.ascBook();
//		bm.selectList();
		*/
		
		// 실행
		BookMenu bm = new BookMenu();
		bm.mainMenu();
	}
}
