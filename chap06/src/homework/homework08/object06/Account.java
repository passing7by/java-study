package homework.homework08.object06;

public class Account {
	private String accountNumber;
	private int balance;
	
	public Account() {
		
	}

	public Account(String accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public int getBalance() {
		return balance;
	}
	
	public void deposit(int amount) {
		balance += amount;
		System.out.println("------------- 입금 ------------");
		System.out.println("계좌번호 : " + accountNumber);
		System.out.println("입금액 : " + amount);
		System.out.println("잔액 : " + balance);
		System.out.println();
	}
	
	public void withdraw(int amount) {
		balance -= amount;
		System.out.println("------------- 출금 ------------");
		System.out.println("계좌번호 : " + accountNumber);
		System.out.println("출금액 : " + amount);
		System.out.println("잔액 : " + balance);
		System.out.println();
	}
}
