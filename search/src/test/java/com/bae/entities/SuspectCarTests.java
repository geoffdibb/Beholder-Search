package com.bae.entities;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bae.entity.SuspectCar;

import junit.framework.Assert;

public class SuspectCarTests {
		SuspectCar account = new SuspectCar("sample", "sample", "sample", "sample", "sample", "sample", "sample", "sample");

		@Test
		public void testGetterCitizenId() {

			assertEquals(account.getCitizenID(), "sample");
		}

		@Test
		public void testSetterCitizenId() {
			account.setCitizenID("sample2");
			assertEquals(account.getCitizenID(), "sample2");
		}
		
		@Test
		public void testGetterOwner() {

			assertEquals(account.getOwner(), "sample");
		}

		@Test
		public void testSetterOwner() {
			account.setOwner("sample2");
			assertEquals(account.getOwner(), "sample2");
		}
		
		@Test
		public void testGetterCarReg() {

			assertEquals(account.getCarReg(), "sample");
		}

		@Test
		public void testSetterCarReg() {
			account.setCarReg("sample2");
			assertEquals(account.getCarReg(), "sample2");
		}
		
		@Test
		public void testGetterMake() {

			assertEquals(account.getMake(), "sample");
		}

		@Test
		public void testSetterMake() {
			account.setMake("sample2");
			assertEquals(account.getMake(), "sample2");
		}
		
		@Test
		public void testGetterModel() {

			assertEquals(account.getModel(), "sample");
		}

		@Test
		public void testSetterModel() {
			account.setModel("sample2");
			assertEquals(account.getModel(), "sample2");
		}
		
		@Test
		public void testGetterColour() {

			assertEquals(account.getColour(), "sample");
		}

		@Test
		public void testSetterColourl() {
			account.setColour("sample2");
			assertEquals(account.getColour(), "sample2");
		}
		
		@Test
		public void testGetteryears_owned() {

			assertEquals(account.getYearsOwned(), "sample");
		}

		@Test
		public void testSetteryears_owned() {
			account.setYearsOwned("sample2");
			assertEquals(account.getYearsOwned(), "sample2");
		}
		
		@Test
		public void testGetternoOfOwners() {

			assertEquals(account.getNoOfOwners(), "sample");
		}

		@Test
		public void testSetternoOfOwners() {
			account.setNoOfOwners("sample2");
			assertEquals(account.getNoOfOwners(), "sample2");
		}

}
