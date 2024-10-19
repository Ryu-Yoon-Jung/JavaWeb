package exceptionHandling;

import java.util.Scanner;

public class BankAccount {
	private int balance;

	public BankAccount(int balance) {
		super();
		this.balance = balance;
	}
	
	// 출금시 예외처리
	public void withdraw(int amount) throws InsufficientFundsException{
		if(amount > balance) {
			throw new InsufficientFundsException("잔액부족");
		}
		balance -= amount;
		System.out.println("출금 성공, 잔액은 : " + balance);
	}
	
	// 기본 입금 메서드
	public void deposit (int amount) {
		balance += amount;
		System.out.println("입금 성공, 잔액은 : " + balance);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("초기잔액 입력>");
		int initBalane = scanner.nextInt();
		
		// 초기 입력값으로 객체 생성
		BankAccount account = new BankAccount(initBalane);
		
		try {			
			System.out.println("출금액 입력>");
			int withdrawAmount = scanner.nextInt();
			account.withdraw(withdrawAmount);
			
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("프로그램 종료합니다");
			scanner.close();
		}
	}
}
