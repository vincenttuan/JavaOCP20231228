package day05;

import java.util.Arrays;

public class AccountDemo4 {

	public static void main(String[] args) {
		Account[] accounts = {
				new Account("John", 10000),
				new Account("Mary", 10000),
				new Account("Jack", 10000),
				new Account("Rose", 10000)
		};
		// 印出所有人的帳戶資訊
		System.out.println(Arrays.toString(accounts));
		
		// Mary 要存款 3000 元並印出所有人的帳戶資訊(可以觀察到 Mary 的帳戶資料多 3000 元)
		String accountName = "Mary";
		int amount = 3000;
		// for-loop
		/*
		for(int i=0, lens=accounts.length;i<lens;i++) {
			if(accounts[i].getName().equals(accountName)) {
				System.out.printf("%s 存款 $%,d%n", accountName, amount);
				accounts[i].deposit(amount);
				break;
			}
		}
		*/
		// for-each/for-in
		/*
		for(Account account : accounts) {
			if(account.getName().equals(accountName)) {
				System.out.printf("%s 存款 $%,d%n", accountName, amount);
				account.deposit(amount);
				break;
			}
		}
		*/
		// Java 8 Stream
		Arrays.stream(accounts)
			  .filter(account -> account.getName().equals(accountName))
			  .forEach(account -> {
				  System.out.printf("%s 存款 $%,d%n", accountName, amount);
				  account.deposit(amount);
			  });
		
		// 印出所有人的帳戶資訊
		System.out.println(Arrays.toString(accounts));
	}

}
