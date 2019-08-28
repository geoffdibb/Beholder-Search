package com.bae.entity;

import java.util.Set;

public class CitizenAssociates {
	private String citizenId;
	private String forenames;
	private String surname;
	private String dateOfBirth;
	private String homeAddress;
	private String car_reg;
	private String age;
	private String sex;
	private String phoneNumber;
	private Set<Associate> associateList;

	public CitizenAssociates(String citizenId, String forenames, String surname, String dateOfBirth, String homeAddress,
			String carReg, String age, String sex, String phoneNumber, Set<Associate> associateList) {
		super();
		this.citizenId = citizenId;
		this.forenames = forenames;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
		this.homeAddress = homeAddress;
		this.car_reg = carReg;
		this.age = age;
		this.sex = sex;
		this.phoneNumber = phoneNumber;
		this.associateList = associateList;
	}

	public CitizenAssociates() {
	}

	public Set<Associate> getAssociateList() {
		return associateList;
	}

	public void setAssociateList(Set<Associate> associateList) {
		this.associateList = associateList;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCarReg() {
		return car_reg;
	}

	public void setCarReg(String carReg) {
		this.car_reg = carReg;
	}

	public String getForenames() {
		return forenames;
	}

	public void setForenames(String forenames) {
		this.forenames = forenames;
	}

	public String getCitizenId() {
		return citizenId;
	}

	public void setCitizenId(String citizenId) {
		this.citizenId = citizenId;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

}
