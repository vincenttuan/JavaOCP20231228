package day20;

public class SelectProductDemo1 {

	public static void main(String[] args) {
		// 如何將 mysql 伺服器中 demo 資料庫中的 product 資料表內容抓出
		String dburl = "jdbc:mysql://localhost:3306/demo?serverTimezone=asia/taipei";
		String username = "root";
		String password = "12345678";
		// 載入驅動程式
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("驅動程式載入成功");
		} catch (ClassNotFoundException e) {
			System.out.println("驅動程式載入失敗:" + e.getMessage());
			return; // 停止此方法
		}
		

	}

}
