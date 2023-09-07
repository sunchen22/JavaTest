package orm;

import java.util.List;

public interface DeptDAO {
	// 此介面有各種對表格操作的方法
	void save(Dept dept); // 因為Dept類別已經有我們要傳入的參數(部門資料)啦

	void update(Dept dept);

	void delete(Integer deptno); // 提供部門編號去刪除部門

	//	查詢資料也可自訂
	Dept findByDeptno(Integer deptno); // 用PK查詢 最多也只會回傳一筆資料(Dept)

	List<Dept> getAll(); // 取出的資料比數不確定，可用集合來彈性儲存;若配合查詢加上order by指令，就能取得有順序的物件
	
}
