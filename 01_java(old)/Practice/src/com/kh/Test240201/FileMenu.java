package com.kh.Test240201;
import java.util.Scanner;

public class FileMenu {
	Scanner sc = new Scanner(System.in);
	FileController fc = new FileController();
	
	public void mainMenu() {
		while (true) {
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 입력 : ");
			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1:
				this.fileSave();
				break;
			case 2:
				this.fileOpen();
				break;
			case 3:
				this.fileEdit();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				break;
			}
		}
	}
	
	public void fileSave() {
		StringBuilder content = new StringBuilder();
		String line;
		
		while (true) {
			System.out.println("파일에 저장할 내용을 입력하세요.\nex끝it 이라고 입력하면 종료합니다.");
			System.out.print("입력 내용 : ");
			line = sc.nextLine();
			
			if (line.equals("ex끝it")) {
				break;
			} else {
				content.append(line + "\n");
			}
		}
		while (true) {
			System.out.print("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
			String fileName = sc.nextLine();

			if (fc.checkName(fileName)) { // 파일명이 존재한다면
				System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n) : ");
				char save = sc.next().toLowerCase().charAt(0);
				sc.nextLine();

				if (save == 'y') { // y를 입력시 => 덮어쓰기
					System.out.println("덮어쓰기가 완료 되었습니다.");
					fc.fileSave(fileName, content);
					break;
				} 
				else {
					System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				}
			} 
			else {
				System.out.println("파일이 정상적으로 저장되었습니다.");
				fc.fileSave(fileName, content);
				break;
			}
		}
	}

	public void fileOpen() {
		System.out.print("열 파일 명 : ");
		String file = sc.nextLine();
		if (fc.checkName(file)) {
			StringBuilder content = fc.fileOpen(file);
			System.out.println(content);
		}
		else {
			System.out.println("없는 파일입니다.");
		}
	}
	
	public void fileEdit() {
		System.out.print("수정할 파일 명 : ");
		String file = sc.nextLine();
		
		if (fc.checkName(file)) {
			StringBuilder content = new StringBuilder();
			String line;

			while (true) {
				System.out.println("파일에 저장할 내용을 입력하세요.\nex끝it 이라고 입력하면 종료합니다.");
				System.out.print("입력 내용 : ");
				line = sc.nextLine();

				if (line.equals("ex끝it")) {
					break;
				}
				else {
					content.append(line + "\n");
				}
			}
			fc.fileEdit(file, content);
		}
		else {
			System.out.println("없는 파일입니다.");
		}
	}
}
