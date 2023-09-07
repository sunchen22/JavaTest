package orm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeptDAOImpl implements DeptDAO {
	// 為求管理方便,會將SQL指令當放在最上
	public static final String INSERT_STMT = "INSERT INTO department values(?,?,?)";
	public static final String FIND_BY_DEPTNO = "SELECT * FROM department WHERE deptno = ?";
	public static final String GET_ALL = "SELECT * FROM department order by deptno";

	// 1.載入驅動
	// 每個方法都要載入驅動
	// 當此類別載入JVM時,驅動也就跟著載入到執行環境裡（一次性）
	static {
		try {
			Class.forName(Util.DRIVER);
		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		}
	}

	@Override
	public void save(Dept dept) {
		// 2.建立連線
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection(Util.URL, Util.USER, Util.PASSWORD);
			pstmt = con.prepareStatement(INSERT_STMT);
			pstmt.setInt(1, dept.getDeptno()); // 新增資料就在傳入的物件內
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());

			pstmt.executeUpdate();

		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			Util.closeResourses(con, pstmt, null);
		}

	}

	@Override
	public void update(Dept dept) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer deptno) {
		// TODO Auto-generated method stub

	}

	@Override
	public Dept findByDeptno(Integer deptno) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Dept dept = null;

		try {
			con = DriverManager.getConnection(Util.URL, Util.USER, Util.PASSWORD);
			pstmt = con.prepareStatement(FIND_BY_DEPTNO);

			pstmt.setInt(1, deptno); // 要查詢的資料就在傳入的物件內

			rs = pstmt.executeQuery();
			while (rs.next()) { // 查詢利用游標
				// 因回傳的資料不只一個(dname、loc),故要再進行包裝
				// 用Dept Bean包裝查詢出來的部門資料做回傳
				dept = new Dept();
				dept.setDeptno(deptno); // 用Dept Bean包裝
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));
			}

		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			Util.closeResourses(con, pstmt, rs);
		}

		return dept;
	}

	// 查詢多筆資料
	@Override
	public List<Dept> getAll() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Dept> deptList = new ArrayList<Dept>(); // 用來裝查詢出來的每一筆資料

		try {

			con = DriverManager.getConnection(Util.URL, Util.USER, Util.PASSWORD);
			pstmt = con.prepareStatement(GET_ALL);
			rs = pstmt.executeQuery();

			while (rs.next()) { // 查詢利用游標
				// 因回傳的資料不只一個(dname、loc),故要再進行包裝
				// 用Dept Bean包裝查詢出來的部門資料做回傳
				Dept dept = new Dept();
				dept.setDeptno(rs.getInt("deptno")); // 用Dept Bean包裝
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));
				// 用集合收集著包裝好的查詢結果(部門物件)
				deptList.add(dept); // 把各個部門物件放入集合內
			}

		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			Util.closeResourses(con, pstmt, rs);
		}
		return deptList;
	}

}
