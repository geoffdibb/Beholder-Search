package com.bae.entity;

public class Incident {

	private String citizenId;
	private String citizen;
	private String timestamp;
	private String streetname;
	private String longitude;
	private String latitude;
	private String type;
	private String detail;

	public Incident(String citizenId, String citizen, String timestamp, String streetname, String longitude,
			String latitude, String type, String detail) {
		super();
		this.citizenId = citizenId;
		this.citizen = citizen;
		this.timestamp = timestamp;
		this.streetname = streetname;
		this.longitude = longitude;
		this.latitude = latitude;
		this.type = type;
		this.detail = detail;
	}

	public Incident() {

	}

	public String getCitizenId() {
		return citizenId;
	}

	public void setCitizenId(String citizenId) {
		this.citizenId = citizenId;
	}

	public String getCitizen() {
		return citizen;
	}

	public void setCitizen(String citizen) {
		this.citizen = citizen;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getStreetname() {
		return streetname;
	}

	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

}
