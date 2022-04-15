package springboot.crudjdbctemplate1.entity;

import org.springframework.stereotype.Component;

@Component
public class Student {
 private String firstNm;
 private String lastNm;
  private String emailId;
  private Long mobileNo;
  private Integer age;
  private Integer salary;
  private String descriptionNm;
  private String countryNm;
 private String stateNm;
 private String cityNm;
 private Integer pincode;
 private String address;
public String getFirstNm() {
	return firstNm;
}
public void setFirstNm(String firstNm) {
	this.firstNm = firstNm;
}
public String getLastNm() {
	return lastNm;
}
public void setLastNm(String lastNm) {
	this.lastNm = lastNm;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public Long getMobileNo() {
	return mobileNo;
}
public void setMobileNo(Long mobileNo) {
	this.mobileNo = mobileNo;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public Integer getSalary() {
	return salary;
}
public void setSalary(Integer salary) {
	this.salary = salary;
}
public String getDescriptionNm() {
	return descriptionNm;
}
public void setDescriptionNm(String descriptionNm) {
	this.descriptionNm = descriptionNm;
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
public Student(String firstNm, String lastNm, String emailId, Long mobileNo, Integer age, Integer salary,
		String descriptionNm, String countryNm, String stateNm, String cityNm, Integer pincode, String address) {
	super();
	this.firstNm = firstNm;
	this.lastNm = lastNm;
	this.emailId = emailId;
	this.mobileNo = mobileNo;
	this.age = age;
	this.salary = salary;
	this.descriptionNm = descriptionNm;
	this.countryNm = countryNm;
	this.stateNm = stateNm;
	this.cityNm = cityNm;
	this.pincode = pincode;
	this.address = address;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
 

 
}
