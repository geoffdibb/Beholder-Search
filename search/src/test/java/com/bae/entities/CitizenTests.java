package com.bae.entities;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bae.entity.Citizen;

import junit.framework.Assert;

public class CitizenTests {
		Citizen account = new Citizen("sample", "sample", "sample", 1, "sample", "sample");

		
		@Test
		public void testGetterCitizenId() {

			assertEquals(account.getCitizenId(), "sample");
		}

		@Test
		public void testSetterCitizenId() {
			account.setCitizenId("sample2");
			assertEquals(account.getCitizenId(), "sample2");
			
		}
		
		@Test
		public void testGetterForeNames() {

			assertEquals(account.getForenames(), "sample");
		}

		@Test
		public void testSetterForeNames() {
			account.setForenames("sample2");
			assertEquals(account.getForenames(), "sample2");
			
		}
		
		@Test
		public void testGetterSurname() {

			assertEquals(account.getSurname(), "sample");
		}

		@Test
		public void testSetterSurname() {
			account.setSurname("sample2");
			assertEquals(account.getSurname(), "sample2");
			
		}
		
		@Test
		public void testGetterDateOfBirth() {

			assertEquals(account.getDateOfBirth(), 1);
		}

		@Test
		public void testSetterDateOfBirth() {
			account.setDateOfBirth(2);
			assertEquals(account.getDateOfBirth(), 2);
			
		}
		
		@Test
		public void testGetterHomeAddress() {

			assertEquals(account.getHomeAddress(), "sample");
		}

		@Test
		public void testSetterHomeAddress() {
			account.setHomeAddress("sample2");
			assertEquals(account.getHomeAddress(), "sample2");
			
		}
		
		@Test
		public void testGetterVehicleRegistrationNumber() {

			assertEquals(account.getVehicleRegistrationNumber(), "sample");
		}

		@Test
		public void testSetterVehicleRegistrationNumber() {
			account.setVehicleRegistrationNumber("sample2");
			assertEquals(account.getVehicleRegistrationNumber(), "sample2");
			
		}
}
