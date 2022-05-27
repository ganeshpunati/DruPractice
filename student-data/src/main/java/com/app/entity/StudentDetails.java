package com.app.entity;

public class StudentDetails {

	private Long studentId;
	private String studentNm;
	private String emailId;
	private String mobileNo;
	private String studentCityNm;
	private String studentStateNm;
	private String address;
	private Long collegeId;
	
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getStudentNm() {
		return studentNm;
	}
	public void setStudentNm(String studentNm) {
		this.studentNm = studentNm;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getStudentCityNm() {
		return studentCityNm;
	}
	public void setStudentCityNm(String studentCityNm) {
		this.studentCityNm = studentCityNm;
	}
	public String getStudentStateNm() {
		return studentStateNm;
	}
	public void setStudentStateNm(String studentStateNm) {
		this.studentStateNm = studentStateNm;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(Long collegeId) {
		this.collegeId = collegeId;
	}
}
