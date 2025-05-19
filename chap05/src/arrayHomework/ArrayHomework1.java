package arrayHomework;

import java.util.Arrays;

public class ArrayHomework1 {
	public static void main(String[] args) {
		int[] heights = {152, 180, 165, 158, 171};
		
		for (int i = 0; i < heights.length; i++) {
			for (int j = i + 1; j < heights.length; j++) {
				if (heights[i] > heights[j]) {
					int temp = heights[i];
					heights[i] = heights[j];
					heights[j] = temp;
				}
			}
		}
		
		System.out.print(Arrays.toString(heights));
	}
}
