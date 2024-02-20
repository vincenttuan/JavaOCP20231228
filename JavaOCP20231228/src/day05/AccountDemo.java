package day05;

public class AccountDemo {

	public static void main(String[] args) {
		Account account = new Account("John", 10000);
		System.out.println(account);
		//account.balance += 2000; // 加 2000 (存款)
		account.deposit(2000); // 透過存款方法來存款 2000
		System.out.println(account);
		//account.balance -= 500; // 減 500 (提款)
		account.withdraw(500); // 透過提款方法來提款 500
		System.out.println(account);
		//account.balance = -500; // 寫錯了 ?? (提款 ??)
		account.withdraw(-500); // 透過提款方法來提款 -500
		System.out.println(account);
		
		// 列印完整帳戶餘額
		System.out.printf("帳號: %s 餘額: %d%n", 
				account.getName(), account.getBalance());
		
	}

}
