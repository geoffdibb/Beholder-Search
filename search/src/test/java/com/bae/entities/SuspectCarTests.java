package com.bae.entities;

import org.junit.Test;

import com.bae.entity.SuspectCar;

import junit.framework.Assert;

public class SuspectCarTests {
		SuspectCar account = new SuspectCar("sample", "sample", "sample", "sample", "sample", "sample", "sample", "sample");

		@Test
		public void testGetterCitizenId() {

			Assert.assertEquals(account.getCitizenID(), "sample");
		}

		@Test
		public void testSetterCitizenId() {
			account.setCitizenID("sample2");
			Assert.assertEquals(account.getCitizenID(), "sample2");
		}
		
		@Test
		public void testGetterOwner() {

			Assert.assertEquals(account.getOwner(), "sample");
		}

		@Test
		public void testSetterOwner() {
			account.setOwner("sample2");
			Assert.assertEquals(account.getOwner(), "sample2");
		}
		
		@Test
		public void testGetterCarReg() {

			Assert.assertEquals(account.getCar_reg(), "sample");
		}

		@Test
		public void testSetterCarReg() {
			account.setCar_reg("sample2");
			Assert.assertEquals(account.getCar_reg(), "sample2");
		}
		
		@Test
		public void testGetterMake() {

			Assert.assertEquals(account.getMake(), "sample");
		}

		@Test
		public void testSetterMake() {
			account.setMake("sample2");
			Assert.assertEquals(account.getMake(), "sample2");
		}
		
		@Test
		public void testGetterModel() {

			Assert.assertEquals(account.getModel(), "sample");
		}

		@Test
		public void testSetterModel() {
			account.setModel("sample2");
			Assert.assertEquals(account.getModel(), "sample2");
		}
		
		@Test
		public void testGetterColour() {

			Assert.assertEquals(account.getColour(), "sample");
		}

		@Test
		public void testSetterColourl() {
			account.setColour("sample2");
			Assert.assertEquals(account.getColour(), "sample2");
		}
		
		@Test
		public void testGetteryears_owned() {

			Assert.assertEquals(account.getYears_owned(), "sample");
		}

		@Test
		public void testSetteryears_owned() {
			account.setYears_owned("sample2");
			Assert.assertEquals(account.getYears_owned(), "sample2");
		}
		
		@Test
		public void testGetternoOfOwners() {

			Assert.assertEquals(account.getNo_of_owners(), "sample");
		}

		@Test
		public void testSetternoOfOwners() {
			account.setNo_of_owners("sample2");
			Assert.assertEquals(account.getNo_of_owners(), "sample2");
		}

}
