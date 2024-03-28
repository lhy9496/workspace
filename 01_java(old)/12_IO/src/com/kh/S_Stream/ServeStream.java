package com.kh.S_Stream;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ServeStream {
	/*
	 * [보조 스트림] => 기반스트림만으로는 부족했던 성능(기능)을 보다 향상시켜주는 스트림
	 *               기반스트림에서 제공하지 않는 추가적인 메소드를 제공한다. / 데이터 전송 속도를 향상시켜준다.
	 *               외부 매체와 직접적으로 연결되는 스트림이 아니다.(단독 사용이 불가능 > 반드시 기반 스트림과 함께 사용)
	 */
	// 프로그램 => 파일(출력)
	public void fileSave() {
		// 1. 기반스트림 먼저 생성
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"))) {
			/*
			// FileWriter : 파일과 직접적으로 연결해서 2바이트 단위로 출력할 수 있는 기반 스트림
			FileWriter fw = new FileWriter("c_buffer.txt");
			// 2. 보조스트림 생성시 기반스트림 객체를 전달하면서 생성
			BufferedWriter bw = new BufferedWriter(fw);
			*/
			bw.write("안녕하세요.\n");
			bw.write("반갑습니다.");
			bw.newLine();
			bw.write("끝");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileRead() {
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))) {
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
			
			String value = null;
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e1) {
			e1.printStackTrace();
		}
	}
	// 프로그램 => 파일 출력
	public void obejectSave() {
		// 출력할 데이터 (Product객체)
		Product phone1 = new Product("아이폰1", 1000000);
		Product phone2 = new Product("아이폰2", 2000000);
		Product phone3 = new Product("아이폰3", 3000000);
		// FileOutputStream : 파일과 연결해서 1바이트 단위로 출력할 수 있는 기반 스트림
		// ObjectOutputStream : 객체 단위로 출력할 수 있도록 도움을 주는 보조스트림(ObjectWriter 메소드가 없음)
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_product.txt"))) {
			oos.writeObject(phone1);
			oos.writeObject(phone2);
			oos.writeObject(phone3);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void objectRead() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_product.txt"))) {
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
		}
		catch (EOFException e) {
			System.out.println("파일을 다 읽어들였습니다.");
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
