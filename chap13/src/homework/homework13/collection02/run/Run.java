package homework.homework13.collection02.run;

import java.util.Iterator;

import homework.homework13.collection02.controller.LotteryController;
import homework.homework13.collection02.model.vo.Lottery;
import homework.homework13.collection02.view.LotteryMenu;

public class Run {
	public static void main(String[] args) {
		// LotteryController Test
		/*
		LotteryController lc = new LotteryController();
		
		lc.insertObject(new Lottery("김지남", "01000001111"));
		lc.insertObject(new Lottery("김지남", "01000001111"));
		lc.insertObject(new Lottery("김소현", "01022223333"));
		lc.insertObject(new Lottery("송민아", "01044446666"));
		lc.insertObject(new Lottery("이상혁", "01055557777"));
		lc.insertObject(new Lottery("한태산", "01088889999"));
		lc.insertObject(new Lottery("김태형", "01000000000"));
		lc.insertObject(new Lottery("농담곰", "01000000000"));
		
		for (Lottery l : lc.searchObject()) {
			System.out.println(l);
		}
		
		System.out.println();
		
		lc.deleteObject(new Lottery("송민아", "01044446666"));
		
		for (Lottery l : lc.searchObject()) {
			System.out.println(l);
		}
		
		for (Lottery l : lc.winObject()) {
			System.out.println(l);
		}		
		
		System.out.println();
		
		for (Lottery l : lc.sortedWinObject()) {
			System.out.println(l);
		}

		System.out.println(lc.searchWinner(new Lottery("김소현", "01022223333")));
		System.out.println(lc.searchWinner(new Lottery("농담곰", "01000000000")));
		
		lc.deleteObject(new Lottery("농담곰", "01000000000"));
		
		for (Lottery l : lc.winObject()) {
			System.out.println(l);
		}	
		 */
		
		// LotteryMenu Test
		LotteryMenu lm = new LotteryMenu();
		
		lm.mainMethod();
	}
}
