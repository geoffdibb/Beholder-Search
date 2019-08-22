package com.bae.entities;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bae.entity.Citizen;

public class CitizenTests {
	Citizen account = new Citizen("citizenid", "forename", "surname", "1", "homeaddress", "carplates");

	@Test
	public void testGetterCitizenId() {

		assertEquals("citizenid", account.getCitizenId());
	}

	@Test
	public void testSetterCitizenId() {
		account.setCitizenId("citizenid2");
		assertEquals("citizenid2", account.getCitizenId());

	}

	@Test
	public void testGetterForeNames() {

		assertEquals("forename", account.getForenames());
	}

	@Test
	public void testSetterForeNames() {
		account.setForenames("forename2");
		assertEquals("forename2", account.getForenames());

	}

	@Test
	public void testGetterSurname() {

		assertEquals("surname", account.getSurname());
	}

	@Test
	public void testSetterSurname() {
		account.setSurname("surname2");
		assertEquals("surname2", account.getSurname());

	}

	@Test
	public void testGetterDateOfBirth() {

		assertEquals(1, account.getDateOfBirth());
	}

	@Test
	public void testSetterDateOfBirth() {
		account.setDateOfBirth("2");
		assertEquals("2", account.getDateOfBirth());

	}

	@Test
	public void testGetterHomeAddress() {

		assertEquals("homeaddress", account.getHomeAddress());
	}

	@Test
	public void testSetterHomeAddress() {
		account.setHomeAddress("homeaddress2");
		assertEquals("homeaddress2", account.getHomeAddress());

	}

	@Test
	public void testGetterVehicleRegistrationNumber() {

		assertEquals("carplates", account.getVehicleRegistrationNumber());
	}

	@Test
	public void testSetterVehicleRegistrationNumber() {
		account.setVehicleRegistrationNumber("carplates2");
		assertEquals("carplates2", account.getVehicleRegistrationNumber());

	}
}
