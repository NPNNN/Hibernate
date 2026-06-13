package in.ineorn.ai;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;

@Entity
//@Table(name="STDTAB")
@DynamicInsert(value = true)
public class Student {
	
	@Id
	//@Column(name="stdId")
	private Integer sid;
	
	//@Column(name="stdName")
	private String sname;
	
	//@Column(name="stdAddr")
	private String saddress;
	
	//@Column(name="stdAge")
	private Integer sage;
	
	public Student() {
		System.out.println("Hybernate internally usages Zero Param Constructor");
		
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getEaddress() {
		return saddress;
	}
	public void setEaddress(String eaddress) {
		this.saddress = eaddress;
	}
	public Integer getEage() {
		return sage;
	}
	public void setEage(Integer eage) {
		this.sage = eage;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + ", sage=" + sage + "]";
	}
	
	

}
