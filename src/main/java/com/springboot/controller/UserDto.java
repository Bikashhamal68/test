package com.springboot.controller;

public class UserDto {
	private int id;
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
private String uname;
private String email;
private String num;
private String address;
private String pwd;
private String image;
private String gender;
public String getUname() {
	return uname;
}
public UserDto() {
	
};
public UserDto(String uname, String email, String num, String address, String pwd, String image, String gender) {
	super();
	this.uname = uname;
	this.email = email;
	this.num = num;
	this.address = address;
	this.pwd = pwd;
	this.image = image;
	this.gender = gender;
}

public void setUname(String uname) {
	this.uname = uname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getNum() {
	return num;
}
public void setNum(String num) {
	this.num = num;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}




}
