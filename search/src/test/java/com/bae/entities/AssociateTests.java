package com.bae.entities;

import org.junit.Test;

import com.bae.entity.Associate;

import junit.framework.Assert;

public class AssociateTests {
	Associate account = new Associate("Zilla", 1, "Sample");

	@Test
	public void testGetterName() {

		Assert.assertEquals(account.getName(), "Zilla");
	}

	@Test
	public void testSetterName() {
		account.setName("Zilla2");
		Assert.assertEquals(account.getName(), "Zilla2");
		
	}
	@Test
	public void testGetterNoOfPhoneCalls() {

		Assert.assertEquals(account.getNumberOfPhoneCalls(), 1);
	}

	@Test
	public void testSetterNoOfPhoneCalls() {
		account.setNumberOfPhoneCalls(2);
		Assert.assertEquals(account.getNumberOfPhoneCalls(), 2);
	}
	@Test
	public void testGetterLatestPhoneCall() {

		Assert.assertEquals(account.getLatestPhoneCall(), "Sample");
	}

	@Test
	public void testSetterLatestPhoneCall() {
		account.setLatestPhoneCall("Sample");
		Assert.assertEquals(account.getLatestPhoneCall(), "Sample");
	}
}
