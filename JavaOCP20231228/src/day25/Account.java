package day25;

public class Account {
	private int balance;
	
	public Account(int balance) {
		this.balance = balance;
	}
	
	// 提款方法, account 金額
	public synchronized void withdraw(int amount) {
		String tName = Thread.currentThread().getName();
		System.out.printf("%s 進來提款 $%d, 帳戶餘額 $%d%n", tName, amount, balance);
		
		//synchronized (this) {
			// 提款程序
			if(balance >= amount) {
				// 進行提款
				// 模擬提款所花費的時間
				for(int i=0;i<=999999;i++);
				
				// 帳戶扣抵
				balance = balance - amount;
				
				System.out.printf("%s 提款 $%d 成功, 帳戶餘額 $%d%n", tName, amount, balance);
			} else {
				System.out.printf("%s 提款 $%d 失敗, 帳戶餘額 $%d%n", tName, amount, balance);
			}
		//}
	}
	
	// 存款
	public synchronized void deposit(int amount) {
		String tName = Thread.currentThread().getName();
		System.out.printf("%s 進來存款 $%d, 帳戶餘額 $%d%n", tName, amount, balance);
		
		//synchronized(this) {
			// 進行存款
			// 模擬存款所花費的時間
			for(int i=0;i<=999999;i++);
			
			// 帳戶增額
			balance = balance + amount;
			
			System.out.printf("%s 存款 $%d 成功, 帳戶餘額 $%d%n", tName, amount, balance);
		//}
		
	}
	
}
