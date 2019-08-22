package com.bae.util;

import java.util.ArrayList;

import com.bae.entity.Citizen;
import com.bae.entity.SuspectCar;

public class TestConstants {

	public static final Citizen MOCK_CITIZEN = new Citizen("id", "name", null, "0", null, null);
	public static final Citizen MOCK_CITIZEN_2 = new Citizen("id", "name", null, "0", null, null);
	public static final SuspectCar MOCK_SUSPECT_CAR = new SuspectCar("id", "name", null, "0", null, null, null, null);
	public static final SuspectCar MOCK_SUSPECT_CAR2 = new SuspectCar("id", "name", null, "0", null, null, null, null);
	public static ArrayList<Citizen> MOCK_CITIZEN_ARRAY = new ArrayList<Citizen>();
	public static ArrayList<SuspectCar> MOCK_SUSPECT_CAR_ARRAY = new ArrayList<SuspectCar>();
	public static ArrayList<Citizen> FOUNDLIST = new ArrayList<>();
}
