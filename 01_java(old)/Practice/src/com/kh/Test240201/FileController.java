package com.kh.Test240201;

public class FileController {
	FileDAO fd = new FileDAO();
	
	public boolean checkName(String file) {
		return fd.checkName(file);
	}
	
	public void fileSave(String file, StringBuilder sb) {
		String st1 = sb.toString();
		fd.fileSave(file, st1);
		// fd.fileSave(file, sb.toString());
	}
	
	public StringBuilder fileOpen(String file) {
		return fd.fileOpen(file);
	}
	
	public void fileEdit(String file, StringBuilder sb) {
		String st2 = sb.toString();
		fd.fileEdit(file, st2);
		// fd.fileEdit(file, sb.toString());
	}
}
