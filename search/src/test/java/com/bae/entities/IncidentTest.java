package com.bae.entities;

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
		account.setCitizenId("sample2");
		Assert.assertEquals(account.getCitizenId(), "sample2");
		
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
		Assert.assertEquals(account.getLongitude(), "sample2");
		
	}
	@Test
	public void testGetterLatitude() {

		Assert.assertEquals(account.getLatitude(), "sample");
	}

	@Test
	public void testSetterLatitude() {
		account.setLatitude("sample2");
		Assert.assertEquals(account.getLatitude(), "sample2");
		
	}
	
	@Test
	public void testGetterType() {

		Assert.assertEquals(account.getType(), "sample");
	}

	@Test
	public void testSetterType() {
		account.setType("sample2");
		Assert.assertEquals(account.getType(), "sample2");
		
	}
	
	@Test
	public void testGetterDetail() {

		Assert.assertEquals(account.getDetail(), "sample");
	}

	@Test
	public void testSetterDetail() {
		account.setDetail("sample2");
		Assert.assertEquals(account.getDetail(), "sample2");
		
	}
}
