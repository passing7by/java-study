package homework.homework08.object06;

public class Bank {
	void transfer(Account sender, Account receiver, int amount) {
		System.out.println("------------- 송금 ------------");
		sender.withdraw(amount);
		receiver.deposit(amount);
		System.out.println("송금 성공");
		System.out.println();
	}
}
