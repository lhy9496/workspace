package com.kh.Test240125;
/*
 * vo = value object 실질적인 값을 저장하는 클래스들 (추상화에 필요한 객체)
        vo를 작성할때는 getter, setter 메소드를 추가하는게 편하다.
   veiw = 출력창에 보여지는 코드를 작성하는 클래스

 */
public class Run {
	public static void main(String[] args) {
        LibraryController libraryController = new LibraryController();
        LibraryMenu libraryMenu = new LibraryMenu(libraryController);
        libraryMenu.mainMunu();
	}
}
