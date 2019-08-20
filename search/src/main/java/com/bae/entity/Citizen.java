package com.bae.entity;

//@Entity
public class Citizen {
	private String citizenId;
	private String forenames;
	private String surname;
	private int dateOfBirth;
	private String homeAddress;
	private String vehicleRegistrationNumber;
	
	
	
	public Citizen( String citizenId,String forenames, String surname, int dateOfBirth, String homeAddress, String vehicleRegistrationNumber) {
		super();
		this.citizenId = citizenId;
		this.forenames = forenames;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
		this.homeAddress = homeAddress;
		this.vehicleRegistrationNumber = vehicleRegistrationNumber;
		}



	public String getVehicleRegistrationNumber() {
		return vehicleRegistrationNumber;
	}



	public void setVehicleRegistrationNumber(String vehicleRegistrationNumber) {
		this.vehicleRegistrationNumber = vehicleRegistrationNumber;
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



	public int getDateOfBirth() {
		return dateOfBirth;
	}



	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}



	public String getHomeAddress() {
		return homeAddress;
	}



	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	
	
	
}
