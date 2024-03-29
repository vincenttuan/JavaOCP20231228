package day21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserAndProductDemo {
	
	private final static String URL = "jdbc:mysql://localhost:3306/demo?serverTimezone=Asia/Taipei";
	private final static String DB_USERNAME = "root";
	private final static String DB_PASSWORD = "12345678";
	
	
	public static void main(String[] args) {
		// 1. 登入
		try(Scanner scanner = new Scanner(System.in)) {
			while (true) {
				if(login(scanner)) {
					System.out.println("登入成功");
					break; // 登入成功跳出迴圈
				}
				// 登入失敗重新登入
				System.out.println("登入失敗重新登入");
			}
		}
		// 2. 登入成功取得商品資訊
		printProducts();
		
	}
	
	public static void printProducts() {
		String sql = "select id, name, cost, price, qty from product order by id";
		try(Connection conn = DriverManager.getConnection(URL, DB_USERNAME, DB_PASSWORD);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql)) {
			
			while (rs.next()) {
				Integer id = rs.getInt("id");
				String name = rs.getString("name");
				Integer cost = rs.getInt("cost");
				Integer price = rs.getInt("price");
				Integer qty = rs.getInt("qty");
				System.out.printf("%d %s %d %d %d%n", id, name, cost, price, qty);
			}
			
		} catch (SQLException e) {
			System.out.println("資料庫錯誤: " + e);
		}
	}
	
	
	public static boolean login(Scanner scanner) {
		System.out.print("請輸入 username: ");
		String username = scanner.next();
		System.out.print("請輸入 password: ");
		String password = scanner.next();
		
		// 到 user 資料表驗證
		String sql = "select id, username, password from user where username = ?";
		try(Connection conn = DriverManager.getConnection(URL, DB_USERNAME, DB_PASSWORD);
			PreparedStatement pstmt = conn.prepareStatement(sql);) {
			
			pstmt.setString(1, username); // 1: 表示 sql 第一個問號的內容
			
			try(ResultSet rs = pstmt.executeQuery()) {
				if(rs.next()) { // 若有找到資料
					// 取出 password
					String userPassword = rs.getString("password");
					// 比對 password
					if(userPassword.equals(password)) {
						return true;
					}
				}
			}
			
			return false;
		} catch (SQLException e) {
			System.out.println("資料庫錯誤: " + e);
		}
		return false;
	}

}
