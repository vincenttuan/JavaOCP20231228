package day25;

public class Deposit implements Runnable {
	private Account account;
	private int amount;
	
	public Deposit(Account account, int amount) {
		this.account = account;
		this.amount = amount;
	}
	
	@Override
	public void run() {
		// 進行存款
		account.deposit(amount);
	}
	
}
