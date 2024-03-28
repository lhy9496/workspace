package com.kh.EX01;

public class BankAccount {
	// 필드(클래스의 데이터를 정의하는 곳)
	// 인스턴스 변수 생성
    int balance = 0; // 잔액
    String accNumber; // 계좌 번호
    String ssNumber; // 주민등록 번호
    /* 
     * 생성자(데이터 초기화를 위한 특수목적 메소드)
     * 생성자는 class와 이름이 동일한 메소드이다.
     * 반환형이 존재하지 않는다.
     * 아무것도 안들지 않으면 컴파일러가 자동으로 기본 생성자를 만들어준다.
     */
    // 메소드 오버로딩 상황
    public BankAccount() {
    	
    }
    public BankAccount(String accNumber, String ssNumber, int balance) {
    	// 지역 변수 생성 (this는 필드의 인스턴스를 불러오는 메소드)
    	System.out.println("객체 생성");
    	this.accNumber = accNumber;
    	this.ssNumber = ssNumber;
    	this.balance = balance;
    	/*
    	 * this. => 객체 자체의 필드값에 접근하는 방법
    	 */
    }
    
    public BankAccount(String accNumber, String ssNumber) {
    	this(accNumber, ssNumber, 0);
    	// this() => 생성자에서 다른 생성자를 호출해주는것으로 항상 최 상단에 위치해야한다.
    	/*
    	this.accNumber = accNumber;
    	this.ssNumber = ssNumber;
    	this.balance = 0;
    	*/
    }
//=================================================================
    // 데이터 초기값 세팅을위한 메소드 생성
    public void initAccount(String acc, String ss, int ba1) {
    	accNumber = acc;
    	ssNumber = ss;
    	balance = ba1;
    }
    public int deposit(int amount) { // 입금
        balance += amount;
        return balance;
    }
    public int withdraw(int amount) { // 출금
        balance -= amount;
        return balance;
    }
    public int checkMyBalance() { // 예금 조회
        System.out.println("잔액 : " + balance);
        return balance;
    }
    // BankAccount 객체 (act01)의 잔액과 현재 객체(run 안의 balance)의 잔액을 비교하는 메소드
    public boolean balanceEquals(BankAccount act01) {
    	if(balance == act01.balance) { // 잔액 비교
    		return true; // true 반환
    	}
    	else {
    		return false; // false 반환
    	}
    }
    public void test(String st1) {
    	st1.replace("hello", "by");
    	System.out.println(st1.hashCode());
    	System.err.println(st1);
    }
}