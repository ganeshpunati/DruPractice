package springboot.crudjdbcnamedparameters.entity;

public class EmployeeDesignationBean {
    private Long designationId;
    private String designationNm;
    
	public Long getDesignationId() {
		return designationId;
	}
	public void setDesignationId(Long designationId) {
		this.designationId = designationId;
	}
	public String getDesignationNm() {
		return designationNm;
	}
	public void setDesignationNm(String designationNm) {
		this.designationNm = designationNm;
	}
	
}
