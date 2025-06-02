package homework.homework13.collection02.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import homework.homework13.collection02.model.vo.Lottery;

public class LotteryController {
	// 추첨 대상을 담을 HashSet 객체 생성(lottery)
	// 당첨 대상을 담을 HashSet 객체 생성(win)
	Set<Lottery> lottery = new HashSet<Lottery>();
	Set<Lottery> win = new HashSet<Lottery>();
	
	public boolean insertObject(Lottery l) {
		// 1. 전달 받은 l을 lottry HashSet에 추가
		// 2. 추가 결과를 boolean 값으로 반환
		return lottery.add(l);
	}
	
	public boolean deleteObject(Lottery l) {
		// 1. 전달 받은 l을 lottery에서 삭제
		boolean isRemoved = lottery.remove(l);
		// 2. 당첨자 목록 win중에 삭제된 추첨 대상자가 존재할 수 있음
		// 3. 삭제 결과인 boolean 값과 win 객체가 null이 아닐 때에만
		// win에도 해당 추첨 대상자 삭제
		if (isRemoved == true && win != null) win.remove(l); // 삭제가 성공했으며, win이 존재하면 win에서 삭제
		
		return isRemoved;
	}
	
	public Set<Lottery> searchObject(){
		// lottery를 리턴
		return lottery;
	}
	
	public Set<Lottery> winObject(){
		// 1. 추첨 대상자 중에서 랜덤으로 뽑아 당첨 목록에 넣는 메소드
	// -> 당첨 목록을 찾+1                                                                                                     1기 전에 추첨 대상의 수가 4보다 큰지 먼저 확인
		// -> lottery의 크기가 4보다 작은 경우 null 리턴
		if (lottery.size() < 4) return null;

		// 2. 랜덤으로 뽑기 위해 lottery를 ArrayList에 담고
		// 인덱스를 이용해 win에 당첨자 저장
		// 이때, 당첨자 수는 무조건 4명 이를 위한 추첨자 수는 4명 이상
		List<Lottery> lotteryList = new ArrayList<Lottery>(lottery);
		while (win.size() < 4) {
			int winner = (int) (Math.random() * lotteryList.size());
			win.add(lotteryList.get(winner));
		}

		// 만일 당첨자 목록에 삭제된 추첨 대상자가 있다면
		// -> 삭제된건지 아닌지 어떻게 알지..? 삭제할 때 삭제 이력을 남기지 않는데...? 그리고 삭제할 때 lottey랑 win 둘 다에서 지우는데...?
		// ㄴ 
		// 기존에 당첨된 사람은 제외
		// 삭제된 사람의 자리만 새로운 추첨자로 채우기
		
		return win;
	}
	
	public Set<Lottery> sortedWinObject(){
		// 1. 이름을 오름차순으로 정렬
		// 이름이 같으면 번호로 오름차순 정렬
		List<Lottery> sortedList = new ArrayList<Lottery>(win);
		Collections.sort(sortedList);
		Set<Lottery> sortedSet = new LinkedHashSet<Lottery>(sortedList);
		
		// 정렬의 결과를 반환
		// 이때, 미리 만들어진 win을 가지고 정렬
		return sortedSet;
	}
	
	public boolean searchWinner(Lottery l) {
		// 1. win에 해당 객체가 있는지 확인
		// 2. 결과 boolean을 리턴
		return win.contains(l);
	}
}
