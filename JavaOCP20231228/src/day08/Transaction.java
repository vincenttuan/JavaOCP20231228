package day08;

// 交易
public class Transaction {
	
	public void commit(int amount) {
		System.out.printf("現金交易: $%,d%n", amount);
	}
	
	void commit(int amount, String cardNo) {
		System.out.printf("信用卡交易: $%,d 卡號: %s%n", amount, cardNo);
		commit();
	}
	
	public void commit() {
		System.out.println("免費交易");
	}
	
	
	
}
