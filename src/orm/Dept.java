package orm;

import java.io.Serializable;

// Dept Bean
public class Dept implements Serializable {
	//不要用int等基本型別，盡量用包裝類別表示 →因有些欄位可能是空值,空值只能對應到參考類別
//	資料庫的文字類型varchar對應到java的型別為String
	private Integer deptno;
	private String dname;
	private String loc;
	
//	要串接物件用建構子
	public Dept() {
		super();
	}

	public Dept(Integer deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public Integer getDeptno() {
		return deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public static void main(String[] args) {
		
	}
	
	//工具可產生
	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}

}
