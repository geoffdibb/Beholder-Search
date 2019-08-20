package com.bae.entity;

public class Associate {

	private String name;
	private int numberOfPhoneCalls;
	private String latestPhoneCall;
	
	
	public Associate(String name, int numberOfPhoneCalls, String latestPhoneCall) {
		super();
		this.name = name;
		this.numberOfPhoneCalls = numberOfPhoneCalls;
		this.latestPhoneCall = latestPhoneCall;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNumberOfPhoneCalls() {
		return numberOfPhoneCalls;
	}


	public void setNumberOfPhoneCalls(int numberOfPhoneCalls) {
		this.numberOfPhoneCalls = numberOfPhoneCalls;
	}


	public String getLatestPhoneCall() {
		return latestPhoneCall;
	}


	public void setLatestPhoneCall(String latestPhoneCall) {
		this.latestPhoneCall = latestPhoneCall;
	}
	
	
	
	
}
