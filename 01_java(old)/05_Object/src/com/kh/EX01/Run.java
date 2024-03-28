package com.kh.EX01;
public class Run {
	public static void main(String[] args) {
		
		/*
		// 두개의 인스턴스 객체가 생성된다
		BankAccount Alice = new BankAccount();
		BankAccount Tom = new BankAccount();

		// 각각의 인스턴스를 대상으로 예금 진행
		Alice.deposit(5000);
		Tom.deposit(3000);
		
		// 각각의 인스턴스를 대상으로 출글 진행
		Alice.withdraw(2000);
		Tom.withdraw(2000);
		
		// 각각의 인스턴스 객체의 잔액을 조회
		Alice.checkMyBalance();
		Tom.checkMyBalance();
		
		System.out.println(Alice.balanceEquals(Tom));
		*/
		
		/*
		String st = new String("hello. by");
		BankAccount t = new BankAccount();
		t.test(st);
		System.out.println(st.hashCode());
		System.out.println(st);
		*/
		BankAccount Alice = new BankAccount("123-456-789", "123456-1234567", 10000);
		BankAccount Tom = new BankAccount("987-654-321", "987654-9876543", 10000);
	}
}
