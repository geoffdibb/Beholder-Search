package com.bae.entity;

public class SuspectCar {

	private String citizenId;
	private String forenames;
	private String surname;
	private String car_reg;
	private String make;
	private String model;
	private String colour;
	private String years_owned;

	public SuspectCar(String citizenId, String forenames, String surname, String carReg, String make, String model,
			String colour, String yearsOwned) {
		super();
		this.citizenId = citizenId;
		this.forenames = forenames;
		this.surname = surname;
		this.car_reg = carReg;
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.years_owned = yearsOwned;
	}

	public SuspectCar() {

	}

	public String getCitizenID() {
		return citizenId;
	}

	public void setCitizenID(String citizenId) {
		this.citizenId = citizenId;
	}

	public String getForenames() {
		return forenames;
	}

	public void setForenames(String forenames) {
		this.forenames = forenames;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getCarReg() {
		return car_reg;
	}

	public void setCarReg(String carReg) {
		this.car_reg = carReg;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getYearsOwned() {
		return years_owned;
	}

	public void setYearsOwned(String yearsOwned) {
		this.years_owned = yearsOwned;
	}

}
