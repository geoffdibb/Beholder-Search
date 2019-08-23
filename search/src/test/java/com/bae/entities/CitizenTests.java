package com.bae.entities;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bae.entity.Citizen;
import com.bae.util.TestConstants;

public class CitizenTests {

	@Test
	public void testGetCitizenId() {
		assertEquals("id", TestConstants.MOCK_CITIZEN_OBJECT.getCitizenId());
	}

	@Test
	public void testSetCitizenId() {
		TestConstants.MOCK_CITIZEN_OBJECT2.setCitizenId("id2");
		assertEquals("id2", TestConstants.MOCK_CITIZEN_OBJECT2.getCitizenId());

	}

	@Test
	public void testGetForeNames() {
		assertEquals("name", TestConstants.MOCK_CITIZEN_OBJECT.getForenames());
	}

	@Test
	public void testSetForeNames() {
		TestConstants.MOCK_CITIZEN_OBJECT2.setForenames("name2");
		assertEquals("name2", TestConstants.MOCK_CITIZEN_OBJECT2.getForenames());

	}

	@Test
	public void testGetSurname() {
		assertEquals("surname", TestConstants.MOCK_CITIZEN_OBJECT.getSurname());
	}

	@Test
	public void testSetSurname() {
		TestConstants.MOCK_CITIZEN_OBJECT2.setSurname("surname2");
		assertEquals("surname2", TestConstants.MOCK_CITIZEN_OBJECT2.getSurname());

	}

	@Test
	public void testGetDateOfBirth() {
		assertEquals("0", TestConstants.MOCK_CITIZEN_OBJECT.getDateOfBirth());
	}

	@Test
	public void testSetDateOfBirth() {
		TestConstants.MOCK_CITIZEN_OBJECT2.setDateOfBirth("2");
		assertEquals("2", TestConstants.MOCK_CITIZEN_OBJECT2.getDateOfBirth());

	}

	@Test
	public void testGetHomeAddress() {
		assertEquals("homeAddress", TestConstants.MOCK_CITIZEN_OBJECT.getHomeAddress());
	}

	@Test
	public void testSetHomeAddress() {
		TestConstants.MOCK_CITIZEN_OBJECT2.setHomeAddress("homeAddress2");
		assertEquals("homeAddress2", TestConstants.MOCK_CITIZEN_OBJECT2.getHomeAddress());

	}

	@Test
	public void testGetCarReg() {
		assertEquals("car_reg", TestConstants.MOCK_CITIZEN_OBJECT.getCarReg());
	}

	@Test
	public void testSetCarReg() {
		TestConstants.MOCK_CITIZEN_OBJECT2.setCarReg("car_reg2");
		assertEquals("car_reg2", TestConstants.MOCK_CITIZEN_OBJECT2.getCarReg());

	}

	@Test
	public void testGetAge() {
		assertEquals("age", TestConstants.MOCK_CITIZEN_OBJECT.getAge());
	}

	@Test
	public void testSetAge() {
		TestConstants.MOCK_CITIZEN_OBJECT2.setAge("age2");
		assertEquals("age2", TestConstants.MOCK_CITIZEN_OBJECT2.getAge());

	}

	@Test
	public void testGetPhoneNumber() {
		assertEquals("phoneNumber", TestConstants.MOCK_CITIZEN_OBJECT.getPhoneNumber());
	}

	@Test
	public void testSetPhoneNumber() {
		TestConstants.MOCK_CITIZEN_OBJECT2.setPhoneNumber("phoneNumber2");
		assertEquals("phoneNumber2", TestConstants.MOCK_CITIZEN_OBJECT2.getPhoneNumber());

	}

	@Test
	public void testGetGender() {
		assertEquals("gender", TestConstants.MOCK_CITIZEN_OBJECT.getGender());
	}

	@Test
	public void testSetGender() {
		TestConstants.MOCK_CITIZEN_OBJECT2.setGender("gender2");
		assertEquals("gender2", TestConstants.MOCK_CITIZEN_OBJECT2.getGender());

	}

}
