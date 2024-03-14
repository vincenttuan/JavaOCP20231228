package day20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectProductDemo1 {

	public static void main(String[] args) {
		// 如何將 mysql 伺服器中 demo 資料庫中的 product 資料表內容抓出
		String dburl = "jdbc:mysql://localhost:3306/demo?serverTimezone=Asia/Taipei";
		String username = "root";
		String password = "12345678";
		// 1.載入驅動程式
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("驅動程式載入成功");
		} catch (ClassNotFoundException e) {
			System.out.println("驅動程式載入失敗:" + e.getMessage());
			return; // 停止此方法
		}
		// 2.建立資料庫連線(Connection, Statement, ResultSet)
		try {
			Connection conn = DriverManager.getConnection(dburl, username, password);
			System.out.println("連線成功");
			Statement stmt = conn.createStatement(); // 建立 sql 敘述物件
			String sql = "select id, name, cost, price, qty from product"; // 建立 sql 語句
			ResultSet rs = stmt.executeQuery(sql); // 執行 sql 語句, 並得到一個結果資料集合
			// 3. 分析 Result Set
			
			ResultSetMetaData md = rs.getMetaData();
			System.out.println(md.getColumnName(1)); // 記得從 1 開始
			System.out.println(md.getColumnName(2));
			System.out.println(md.getColumnName(3));
			System.out.println(md.getColumnName(4));
			System.out.println(md.getColumnName(5));
			
			System.out.println("+----+-------+----+-----+-----+");
			System.out.printf("| %s |  %s |%s|%s| %s |%n", 
					md.getColumnName(1), md.getColumnName(2), md.getColumnName(3), md.getColumnName(4), md.getColumnName(5));
			System.out.println("+----+-------+----+-----+-----+");
			while(rs.next()) {
				Integer id = rs.getInt("id");
				String name = rs.getString("name");
				Integer cost = rs.getInt("cost");
				Integer price = rs.getInt("price");
				Integer qty = rs.getInt("qty");
				System.out.printf("| %02d | %s | %2d | %3d | %3d |%n", id, name, cost, price, qty);
			}
			System.out.println("+----+-------+----+-----+-----+");
			// 4. 關閉資源不須有順序性
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (SQLException e) {
			System.out.println("連線失敗:" + e.getMessage());
			return; // 停止此方法
		}
		
		
		
	}

}
