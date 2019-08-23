package com.bae.util;

import java.util.ArrayList;

import com.bae.entity.Associate;
import com.bae.entity.Citizen;
import com.bae.entity.SuspectCar;

public class TestConstants {
	
	public static final Associate MOCK_ASSOCIATE_OBJECT = new Associate("name", "1", "nophone", "citizenId", "surname", "associateId");
	public static final Associate MOCK_ASSOCIATE_OBJECT2 = new Associate("name", "1", "nophone", "citizenId", "surname", "associateId");
	
	public static final Citizen MOCK_CITIZEN_OBJECT= new Citizen("id", "name", "surname", "0", "homeAddress", "car_reg", "age", "gender", "phoneNumber");
	public static final Citizen MOCK_CITIZEN_OBJECT2 = new Citizen("id", "name", "surname", "0", "homeAddress", "car_reg", "age", "gender", "phoneNumber");
	
	public static final SuspectCar MOCK_SUSPECT_CAR = new SuspectCar("id", "name", null, "0", null, null, null, null);
	public static final SuspectCar MOCK_SUSPECT_CAR2 = new SuspectCar("id", "name", null, "0", null, null, null, null);
	public static ArrayList<Citizen> MOCK_CITIZEN_ARRAY = new ArrayList<Citizen>();
	public static ArrayList<Object> MOCK_OBJECT_ARRAY = new ArrayList<Object>();
	public static ArrayList<SuspectCar> MOCK_SUSPECT_CAR_ARRAY = new ArrayList<SuspectCar>();
	public static ArrayList<Citizen> FOUNDLIST = new ArrayList<>();
}
