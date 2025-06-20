package day23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ReadUsers3 {
	
	//此版本抓區資料庫資料會有SQL注入式攻擊 (SQL injection)
	public static void main(String[] args) {
		//只要查詢女性(F)的使用者名字
		//Class.forName("com.mysql.cj.jdbc.Driver");  省略
		//SQL注入式攻擊 (SQL injection)
		//https://www.tsg.com.tw/blog-detail10-215-0-sql-2.htm
		//
		//String genderValue="F";//"M"
		String genderValue="a' or '1'='1";//SQL攻擊指令
		String sqlstr="select username,gender from users where gender='"+genderValue+"'";
		System.out.println(sqlstr);
		
		System.out.println("---------------------------------");
		String url = "jdbc:mysql://localhost:3306/mydb";
		String user = "root";
		String password = "12345678";
		
		try(Connection conn = DriverManager.getConnection(url, user, password);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sqlstr);) {
			
			System.out.println("連線已開啟:" + !conn.isClosed());
			while (rs.next()) { // 逐筆運作
				String username   = rs.getString("username");
				String gender     = rs.getString("gender");
				
				System.out.printf("%5s%2s%n",  username, gender);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	
	
}
