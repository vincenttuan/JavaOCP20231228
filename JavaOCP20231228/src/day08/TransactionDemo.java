package day08;

public class TransactionDemo {
	public static void main(String[] args) {
		
		Transaction tx = new Transaction();
		tx.commit(500);
		tx.commit(500, "1111-2222-3333-4444");
		tx.commit();
		
	}
}
