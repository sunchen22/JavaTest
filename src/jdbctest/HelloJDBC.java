package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HelloJDBC {
	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/jdbcsample?serverTimezone=Asia/Taipei";
	public static final String USER = "root";
	public static final String PASSWORD = "0909";

	public static void main(String[] args) {
		// Class.forName(DRIVER);需要進行例外處理
		// 與資料庫處理通常都是用try...catch
		Connection con = null; // 為了擺脫try區域拿不到值的窘境
		PreparedStatement pstmt = null;
		Statement stmt = null;
		ResultSet rs = null;

		Scanner sc = new Scanner(System.in);
		System.out.println("要新增的編號");
		int deptno = sc.nextInt();
		System.out.println("要新增的名稱");
		String dname = sc.next();
		System.out.println("要新增的所在地");
		String loc = sc.next();

		sc.close();

		try {
			// STEP 1:載入驅動
			Class.forName(DRIVER);
			System.out.println("載入成功");

			// STEP 2:建立連線
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("連線成功");

			// STEP 3-3:送出動態SQL指令
//			pstmt = con.prepareStatement("INSERT INTO department values(?,?,?)"); // 要新增的資料可先用?表示
//			pstmt.setInt(1, deptno); // 1指的是第一個問號
//			pstmt.setString(2, dname);
//			pstmt.setString(3, loc);
//			
//			pstmt.executeUpdate(); //呼叫.executeUpdate()此方法完成更新設定資料庫

			// STEP 3-1:送出SQL指令(新增一筆資料至department)
			stmt = con.createStatement();
//			int count = stmt.executeUpdate("INSERT INTO department values(50,'人事部','南京復興')");  //sql區域結束指令不需再加分號
//			System.out.println(count + "rows updated.");	

			// STEP 3-2:送出SQL指令(查詢)
			rs = stmt.executeQuery("select * from department order by deptno desc"); 
			// 查詢也可結合order by達到排序目的,例如可用在討論區文章
			while (rs.next()) { // 利用移動游標，取出資料
			// 使用欄位名稱查詢
				deptno = rs.getInt("deptno"); // 括號內放欄位的名字 從括號內取資料存入前面
				dname = rs.getString("dname");
				loc = rs.getString("loc");

//				使用欄位索引值查詢:由1開始;
//				int deptno = rs.getInt(1); // 括號內放欄位的名字 從括號內取資料存入前面
//				String dname = rs.getString(2);
//				String loc = rs.getString(3);
//				
				System.out.println("DEPTNO = " + deptno);
				System.out.println("DNAME = " + dname);
				System.out.println("LOC = " + loc);
//				System.out.println("=================");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
//			con.close();  //不能直接關閉．因為需要處理例外
//			if (rs != null) { // 越晚建立、越早關閉
//				try {
//					rs.close();
//				} catch (SQLException se) {
//					se.printStackTrace();
//				}
//			}

			if (pstmt != null) { // 越晚建立、越早關閉
				try {
					pstmt.close();
				} catch (SQLException se) {
					se.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException se) {
					se.printStackTrace();
				}
			}
		}
	}
}
