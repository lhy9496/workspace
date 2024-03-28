package com.kh.Test240125;
import java.util.Scanner;;
public class LibraryMenu {
	
    private LibraryController libraryController;
    private Scanner sc;
    
    public LibraryMenu(LibraryController libraryController) {
        this.libraryController = libraryController;
        this.sc = new Scanner(System.in);
    }
    
	public void mainMunu() {
		System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("성별을 입력하세요: ");
        char gender = sc.nextLine().charAt(0);
        Member mem = new Member(name, age, gender);
        libraryController.insertMember(mem);
        
        while(true) {
		System.out.println("==== 메뉴 ====");
		System.out.println("1. 마이페이지");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색");
		System.out.println("4. 도서 대여하기");
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		switch(num) {
		case 1:
            Member myInfo = libraryController.myInfo();
            System.out.println("마이페이지 정보: " + myInfo.toString());
            break;
        case 2:
            selectAll();
            break;
        case 3:
            searchBook();
            break;
        case 4:
            rentBook();
            break;
        case 9:
            System.out.println("프로그램을 종료합니다.");
            return;
        default:
            System.out.println("유효하지 않은 메뉴 번호입니다. 다시 입력해주세요.");
			}
        }
	}
	
	public void selectAll() {
		Book[] bList = libraryController.selectAll();
		for(int i = 0; i < bList.length; i++) {
			System.out.println(i + "번 도서 : " + bList[i].toString());
		}
	}
	
	public void searchBook() {
		System.out.print("제목 검색 : ");
		String keyword = sc.nextLine();
		Book[] searchList = LibraryController.searchBook(keyword);
		
		if(searchList != null && searchList.length > 0) {
			System.out.println("검색 결과 : ");
			for(Book book : searchList) {
				System.out.println(book.toString());
			}
		}
		else {
			System.out.println("검색 결과가 없습니다.");
		}
	}
	
	public void rentBook() {
		Book[] bList = libraryController.selectAll();
		System.out.print("대여할 도서의 번호 선택 : ");
		int index = sc.nextInt();
		sc.nextLine();
		int result = libraryController.rentBook(index);
	    switch (result) {
        case 0:
            System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
            break;
        case 1:      	
            System.out.println("나이 제한으로 대여 불가능입니다.");
            break;
        case 2:
            System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
            break;
        case 3:
        	System.out.println("성공적으로 대여되었습니다. 이 도서는 요리학원 쿠폰 발급이 없습니다.");
        case 4:
            System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
            break;
        default:
            System.out.println("유효하지 않은 도서 번호입니다.");
            break;
	    }
	}
}
