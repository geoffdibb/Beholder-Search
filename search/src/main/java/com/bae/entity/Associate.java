package com.bae.entity;

public class Associate {

	private String forenames;
	private int phoneCalls;
	private String latest_Call;
	private String citizenId;

	public Associate(String name, int numberOfPhoneCalls, String latestPhoneCall, String citizenId) {
		super();
		this.forenames = name;
		this.phoneCalls = numberOfPhoneCalls;
		this.latest_Call = latestPhoneCall;
		this.citizenId = citizenId;
	}

	public Associate() {

	}

	public String getCitizenId() {
		return citizenId;
	}

	public void setCitizenId(String citizenId) {
		this.citizenId = citizenId;
	}

	public String getName() {
		return forenames;
	}

	public void setName(String name) {
		this.forenames = name;
	}

	public int getNumberOfPhoneCalls() {
		return phoneCalls;
	}

	public void setNumberOfPhoneCalls(int numberOfPhoneCalls) {
		this.phoneCalls = numberOfPhoneCalls;
	}

	public String getLatestPhoneCall() {
		return latest_Call;
	}

	public void setLatestPhoneCall(String latestPhoneCall) {
		this.latest_Call = latestPhoneCall;
	}

}
