package com.bae.entities;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bae.entity.Incident;
import com.bae.util.TestConstants;

import junit.framework.Assert;

public class IncidentTest {
	
	@Test
	public void testGetCitizenId() {
		assertEquals( "id",TestConstants.MOCK_INCIDENT_OBJECT.getCitizenId());
	}

	@Test
	public void testSetCitizenId() {
		TestConstants.MOCK_INCIDENT_OBJECT2.setCitizenId("citizenId2");
		assertEquals( "citizenId2", TestConstants.MOCK_INCIDENT_OBJECT2.getCitizenId());	
	}
	
	@Test
	public void testGetCitizen() {
		assertEquals("citizen", TestConstants.MOCK_INCIDENT_OBJECT.getCitizen() );
	}

	@Test
	public void testSetCitizen() {
		TestConstants.MOCK_INCIDENT_OBJECT2.setCitizen("Citizen2");
		assertEquals( "Citizen2", TestConstants.MOCK_INCIDENT_OBJECT2.getCitizen());	
	}
	
	@Test
	public void testGetTimeStamp() {
		assertEquals("timeStamp", TestConstants.MOCK_INCIDENT_OBJECT.getTimestamp() );
	}

	@Test
	public void testSetTimeStamp() {
		TestConstants.MOCK_INCIDENT_OBJECT2.setTimestamp("timestamp2");
		assertEquals("timestamp2", TestConstants.MOCK_INCIDENT_OBJECT2.getTimestamp());
	}
	
	@Test
	public void testGeTStreetName() {
		assertEquals("streetName",TestConstants.MOCK_INCIDENT_OBJECT.getStreetname());
	}

	@Test
	public void testSetStreetName() {
		TestConstants.MOCK_INCIDENT_OBJECT2.setStreetname("streetname2");
		assertEquals("streetname2",TestConstants.MOCK_INCIDENT_OBJECT2.getStreetname());
	}
	
	@Test
	public void testGetLongitude() {
		assertEquals( "longitude",TestConstants.MOCK_INCIDENT_OBJECT.getLongitude());
	}

	@Test
	public void testSetLongitude() {
		TestConstants.MOCK_INCIDENT_OBJECT2.setLongitude("longitude2");
		assertEquals("longitude2", TestConstants.MOCK_INCIDENT_OBJECT2.getLongitude());
	}
	@Test
	public void testGetLatitude() {
		assertEquals( "latitude",TestConstants.MOCK_INCIDENT_OBJECT.getLatitude());
	}

	@Test
	public void testSetLatitude() {
		TestConstants.MOCK_INCIDENT_OBJECT2.setLatitude("latitude2");
		assertEquals( "latitude2", TestConstants.MOCK_INCIDENT_OBJECT2.getLatitude());
	}
	
	@Test
	public void testGetType() {
		assertEquals( "type",TestConstants.MOCK_INCIDENT_OBJECT.getType());
	}

	@Test
	public void testSetType() {
		TestConstants.MOCK_INCIDENT_OBJECT2.setType("type2");
		assertEquals("type2",TestConstants.MOCK_INCIDENT_OBJECT2.getType() );
		
	}
	
	@Test
	public void testGetDetail() {
		assertEquals("detail",TestConstants.MOCK_INCIDENT_OBJECT.getDetail() );
	}

	@Test
	public void testSetDetail() {
		TestConstants.MOCK_INCIDENT_OBJECT2.setDetail("detail2");
		assertEquals( "detail2",TestConstants.MOCK_INCIDENT_OBJECT2.getDetail());
	}
	
}
