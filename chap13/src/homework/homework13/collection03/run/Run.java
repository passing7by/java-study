package homework.homework13.collection03.run;

import homework.homework13.collection03.controller.MemberController;
import homework.homework13.collection03.model.vo.Member;
import homework.homework13.collection03.view.MemberMenu;

public class Run {
	public static void main(String[] args) {
		// MemberController Test
		/*
		MemberController mc = new MemberController();
		
		boolean isJoined = mc.joinMember("user1", new Member("1", "name1"));
		System.out.println(isJoined);
		isJoined = mc.joinMember("user1", new Member("1", "name1"));
		System.out.println(isJoined);
		
		String loginUserName = mc.logIn("user1", "1");
		System.out.println(loginUserName);
		loginUserName = mc.logIn("user2", "1");
		System.out.println(loginUserName);
		loginUserName = mc.logIn("user1", "2");
		System.out.println(loginUserName);
		
		boolean isPwdChanged = mc.changePassword("user1", "2", "3");
		System.out.println(isPwdChanged);
		isPwdChanged = mc.changePassword("user1", "1", "2");
		System.out.println(isPwdChanged);
				
		System.out.println(mc.sameName("name1"));
		mc.changeName("user1", "이름1");
		*/
		
		// MemberMenu Test
		MemberMenu mm = new MemberMenu();
		mm.mainMenu();
	}
}
