package com.bae.entities;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bae.entity.Associate;

import junit.framework.Assert;

public class AssociateTests {
	Associate account = new Associate("name", 1, "nophone");

	@Test
	public void testGetterName() {

		assertEquals( "name",account.getName());
	}

	@Test
	public void testSetterName() {
		account.setName("name2");
		assertEquals( "name2",account.getName());
		
	}
	@Test
	public void testGetterNoOfPhoneCalls() {

		assertEquals(1,account.getNumberOfPhoneCalls());
	}

	@Test
	public void testSetterNoOfPhoneCalls() {
		account.setNumberOfPhoneCalls(2);
		assertEquals(2,account.getNumberOfPhoneCalls());
	}
	@Test
	public void testGetterLatestPhoneCall() {

		assertEquals( "nophone",account.getLatestPhoneCall());
	}

	@Test
	public void testSetterLatestPhoneCall() {
		account.setLatestPhoneCall("nophone2");
		assertEquals("nophone2" ,account.getLatestPhoneCall() );
	}
}
