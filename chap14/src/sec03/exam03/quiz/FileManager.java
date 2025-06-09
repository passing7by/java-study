package sec03.exam03.quiz;

import java.io.File;

public class FileManager {
	public void deleteFile(File dir) {
		if (dir.delete()) System.out.println(dir.getAbsolutePath() + " -> 삭제 완료");
		else System.out.println(dir.getAbsolutePath() + " -> 삭제 안됨");
	}
}
