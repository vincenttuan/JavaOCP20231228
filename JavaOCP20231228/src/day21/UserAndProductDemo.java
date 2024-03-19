package day21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserAndProductDemo {

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
		} catch (Exception e) {
			
		}
		// 2. 登入成功取得商品資訊
		//    
		
	}
	
	public static boolean login(Scanner scanner) {
		System.out.print("請輸入 username: ");
		String username = scanner.next();
		System.out.print("請輸入 password: ");
		String password = scanner.next();
		
		// 到 user 資料表驗證
		String url = "jdbc:mysql://localhost:3306/demo?serverTimeZone=ASIA/TAIPEI";
		String dbUsername = "root";
		String dbPassword = "12345678";
		String sql = "select id, username, password from user where username = ?";
		try(Connection conn = DriverManager.getConnection(url, dbUsername, dbPassword);
			PreparedStatement pstmt = conn.prepareStatement(sql);) {
			pstmt.setString(1, username); // 1: 表示 sql 第一個問號的內容
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) { // 若有找到資料
				// 取出 password
				String userPassword = rs.getString("password");
				// 比對 password
				if(userPassword.equals(password)) {
					return true;
				}
			}
			return false;
		} catch (SQLException e) {
			System.out.println("資料庫錯誤: " + e);
		}
		return false;
	}

}
