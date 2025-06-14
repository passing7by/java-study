package homework.homework14.stream02;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Practice {
	public long method1(String location) {
		long start = System.nanoTime();
		char[] data = new char[10000];
		
		try (InputStream is = new FileInputStream("C:\\test\\sub\\" + location);
			 Reader w = new InputStreamReader(is);
		) {
			if (w.read(data) != -1) {
				for (char c : data) {
					System.out.print(c);
				}
				System.out.println("파일 읽기 성공");
			} else {
				System.out.println("파일 읽기 실패");
			}
			
		} catch (Exception e) {
			System.out.println("파일을 읽는 중 문제 발생");
		}
		
		long end = System.nanoTime();
		
		return end - start;
	}
	
	public long method2(String location) {
		long start = System.nanoTime();
		char[] data = new char[10000];
		
		try (InputStream is = new FileInputStream("C:\\test\\sub\\" + location);
			 BufferedInputStream bis = new BufferedInputStream(is);
			 Reader w = new InputStreamReader(bis);
		) {
			if (w.read(data) != -1) {
				for (char c : data) {
					System.out.print(c);
				}
				System.out.println("파일 읽기 성공");
			} else {
				System.out.println("파일 읽기 실패");
			}
			
		} catch (Exception e) {
			System.out.println("파일을 읽는 중 문제 발생");
		}
		
		long end = System.nanoTime();
		
		return end - start;
	}
}
