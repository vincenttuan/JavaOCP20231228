package day05;

public class AccountDemo2 {

	public static void main(String[] args) {
		
		Account account1 = new Account("John", 10000);
		Account account2 = new Account("Mary", 10000);
		
		// John 要轉 3000 元給 Mary
		// 請印出轉帳後 John 與 Mary 的餘額各為多少 ?
		int amount = 3000;
		account1.withdraw(amount); // John 提款 3000
		account2.deposit(amount);  // Mary 存款 3000
		
		System.out.printf("轉帳 $%,d 成功%n", amount);
		System.out.println(account1);
		System.out.println(account2);
		
		// John 要再轉 8000 元給 Mary
		// 請印出轉帳後 John 與 Mary 的餘額各為多少 ?
		int amount2 = 8000;
		if(account1.getBalance() >= amount2) {
			System.out.printf("轉帳 $%,d 成功%n", amount2);
			account1.withdraw(amount2); // John 提款 8000
			account2.deposit(amount2);  // Mary 存款 8000
		} else {
			System.out.printf("轉帳 $%,d 失敗, 餘額不足%n", amount2);
		}
		System.out.println(account1);
		System.out.println(account2);
		
	}

}
