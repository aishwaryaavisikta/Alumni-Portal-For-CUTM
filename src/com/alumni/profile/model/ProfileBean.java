package com.alumni.profile.model;

public class ProfileBean 
{
	private int userid;
	private int profileid;
	private String firstname;
	private String lastname;
	private String school;
	private String college;
	private String university;
	//private String uploadphoto;
	private int batch;
	private String branch;
	private String phonenumber;
	private String address;
	private String companyname;
	private String companylocation;
	private String position;
	private String about;
	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getProfileid() {
		return profileid;
	}
	public void setProfileid(int profileid) {
		this.profileid = profileid;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	/*public String getUploadphoto() {
		return uploadphoto;
	}
	public void setUploadphoto(String uploadphoto) {
		this.uploadphoto = uploadphoto;
	}*/
	public int getBatch() {
		return batch;
	}
	public void setBatch(int batch) {
		this.batch = batch;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phn) {
		this.phonenumber = phn;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getCompanylocation() {
		return companylocation;
	}
	public void setCompanylocation(String companylocation) {
		this.companylocation = companylocation;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	
}
