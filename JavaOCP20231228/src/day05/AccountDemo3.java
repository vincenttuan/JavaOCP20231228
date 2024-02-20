package day05;

public class AccountDemo3 {

	public static void main(String[] args) {
		Account account1 = new Account("John", 10000);
		Account account2 = new Account("Mary", 10000);
		
		// John 要轉 3000 元給 Mary
		// 請印出轉帳後 John 與 Mary 的餘額各為多少 ?
		account1.transfer(account2, 3000);
		System.out.println(account1);
		System.out.println(account2);
		
		// John 要再轉 8000 元給 Mary
		// 請印出轉帳後 John 與 Mary 的餘額各為多少 ?
		account1.transfer(account2, 8000);
		System.out.println(account1);
		System.out.println(account2);

	}

}
