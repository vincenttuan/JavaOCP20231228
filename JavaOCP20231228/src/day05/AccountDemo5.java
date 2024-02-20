package day05;

import java.util.Arrays;

public class AccountDemo5 {
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
		/*
		Account maryAccount = accounts[1]; // Mary
		Account roseAccount = accounts[3]; // Rose
		*/
		Account maryAccount = null;
		Account roseAccount = null;
		
		// 利用 for-loop 找到 Mary
		for(int i=0, lens=accounts.length;i<lens;i++) {
			if(accounts[i].getName().equals("Mary")) {
				maryAccount = accounts[i];
				break;
			}
		}
		
		// 利用 for-loop 找到 Rose
		for(int i=0, lens=accounts.length;i<lens;i++) {
			if(accounts[i].getName().equals("Rose")) {
				roseAccount = accounts[i];
				break;
			}
		}
		
		
		maryAccount.transfer(roseAccount, 3000);
		System.out.println(Arrays.toString(accounts));
		
	}
}
