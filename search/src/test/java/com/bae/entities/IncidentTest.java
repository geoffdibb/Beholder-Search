package com.bae.entities;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bae.entity.Incident;

import junit.framework.Assert;

public class IncidentTest {
	Incident account = new Incident("citizenId", "Citizen", "timestamp", "streetname", "longitude", "latitude", "type", "detail");

	@Test
	public void testGetterCitizenId() {

		assertEquals( "citizenId",account.getCitizenId());
	}

	@Test
	public void testSetterCitizenId() {
		account.setCitizenId("citizenId2");
		assertEquals( "citizenId2", account.getCitizenId());
		
	}
	
	@Test
	public void testGetterCitizen() {

		assertEquals("Citizen", account.getCitizen() );
	}

	@Test
	public void testSetterCitizen() {
		account.setCitizen("Citizen2");
		assertEquals( "Citizen2", account.getCitizen());
		
	}
	
	@Test
	public void testGetterTimeStamp() {

		assertEquals("timestamp", account.getTimestamp() );
	}

	@Test
	public void testSetterTimeStamp() {
		account.setTimestamp("timestamp2");
		assertEquals("timestamp2", account.getTimestamp());
		
	}
	
	@Test
	public void testGetterStreetName() {

		assertEquals("streetname",account.getStreetname());
	}

	@Test
	public void testSetterStreetName() {
		account.setStreetname("streetname2");
		assertEquals("streetname2",account.getStreetname());
		
	}
	
	@Test
	public void testGetterLongitude() {

		assertEquals( "longitude",account.getLongitude());
	}

	@Test
	public void testSetterLongitude() {
		account.setLongitude("longitude2");
		assertEquals("longitude2", account.getLongitude());
		
	}
	@Test
	public void testGetterLatitude() {

		assertEquals( "latitude",account.getLatitude());
	}

	@Test
	public void testSetterLatitude() {
		account.setLatitude("latitude2");
		assertEquals( "latitude2", account.getLatitude());
		
	}
	
	@Test
	public void testGetterType() {

		assertEquals( "type",account.getType());
	}

	@Test
	public void testSetterType() {
		account.setType("type2");
		assertEquals("type2",account.getType() );
		
	}
	
	@Test
	public void testGetterDetail() {

		assertEquals("detail",account.getDetail() );
	}

	@Test
	public void testSetterDetail() {
		account.setDetail("detail2");
		assertEquals( "detail2",account.getDetail());
		
	}
}
