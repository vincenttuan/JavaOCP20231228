package day05;

import java.util.Arrays;
import java.util.Optional;

public class AccountDemo8 {
	public static void main(String[] args) {
		Account[] accounts = {
				new Account("John", 10000),
				new Account("Mary", 10000),
				new Account("Jack", 10000),
				new Account("Rose", 10000)
		};
		// 印出所有人的帳戶資訊
		System.out.println(Arrays.toString(accounts));
		
		// Mary 要轉 3000 給 Rose
		// 並印出所有人的帳戶資訊(可以觀察到 Mary 的帳戶資料少 3000 元, Rose 的帳戶資料多 3000 元)
		// 使用 Java 8 Stream
		long begin = System.nanoTime();
		Optional<Account> maryAccountOpt = Arrays.stream(accounts).filter(account -> account.getName().equals("Mary")).findFirst();
		Optional<Account> roseAccountOpt = Arrays.stream(accounts).filter(account -> account.getName().equals("Rose")).findFirst();
		
		if(maryAccountOpt.isPresent() && roseAccountOpt.isPresent()) {
			Account maryAccount = maryAccountOpt.get();
			Account roseAccount = roseAccountOpt.get();
			maryAccount.transfer(roseAccount, 3000);
			System.out.println(Arrays.toString(accounts));
		} else {
			System.out.println("轉帳失敗! 無此帳戶資料");
		}
		long end = System.nanoTime();
		System.out.println(end - begin);
	}
}
