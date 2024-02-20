package day05;

// 帳戶資料
public class Account {
	private String name; // 戶名
	private int balance; // 餘額
	
	public Account() {
		
	}
	
	public Account(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}
	
	// 轉帳
	// targetAccount: 轉帳的對象
	// amount: 轉帳金額
	public void transfer(Account targetAccount, int amount) {
		if(this.balance >= amount) {
			System.out.printf("轉帳 $%,d 成功%n", amount);
			this.withdraw(amount); // 將 amount 款項提出
			targetAccount.deposit(amount); // 將 amount 存入對方帳戶
		} else {
			System.out.printf("轉帳 $%,d 失敗, 餘額不足%n", amount);
		}
	}
	
	// 存款的方法
	public void deposit(int amount) {
		if(amount > 0) {
			this.balance += amount;
		}
	}
	
	// 提款的方法
	public void withdraw(int amount) {
		if(amount > 0) {
			this.balance -= amount;
		}
	}
	
	// 取得戶名
	public String getName() {
		return this.name;
	}
	
	// 取得餘額
	public int getBalance() {
		return this.balance;
	}
	
	@Override
	public String toString() {
		return "Account [name=" + name + ", balance=" + balance + "]";
	}

}
