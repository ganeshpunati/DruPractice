package springboot.crudjdbcnamedparameters.entity;

public class EmployeeDesignationBean {
    private Long designationId;
    private String designationNm;
    private Long empId;
    private Long empDesignationId;
    private Boolean isactive;
    
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public Long getEmpDesignationId() {
		return empDesignationId;
	}
	public void setEmpDesignationId(Long empDesignationId) {
		this.empDesignationId = empDesignationId;
	}
	public Long getDesignationId() {
		return designationId;
	}
	public void setDesignationId(Long designationId) {
		this.designationId = designationId;
	}
	
	public Boolean getIsactive() {
		return isactive;
	}
	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}
	public String getDesignationNm() {
		return designationNm;
	}
	public void setDesignationNm(String designationNm) {
		this.designationNm = designationNm;
	}
	
}
