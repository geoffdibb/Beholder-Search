package com.bae.entity;

public class SuspectCar {

	private String citizenID;
	private String owner;
	private String car_reg;
	private String make;
	private String model;
	private String colour;
	private String years_owned;
	private String no_of_owners;

	public SuspectCar(String citizenID, String owner, String carReg, String make, String model, String colour,
			String yearsOwned, String noOfOwners) {
		super();
		this.citizenID = citizenID;
		this.owner = owner;
		this.car_reg = carReg;
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.years_owned = yearsOwned;
		this.no_of_owners = noOfOwners;
	}

	public SuspectCar() {

	}

	public String getCitizenID() {
		return citizenID;
	}

	public void setCitizenID(String citizenID) {
		this.citizenID = citizenID;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
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

	public String getNoOfOwners() {
		return no_of_owners;
	}

	public void setNoOfOwners(String noOfOwners) {
		this.no_of_owners = noOfOwners;
	}

}
