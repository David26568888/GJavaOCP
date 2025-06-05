package day23;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//查詢users 資料表中的資訊
public class ReadUsers {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		// 利用Class.forName(xxxx) 註冊Driver <---JDBC Type 4.0以前要加入
		Class.forName("com.mysql.cj.jdbc.Driver");// Type 4.0以後可加可不佳

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		String url = "jdbc:mysql://localhost:3306/mydb";// localhost 可以打本機位置127.0.0.1
		String user = "root";
		String password = "12345678";

		try {
			// 1.建立連線
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("連線已開啟:" + !conn.isClosed());
			// 2.執行查詢
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select id, username, gender, birthday, interests, self_intro, appearance from users");
			// 3.分析結果
			while (rs.next()) { // 逐筆運作
				int    id         = rs.getInt("id");
				String username   = rs.getString("username");
				String gender     = rs.getString("gender");
				Date   birthday   = rs.getDate("birthday");
				String interests  = rs.getString("interests");
				String selfIntro  = rs.getString("self_intro");
				String appearance = rs.getString("appearance");
				
				System.out.printf("%2d%5s%2s%10s%10s%20s%20s%n", 
						id, username, gender, birthday, interests, selfIntro, appearance);
			}
			// 4.關閉資源
			rs.close();
			stmt.close();
			conn.close();
			System.out.println("連線已關閉:" + conn.isClosed());
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {//最後一定會執行
			// 4.關閉資源
			try {
				if(rs != null) rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(stmt != null) stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(conn != null) conn.close();
				System.out.println("連線已關閉:" + conn.isClosed());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}