package ncs.test6;

// Exception 클래스를 상속 받음(이미 자바 프로그램 안에 만들어져 있는 클래스로 예외들이 모여있다)
public class InvalidException extends Exception {
	// Exception 클래스를 상속 받아 매개변수 message 상속 받는다.
	public InvalidException(String message) {
		super(message);
	}
}
