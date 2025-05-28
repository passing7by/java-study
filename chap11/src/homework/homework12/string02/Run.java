package homework.homework12.string02;

import java.util.ArrayList;

public class Run {
	public static void main(String[] args) {
		ArrayList<String> addressList = new ArrayList<String>();
		addressList.add("서울특별시 금천구 구로디지털2로 95");
		addressList.add("서울특별시 서대문구 연희로 248");
		addressList.add("울산광역시 남구 돋질로 233");
		addressList.add("경상북도 구미시 송정대로 55");
		
		addressList.forEach(address -> System.out.println(Practice.takeState(address)));
	}
}
