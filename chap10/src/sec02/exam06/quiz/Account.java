package sec02.exam06.quiz;

public class Account {
	private String user;
	private long balance;
	
	public Account() {

	}
	
	public Account(String user, long balance) {
		this.user = user;
		this.balance = balance;
	}
	
	public void deposit(int amount) {
		balance += amount;
		System.out.println(amount + "원이 입금되었습니다. [잔액: " + balance + "원]");
	}
	
	public void withdraw(int amount) throws InsufficientBalanceException {
		if (amount > balance) {
			throw new InsufficientBalanceException("출금 실패: 잔액이 " + (amount - balance) + "원 부족합니다.");
		}
		
		balance -= amount;
		System.out.println(amount + "원이 출금되었습니다. [잔액: " + balance + "원]");
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
}
