package homework.homework14.stream03;

public class FileController { 
	// 필드
	FileDAO fd = new FileDAO();
	
	// DAO에 매개변수를 전달하고, DAO로부터 전달받은 값을 다시 반환
	public boolean checkName(String file){ 
		// FileDAO(fd)의 checkName() 매개변수로 file을 넘겨주고  
		// 그리고 그 반환 값을 그대로 받아 또 반환해줌
		return fd.checkName(file);
	}
	
	// 전달받은 매개변수를 변경하고 DAO에 전달
	public void fileSave(String file, StringBuilder sb){ 
		// 매개변수로 넘어온 sb를 String으로 바꿔 
		// fd의 fileSave()메소드 매개변수로 
		// file과 String을 넘김 
		fd.fileSave(file, sb.toString());
	} 
	
	// DAO에 매개변수를 전달하고, DAO로부터 전달받은 값을 다시 반환
	public StringBuilder fileOpen(String file){ 
		// fd의 fileOpen() 매개변수로 file을 넘겨주고 
		// 그 반환 값을 그대로 받아 또 반환
		return fd.fileOpen(file);
	}
	
	// 전달받은 매개변수를 변경하고 DAO에 전달
	public void fileEdit(String file, StringBuilder sb){ 
		// 매개변수로 넘어온 sb를 String으로 바꿔 
		// fd의 fileEdit()메소드 매개변수로 
		// file과 String을 넘김 
		fd.fileEdit(file, sb.toString());
	} 
}