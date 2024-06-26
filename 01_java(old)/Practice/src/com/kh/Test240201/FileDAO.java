package com.kh.Test240201;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileDAO {
	public boolean checkName(String file) {
		// File 객체를 생성하는 매개변수 있는 생성자에 file을 매개변수로 넘겨줌
		// 해당 파일이 있는지 없는지에 대한 boolean 값을 반환
		File f1 = new File(file);
		return f1.exists();
	}
	
	public void fileSave(String file, String s) {
		/*
		try {
			FileWriter fw = new FileWriter(file);
			fw.write(s);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
		*/
		try(BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
			br.write(s);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	/*
	 * [StringBuilder] => 효과적으로 문자열을 처리하기 위한 클래스로 다양한 기능의 메소드를 제공한다
	 *                    append(), insert(), delete(), replace()... 등등
	 */
	public StringBuilder fileOpen(String file) {
		StringBuilder content = new StringBuilder();
		String str = "";
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String value;
			
			// 끝까지 가져오면 null을 반환한다
			while ((value = br.readLine()) != null) {
				// str += (value + "\n");
				content.append(value).append("\n");
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return content;
	}
	
	public void fileEdit(String file, String s) {
		try(BufferedWriter br = new BufferedWriter(new FileWriter(file, true))) {
			br.write(s);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
