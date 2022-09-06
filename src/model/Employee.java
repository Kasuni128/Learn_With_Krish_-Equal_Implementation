package model;

import java.util.Objects;

public class Employee {
	
	String empId;
	String empCode;
	String empName;
	String empNic;
	String empAddress;
	
	public Employee(String empId, String empCode, String empName, String empNic, String empAddress) {
		super();
		this.empId = empId;
		this.empCode = empCode;
		this.empName = empName;
		this.empNic = empNic;
		this.empAddress = empAddress;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpCode() {
		return empCode;
	}

	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpNic() {
		return empNic;
	}

	public void setEmpNic(String empNic) {
		this.empNic = empNic;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}


	@Override
	public boolean equals(Object obj) {
		Employee employee = (Employee) obj;
		
		if (employee.getEmpId()==this.empId || employee.getEmpCode()==this.getEmpCode()) {
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empCode=" + empCode + ", empName=" + empName + ", empNic=" + empNic
				+ ", empAddress=" + empAddress + "]";
	}
	
	
	
	
	
	
	

}
