package manage.abstraction;

import java.util.Date;

public class Work {
	private String position;
	private Date dateOfBeginning;
	private Date dateOfEnd;
	private Address addressOfWork;
	private String companyName;
	private String bossName;
	private int salaryPerMonth;
	
	public Work(String p, Date beg, Date end, Address a, String c, String b, int salary) {
		this.position = p;
		this.dateOfBeginning = beg;
		this.dateOfEnd = end;
		this.addressOfWork = a;
		this.companyName = c;
		this.bossName = b;
		this.salaryPerMonth = salary;
	}
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Date getDateOfBeginning() {
		return dateOfBeginning;
	}
	public void setDateOfBeginning(Date dateOfBeginning) {
		this.dateOfBeginning = dateOfBeginning;
	}
	public Date getDateOfEnd() {
		return dateOfEnd;
	}
	public void setDateOfEnd(Date dateOfEnd) {
		this.dateOfEnd = dateOfEnd;
	}
	public Address getAddressOfWork() {
		return addressOfWork;
	}
	public void setAddressOfWork(Address addressOfWork) {
		this.addressOfWork = addressOfWork;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getBossName() {
		return bossName;
	}
	public void setBossName(String bossName) {
		this.bossName = bossName;
	}
	public int getSalaryPerMonth() {
		return salaryPerMonth;
	}
	public void setSalaryPerMonth(int salaryPerMonth) {
		this.salaryPerMonth = salaryPerMonth;
	}
}
