package homework.homework14.stream01;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Practice {
	public long method1(String song) {
		long start = System.nanoTime();
		
		try (OutputStream os = new FileOutputStream("C:\\test\\sub\\나비야1.dat");
			 Writer w = new OutputStreamWriter(os);
		) {
			w.write(song);
			System.out.println("파일 생성 성공");
		} catch (Exception e) {
			System.out.println("파일 생성 실패");
		}

		long end = System.nanoTime();
		
		return end - start;
	}
	
	public long method2(String song) {
		long start = System.nanoTime();
		
		try (OutputStream os = new FileOutputStream("C:\\test\\sub\\나비야2.dat");
			 BufferedOutputStream bos = new BufferedOutputStream(os);
			 Writer w = new OutputStreamWriter(bos);
		) {
			w.write(song);
			System.out.println("파일 생성 성공");
		} catch (Exception e) {
			System.out.println("파일 생성 실패");
		}
		
		long end = System.nanoTime();
		
		return end - start;
	}
}
