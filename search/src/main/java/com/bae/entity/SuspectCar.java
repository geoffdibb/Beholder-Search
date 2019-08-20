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
		
		
		
		
		public SuspectCar(String citizenID, String owner, String car_reg, String make, String model, String colour,
				String years_owned, String no_of_owners) {
			super();
			this.citizenID = citizenID;
			this.owner = owner;
			this.car_reg = car_reg;
			this.make = make;
			this.model = model;
			this.colour = colour;
			this.years_owned = years_owned;
			this.no_of_owners = no_of_owners;
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




		public String getCar_reg() {
			return car_reg;
		}




		public void setCar_reg(String car_reg) {
			this.car_reg = car_reg;
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




		public String getYears_owned() {
			return years_owned;
		}




		public void setYears_owned(String years_owned) {
			this.years_owned = years_owned;
		}




		public String getNo_of_owners() {
			return no_of_owners;
		}




		public void setNo_of_owners(String no_of_owners) {
			this.no_of_owners = no_of_owners;
		}
		
		
}
