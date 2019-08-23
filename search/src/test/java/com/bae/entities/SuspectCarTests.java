package com.bae.entities;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bae.entity.SuspectCar;

public class SuspectCarTests {
	SuspectCar account = new SuspectCar("citizenid", "owner", "carreg", "make", "model", "colour", "yearsowned",
			"noofowners");

	@Test
	public void testGetterCitizenId() {

		assertEquals("citizenid", account.getCitizenID());
	}

	@Test
	public void testSetterCitizenId() {
		account.setCitizenID("citizenid2");
		assertEquals("citizenid2", account.getCitizenID());
	}

	@Test
	public void testGetterOwner() {

		assertEquals("owner", account.getForenames());
	}

	@Test
	public void testSetterOwner() {
		account.setForenames("owner2");
		assertEquals("owner2", account.getForenames());
	}

	@Test
	public void testGetterCarReg() {

		assertEquals("carreg", account.getCarReg());
	}

	@Test
	public void testSetterCarReg() {
		account.setCarReg("carreg2");
		assertEquals("carreg2", account.getCarReg());
	}

	@Test
	public void testGetterMake() {

		assertEquals("make", account.getMake());
	}

	@Test
	public void testSetterMake() {
		account.setMake("make2");
		assertEquals("make2", account.getMake());
	}

	@Test
	public void testGetterModel() {

		assertEquals("model", account.getModel());
	}

	@Test
	public void testSetterModel() {
		account.setModel("model2");
		assertEquals("model2", account.getModel());
	}

	@Test
	public void testGetterColour() {

		assertEquals("colour", account.getColour());
	}

	@Test
	public void testSetterColourl() {
		account.setColour("colour2");
		assertEquals("colour2", account.getColour());
	}

	@Test
	public void testGetteryears_owned() {

		assertEquals("yearsowned", account.getYearsOwned());
	}

	@Test
	public void testSetteryears_owned() {
		account.setYearsOwned("yearsowned2");
		assertEquals("yearsowned2", account.getYearsOwned());
	}

	@Test
	public void testGetternoOfOwners() {

		assertEquals("surname", account.getSurname());
	}

	@Test
	public void testSetternoOfOwners() {
		account.setSurname("surname2");
		assertEquals("surname2", account.getSurname());
	}

}
