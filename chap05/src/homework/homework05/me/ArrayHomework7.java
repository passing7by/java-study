package homework.homework05.me;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayHomework7 {
	public static void main(String[] args) {
		String[] report = {"Introduction", "Research", "Conclusion"};
		
		String[] reportCopy = Arrays.copyOf(report, report.length);
		reportCopy[0] = "Team Feedback";
		
		System.out.println("원본 보고서: " + Arrays.toString(report));
		System.out.println("복사된 보고서: " + Arrays.toString(reportCopy));
	}
}
