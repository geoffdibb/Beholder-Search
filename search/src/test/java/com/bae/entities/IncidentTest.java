package com.bae.entities;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bae.entity.Incident;

import junit.framework.Assert;

public class IncidentTest {
	Incident account = new Incident("sample", "sample", "sample", "sample", "sample", "sample", "sample", "sample");

	@Test
	public void testGetterCitizenId() {

		Assert.assertEquals(account.getCitizenId(), "sample");
	}

	@Test
	public void testSetterCitizenId() {
		account.setCitizenId("sample2");
		Assert.assertEquals(account.getCitizenId(), "sample2");
		
	}
	
	@Test
	public void testGetterCitizen() {

		Assert.assertEquals(account.getCitizen(), "sample");
	}

	@Test
	public void testSetterCitizen() {
		account.setCitizen("sample2");
		Assert.assertEquals(account.getCitizen(), "sample2");
		
	}
	
	@Test
	public void testGetterTimeStamp() {

		Assert.assertEquals(account.getTimestamp(), "sample");
	}

	@Test
	public void testSetterTimeStamp() {
		account.setTimestamp("sample2");
		Assert.assertEquals(account.getTimestamp(), "sample2");
		
	}
	
	@Test
	public void testGetterStreetName() {

		Assert.assertEquals(account.getStreetname(), "sample");
	}

	@Test
	public void testSetterStreetName() {
		account.setStreetname("sample2");
		Assert.assertEquals(account.getStreetname(), "sample2");
		
	}
	
	@Test
	public void testGetterLongitude() {

		Assert.assertEquals(account.getLongitude(), "sample");
	}

	@Test
	public void testSetterLongitude() {
		account.setLongitude("sample2");
		assertEquals(account.getLongitude(), "sample2");
		
	}
	@Test
	public void testGetterLatitude() {

		assertEquals(account.getLatitude(), "sample");
	}

	@Test
	public void testSetterLatitude() {
		account.setLatitude("sample2");
		assertEquals(account.getLatitude(), "sample2");
		
	}
	
	@Test
	public void testGetterType() {

		assertEquals(account.getType(), "sample");
	}

	@Test
	public void testSetterType() {
		account.setType("sample2");
		assertEquals(account.getType(), "sample2");
		
	}
	
	@Test
	public void testGetterDetail() {

		assertEquals(account.getDetail(), "sample");
	}

	@Test
	public void testSetterDetail() {
		account.setDetail("sample2");
		assertEquals(account.getDetail(), "sample2");
		
	}
}
