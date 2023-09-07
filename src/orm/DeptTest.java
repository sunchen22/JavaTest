package orm;

import java.util.List;
import java.util.Scanner;

public class DeptTest {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("要新增(查詢)的編號");
//		int deptno = sc.nextInt();
//		System.out.println("要新增的名稱");
//		String dname = sc.next();
//		System.out.println("要新增的所在地");
//		String loc = sc.next();

//		sc.close();

//		// 新增資料
//		// 用Dept Bean包裝要新增的資料
//		Dept dept = new Dept(deptno, dname, loc);
//		//透過DAO物件呼叫方法完成新增部門資料
//		DeptDAO dao =new DeptDAOImpl();
//		//呼叫dao的方法
//		dao.save(dept);

//		//單筆查詢
//		// 透過DAO物件呼叫方法來查詢部門資料
//		DeptDAO dao = new DeptDAOImpl();
//		Dept dept = dao.findByDeptno(deptno);// 查詢會有回傳資料，回傳資料存在等號左方
//		//顯示回傳的資料
//		System.out.println(dept); //簡潔程式碼使用toString()

		// 多筆查詢
		DeptDAO dao = new DeptDAOImpl();
		List<Dept> deptList = dao.getAll();
		for (Dept dept : deptList) {
			System.out.println(dept);
		}
	}

}
