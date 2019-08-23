package com.bae.entities;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bae.entity.SuspectCar;
import com.bae.util.TestConstants;

public class SuspectCarTests {

	@Test
	public void testGetCitizenId() {
		assertEquals("id", TestConstants.MOCK_CAR_OBJECT.getCitizenID());
	}

	@Test
	public void testSetCitizenId() {
		TestConstants.MOCK_CAR_OBJECT2.setCitizenID("citizenid2");
		assertEquals("citizenid2", TestConstants.MOCK_CAR_OBJECT2.getCitizenID());
	}

	@Test
	public void testGetCarReg() {
		assertEquals("carReg", TestConstants.MOCK_CAR_OBJECT.getCarReg());
	}

	@Test
	public void testSetCarReg() {
		TestConstants.MOCK_CAR_OBJECT2.setCarReg("carreg2");
		assertEquals("carreg2", TestConstants.MOCK_CAR_OBJECT2.getCarReg());
	}

	@Test
	public void testGetMake() {
		assertEquals("make", TestConstants.MOCK_CAR_OBJECT.getMake());
	}

	@Test
	public void testSetMake() {
		TestConstants.MOCK_CAR_OBJECT2.setMake("make2");
		assertEquals("make2", TestConstants.MOCK_CAR_OBJECT2.getMake());
	}

	@Test
	public void testGetModel() {
		assertEquals("model", TestConstants.MOCK_CAR_OBJECT.getModel());
	}

	@Test
	public void testSetModel() {
		TestConstants.MOCK_CAR_OBJECT2.setModel("model2");
		assertEquals("model2", TestConstants.MOCK_CAR_OBJECT2.getModel());
	}

	@Test
	public void testGetColour() {
		assertEquals("colour", TestConstants.MOCK_CAR_OBJECT.getColour());
	}

	@Test
	public void testSetColourl() {
		TestConstants.MOCK_CAR_OBJECT2.setColour("colour2");
		assertEquals("colour2", TestConstants.MOCK_CAR_OBJECT2.getColour());
	}

	@Test
	public void testGetyears_owned() {
		assertEquals("yearsOwned", TestConstants.MOCK_CAR_OBJECT.getYearsOwned());
	}

	@Test
	public void testSetYears_owned() {
		TestConstants.MOCK_CAR_OBJECT2.setYearsOwned("yearsowned2");
		assertEquals("yearsowned2", TestConstants.MOCK_CAR_OBJECT2.getYearsOwned());
	}

	@Test
	public void testGetnoOfOwners() {
		assertEquals("surname", TestConstants.MOCK_CAR_OBJECT.getSurname());
	}

	@Test
	public void testSetnoOfOwners() {
		TestConstants.MOCK_CAR_OBJECT2.setSurname("surname2");
		assertEquals("surname2", TestConstants.MOCK_CAR_OBJECT2.getSurname());
	}
	
	@Test
	public void testGetForename() {
		assertEquals("name", TestConstants.MOCK_CAR_OBJECT.getForenames());
	}
	
	@Test
	public void testSetForenames() {
		TestConstants.MOCK_CAR_OBJECT2.setSurname("surname2");
		assertEquals("surname2", TestConstants.MOCK_CAR_OBJECT2.getSurname());
	}

}
