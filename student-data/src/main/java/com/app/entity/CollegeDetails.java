package com.app.entity;

public class CollegeDetails {
	private Long collegeId;
	private String collegeNm;
	private String collegeCityNm;
	private String collegeStateNm;
	private Integer pincode;
	private String address;
	
	public Long getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(Long collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeNm() {
		return collegeNm;
	}
	public void setCollegeNm(String collegeNm) {
		this.collegeNm = collegeNm;
	}
	public String getCollegeCityNm() {
		return collegeCityNm;
	}
	public void setCollegeCityNm(String collegeCityNm) {
		this.collegeCityNm = collegeCityNm;
	}
	public String getCollegeStateNm() {
		return collegeStateNm;
	}
	public void setCollegeStateNm(String collegeStateNm) {
		this.collegeStateNm = collegeStateNm;
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
}
