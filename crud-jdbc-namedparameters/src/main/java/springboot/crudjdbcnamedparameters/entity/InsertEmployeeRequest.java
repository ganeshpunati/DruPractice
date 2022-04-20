package springboot.crudjdbcnamedparameters.entity;

import java.util.List;

public class InsertEmployeeRequest {
	
	private Long empId;
	private String empNm;
	private String empEmail;
	private double empSalary;
	private Integer empAge;
	private Long mobileNo;
	private String countryNm;
	private String stateNm;
	private String cityNm;
	private Integer pincode;
	private String address;
	
	private List<EmployeeDeptBean> departmentList ;
	private List<EmployeeDesignationBean> designationList;
	
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getEmpNm() {
		return empNm;
	}
	public void setEmpNm(String empNm) {
		this.empNm = empNm;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public Integer getEmpAge() {
		return empAge;
	}
	public void setEmpAge(Integer empAge) {
		this.empAge = empAge;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getCountryNm() {
		return countryNm;
	}
	public void setCountryNm(String countryNm) {
		this.countryNm = countryNm;
	}
	public String getStateNm() {
		return stateNm;
	}
	public void setStateNm(String stateNm) {
		this.stateNm = stateNm;
	}
	public String getCityNm() {
		return cityNm;
	}
	public void setCityNm(String cityNm) {
		this.cityNm = cityNm;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<EmployeeDeptBean> getDepartmentList() {
		return departmentList;
	}
	public void setDepartmentList(List<EmployeeDeptBean> departmentList) {
		this.departmentList = departmentList;
	}
	public List<EmployeeDesignationBean> getDesignationList() {
		return designationList;
	}
	public void setDesignationList(List<EmployeeDesignationBean> designationList) {
		this.designationList = designationList;
	}
	
}
