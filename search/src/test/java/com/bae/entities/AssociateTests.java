package com.bae.entities;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bae.entity.Associate;
import com.bae.util.TestConstants;

public class AssociateTests {
	
	@Test
	public void testGetName() {

		assertEquals("name", TestConstants.MOCK_ASSOCIATE_OBJECT.getName());
	}

	@Test
	public void testSetName() {
		TestConstants.MOCK_ASSOCIATE_OBJECT2.setName("name2");
		assertEquals("name2", TestConstants.MOCK_ASSOCIATE_OBJECT2.getName());

	}

	@Test
	public void testGetSurname() {
		assertEquals("surname", TestConstants.MOCK_ASSOCIATE_OBJECT.getSurname());
	}

	@Test
	public void testSetSurname() {
		TestConstants.MOCK_ASSOCIATE_OBJECT2.setSurname("surname2");
		assertEquals("surname2", TestConstants.MOCK_ASSOCIATE_OBJECT2.getSurname());
	}

	@Test
	public void testGetNoOfPhoneCalls() {
		assertEquals("phonecalls", TestConstants.MOCK_ASSOCIATE_OBJECT.getNumberOfPhoneCalls());
	}

	@Test
	public void testSetNoOfPhoneCalls() {
		TestConstants.MOCK_ASSOCIATE_OBJECT2.setNumberOfPhoneCalls("2");
		assertEquals("2", TestConstants.MOCK_ASSOCIATE_OBJECT2.getNumberOfPhoneCalls());
	}

	@Test
	public void testGetLatestPhoneCall() {

		assertEquals("latestPhoneCall", TestConstants.MOCK_ASSOCIATE_OBJECT.getLatestPhoneCall());
	}

	@Test
	public void testSetLatestPhoneCall() {
		TestConstants.MOCK_ASSOCIATE_OBJECT2.setLatestPhoneCall("latestPhoneCall2");
		assertEquals("latestPhoneCall2", TestConstants.MOCK_ASSOCIATE_OBJECT2.getLatestPhoneCall());
	}

	@Test
	public void testGetCitizenId() {

		assertEquals("id", TestConstants.MOCK_ASSOCIATE_OBJECT.getCitizenId());
	}

	@Test
	public void testSetCitizenId() {
		TestConstants.MOCK_ASSOCIATE_OBJECT2.setCitizenId("citizenId2");
		assertEquals("citizenId2", TestConstants.MOCK_ASSOCIATE_OBJECT2.getCitizenId());
	}

	@Test
	public void testGetAssociateId() {

		assertEquals("associateId", TestConstants.MOCK_ASSOCIATE_OBJECT.getAssociateId());
	}

	@Test
	public void testSetAssociateId() {
		TestConstants.MOCK_ASSOCIATE_OBJECT2.setAssociateId("associateId2");
		assertEquals("associateId2", TestConstants.MOCK_ASSOCIATE_OBJECT2.getAssociateId());
	}
}
