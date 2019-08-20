package com.bae.entities;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bae.entity.Associate;

import junit.framework.Assert;

public class AssociateTests {
	Associate account = new Associate("Zilla", 1, "Sample");

	@Test
	public void testGetterName() {

		assertEquals(account.getName(), "Zilla");
	}

	@Test
	public void testSetterName() {
		account.setName("Zilla2");
		assertEquals(account.getName(), "Zilla2");
		
	}
	@Test
	public void testGetterNoOfPhoneCalls() {

		assertEquals(account.getNumberOfPhoneCalls(), 1);
	}

	@Test
	public void testSetterNoOfPhoneCalls() {
		account.setNumberOfPhoneCalls(2);
		assertEquals(account.getNumberOfPhoneCalls(), 2);
	}
	@Test
	public void testGetterLatestPhoneCall() {

		assertEquals(account.getLatestPhoneCall(), "Sample");
	}

	@Test
	public void testSetterLatestPhoneCall() {
		account.setLatestPhoneCall("Sample");
		assertEquals(account.getLatestPhoneCall(), "Sample");
	}
}
