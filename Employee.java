package Model;
public class Employee {
	private int eid;
	private String fName;
	private String lName;
	private long pNo;
	private String email;
	private String pwd;
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", fName=" + fName + ", lName=" + lName + ", pNo=" + pNo + ", email=" + email
				+ ", pwd=" + pwd + "]";
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public long getpNo() {
		return pNo;
	}
	public void setpNo(long pNo) {
		this.pNo = pNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Employee(int eid, String fName, String lName, long pNo, String email, String pwd) {
		this.eid = eid;
		this.fName = fName;
		this.lName = lName;
		this.pNo = pNo;
		this.email = email;
		this.pwd = pwd;
	}
}
