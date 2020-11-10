//Chase Reed
package empPackage;

import java.io.Serializable;
import java.sql.Date;


public class Employee implements Serializable {
	private int employeeId;
	private String name;
	private String city;
	private String department;
	private Date birthDate;
	private String email;
	private long phoneNo;
	private EmployeeDetail employeeDetail;
	
	public Employee() {
		
	}
	
	public Employee(String name, String city, String department, Date birthDate, String email, long phoneNo) {
		this.name = name;
		this.city = city;
		this.department = department;
		this.birthDate = birthDate;
		this.email = email;
		this.phoneNo = phoneNo;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public EmployeeDetail getEmployeeDetail() {
		return employeeDetail;
	}

	public void setEmployeeDetail(EmployeeDetail employeeDetail) {
		this.employeeDetail = employeeDetail;
	}

	
}
