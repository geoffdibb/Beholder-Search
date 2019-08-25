package com.bae.util;

import java.util.ArrayList;

import com.bae.entity.Associate;
import com.bae.entity.Citizen;
import com.bae.entity.Incident;
import com.bae.entity.SuspectCar;

public class TestConstants {
	
	public static final Associate MOCK_ASSOCIATE_OBJECT = new Associate("name", "surname", "phonecalls", "latestPhoneCall", "id", "associateId");
	public static final Associate MOCK_ASSOCIATE_OBJECT2 = new Associate("name", "surname", "phonecalls", "latestPhoneCall", "id", "associateId");
	
	public static final Citizen MOCK_CITIZEN_OBJECT= new Citizen("id", "name", "surname", "0", "homeAddress", "car_reg", "age", "gender", "phoneNumber");
	public static final Citizen MOCK_CITIZEN_OBJECT2 = new Citizen("id2", "name", "surname", "0", "homeAddress", "car_reg", "age", "gender", "phoneNumber");
	
	public static final SuspectCar MOCK_CAR_OBJECT = new SuspectCar("id", "name", "surname", "carReg", "make", "model", "colour");
	public static final SuspectCar MOCK_CAR_OBJECT2 = new SuspectCar("id", "name", "surname", "carReg2", "make", "model", "colour");
	
	public static final Incident MOCK_INCIDENT_OBJECT = new Incident("id", "citizen", "timeStamp", "streetName", "longitude", "latitude", "type", "detail");
	public static final Incident MOCK_INCIDENT_OBJECT2 = new Incident("id", "citizen", "timeStamp", "streetName", "longitude", "latitude", "type", "detail");
	
	public static ArrayList<Citizen> MOCK_CITIZEN_ARRAY = new ArrayList<Citizen>();
	public static ArrayList<Object> MOCK_OBJECT_ARRAY = new ArrayList<Object>();
	public static ArrayList<SuspectCar> MOCK_SUSPECT_CAR_ARRAY = new ArrayList<SuspectCar>();
	public static ArrayList<Citizen> FOUNDLIST = new ArrayList<>();
}
