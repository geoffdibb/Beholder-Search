package com.bae.entities;

import org.junit.Test;

import com.bae.entity.Citizen;

import junit.framework.Assert;

public class CitizenTests {
		Citizen account = new Citizen("sample", "sample", "sample", 1, "sample", "sample");

		
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
		public void testGetterForeNames() {

			Assert.assertEquals(account.getForenames(), "sample");
		}

		@Test
		public void testSetterForeNames() {
			account.setForenames("sample2");
			Assert.assertEquals(account.getForenames(), "sample2");
			
		}
		
		@Test
		public void testGetterSurname() {

			Assert.assertEquals(account.getSurname(), "sample");
		}

		@Test
		public void testSetterSurname() {
			account.setSurname("sample2");
			Assert.assertEquals(account.getSurname(), "sample2");
			
		}
		
		@Test
		public void testGetterDateOfBirth() {

			Assert.assertEquals(account.getDateOfBirth(), 1);
		}

		@Test
		public void testSetterDateOfBirth() {
			account.setDateOfBirth(2);
			Assert.assertEquals(account.getDateOfBirth(), 2);
			
		}
		
		@Test
		public void testGetterHomeAddress() {

			Assert.assertEquals(account.getHomeAddress(), "sample");
		}

		@Test
		public void testSetterHomeAddress() {
			account.setHomeAddress("sample2");
			Assert.assertEquals(account.getHomeAddress(), "sample2");
			
		}
		
		@Test
		public void testGetterVehicleRegistrationNumber() {

			Assert.assertEquals(account.getVehicleRegistrationNumber(), "sample");
		}

		@Test
		public void testSetterVehicleRegistrationNumber() {
			account.setVehicleRegistrationNumber("sample2");
			Assert.assertEquals(account.getVehicleRegistrationNumber(), "sample2");
			
		}
}
