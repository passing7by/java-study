package arrayHomework;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayHomework4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] lottoNums = new int[6];
		
		for (int i = 0; i < lottoNums.length; i++) {
			lottoNums[i] = (int) (Math.random()*45) + 1;
		}
		
//		System.out.println(Arrays.toString(lottoNums));
		
		for (int i = 0; i < lottoNums.length; i++) {
			for (int j = i + 1; j < lottoNums.length; j++) {
				if (lottoNums[i] > lottoNums[j]) {
//					System.out.println("i: " + i + ", j: " + j);
//					System.err.println("i: " + lottoNums[i] + ", j: " + lottoNums[j]);
					int temp = lottoNums[j];
					lottoNums[j] = lottoNums[i];
					lottoNums[i] = temp;
//					System.err.println("i: " + lottoNums[i] + ", j: " + lottoNums[j]);
				}
			}
		}
		
		System.out.println(Arrays.toString(lottoNums));
	}
}
