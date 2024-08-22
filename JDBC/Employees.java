package JDBC;

public class Employees {

	private int empId;
	private String empName;
	private int sal;
	
	public Employees(int empId, String empName, int sal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
	}

	public Employees() {
		super();

	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employees [empId=" + empId + ", empName=" + empName + ", sal=" + sal + "]";
	}

}
