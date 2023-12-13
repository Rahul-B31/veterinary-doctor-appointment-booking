package com.vetbuddy.dto;

public class Farmer {
	Integer fid;
	String name;
	String email;
	String password;
	String address;
	Integer Postal_code;
	String village;
	String district;
	Long mobile;

	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public Farmer() {

	}
	public Farmer(String name, String email, String password, String address, Integer postal_code,
			String village, String district ,Long mobile) {
		super();

		this.name = name;
		this.email = email;
		this.password = password;
		this.address = address;
		this.Postal_code = postal_code;
		this.village = village;
		this.district = district;
		this.mobile = mobile;
	}


	public Integer getFid() {
		return fid;
	}
	public void setFid(Integer fid) {
		this.fid = fid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getPostal_code() {
		return Postal_code;
	}
	public void setPostal_code(Integer postal_code) {
		Postal_code = postal_code;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}


	@Override
	public String toString() {
		return "Farmer [fid=" + fid + ", name=" + name + ", email=" + email + ", password=" + password + ", address="
				+ address + ", Postal_code=" + Postal_code + ", village=" + village + ", district=" + district + "]";
	}


}
