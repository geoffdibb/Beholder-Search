package com.bae.entity;

public class Associate {

	private String forenames;
	private String surname;
	private String calls;
	private String latest_call;
	private String citizenId;
	private String associateId;

	public Associate(String forenames, String surname, String phonecalls, String latestPhoneCall, String citizenId,
			String associateId) {
		super();
		this.forenames = forenames;
		this.surname = surname;
		this.calls = phonecalls;
		this.latest_call = latestPhoneCall;
		this.citizenId = citizenId;
		this.associateId = associateId;
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

	public void setName(String forenames) {
		this.forenames = forenames;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getNumberOfPhoneCalls() {
		return calls;
	}

	public void setNumberOfPhoneCalls(String phoneCalls) {
		this.calls = phoneCalls;
	}

	public String getLatestPhoneCall() {
		return latest_call;
	}

	public void setLatestPhoneCall(String latestPhoneCall) {
		this.latest_call = latestPhoneCall;
	}

	public String getAssociateId() {
		return associateId;
	}

	public void setAssociateId(String associateId) {
		this.associateId = associateId;
	}

}
