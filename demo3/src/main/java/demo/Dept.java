package demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Dept {

	@Id
	private int deptno;
	private String dname;
	private String loc;

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptNo) {
		this.deptno = deptNo;
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

	@Override
	public String toString() {
		return "Dept [deptNo=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}

}
