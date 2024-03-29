package day22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

public class ScoreDao {
	private final static String URL = "jdbc:mysql://localhost:3306/demo?serverTimezone=Asia/Taipei";
	private final static String DB_USERNAME = "root";
	private final static String DB_PASSWORD = "12345678";
	
	// 4. 登入程序
	public Boolean login() {
		Scanner scanner = new Scanner(System.in);
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
	
	// 5. 批次匯入(result.csv)
	public Boolean batchUpdate(Set<Score> scores) {
		boolean isTableCreateOK = createScoreTable();
		if(!isTableCreateOK) {
			return false;
		}
		
		String sql = "insert into score(name, chinese, english, math, sum, avg) values (?, ?, ?, ?, ?, ?)";
		try(Connection conn = DriverManager.getConnection(URL, DB_USERNAME, DB_PASSWORD);
			PreparedStatement pstmt = conn.prepareStatement(sql)) {
			// 批次新增
			pstmt.clearBatch(); // 先將 batch 記憶體資料清空, 重要 !!
			
			for(Score score : scores) {
				pstmt.setString(1, score.getStudentName());
				pstmt.setInt(2, score.getChinese());
				pstmt.setInt(3, score.getEnglish());
				pstmt.setInt(4, score.getMath());
				pstmt.setInt(5, score.getSum());
				pstmt.setDouble(6, score.getAvg());
				// 加入到 batch
				pstmt.addBatch();
			}
			
			int[] rowcounts = pstmt.executeBatch();
			
			int total = Arrays.stream(rowcounts).sum();
			System.out.println("總匯入筆數: " + total);
			
		} catch (SQLException e) {
			System.out.println("資料庫錯誤: " + e);
			return false;
		}
		return true;
	}
	
	// 建立 score 資料表
	private Boolean createScoreTable() {
		String sql = "create table if not exists score ( "
				+ "	id int not null auto_increment, "
				+ " name varchar(255) not null unique, "
				+ " chinese int not null default 0, "
				+ " english int not null default 0, "
				+ " math int not null default 0, "
				+ " sum int not null default 0, "
				+ " avg double not null default 0.0, "
				+ " primary key(id) "
				+ ");";
		try(Connection conn = DriverManager.getConnection(URL, DB_USERNAME, DB_PASSWORD);
			Statement stmt = conn.createStatement()) {
			
			stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			System.out.println("資料庫錯誤: " + e);
			return false;
		}
		return true;
	}
	
}
