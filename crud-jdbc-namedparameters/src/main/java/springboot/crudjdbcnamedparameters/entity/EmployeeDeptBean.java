package springboot.crudjdbcnamedparameters.entity;

public class EmployeeDeptBean {
	private Long deptId;
	private String deptNm;
	private Long empId;
	private Long empDeptId;;
	private Boolean isactive;

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public Long getEmpDeptId() {
		return empDeptId;
	}

	public void setEmpDeptId(Long empDeptId) {
		this.empDeptId = empDeptId;
	}

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public String getDeptNm() {
		return deptNm;
	}

	public void setDeptNm(String deptNm) {
		this.deptNm = deptNm;
	}

	public Boolean getIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

}
