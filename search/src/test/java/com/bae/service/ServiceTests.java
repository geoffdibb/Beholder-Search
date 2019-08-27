package com.bae.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.entity.Associate;
import com.bae.entity.Citizen;
import com.bae.entity.SuspectCar;
import com.bae.repository.AssociateRepository;
import com.bae.repository.CitizenRepository;
import com.bae.repository.SuspectCarRepository;
import com.bae.util.TestConstants;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceTests {

	@InjectMocks
	private SearchServiceImpl service;

	@Mock
	private CitizenRepository citizenRepo;

	@Mock
	private SuspectCarRepository suspectRepo;

	@Mock
	private AssociateRepository associateRepo;

	@Test
	public void searchTest() {
		Mockito.when(service.search("name", "searchTerm")).thenReturn(TestConstants.MOCK_OBJECT_ARRAY);
		assertEquals(TestConstants.MOCK_OBJECT_ARRAY, service.search("name", "searchTerm"));
	}

	@Test
	public void searchTest2() {
		Mockito.when(service.search("car reg", "searchTerm")).thenReturn(TestConstants.MOCK_OBJECT_ARRAY);
		assertEquals(TestConstants.MOCK_OBJECT_ARRAY, service.search("car reg", "searchTerm"));
	}

	@Test
	public void searchTest3() {
		Mockito.when(service.search("getassociates", "searchTerm")).thenReturn(TestConstants.MOCK_OBJECT_ARRAY);
		assertEquals(TestConstants.MOCK_OBJECT_ARRAY, service.search("getassociates", "searchTerm"));
	}

	@Test
	public void searchTest4() {
		Mockito.when(service.search("", "searchTerm")).thenReturn(TestConstants.MOCK_OBJECT_ARRAY);
		assertEquals(Collections.emptyList(), service.search("getassociates", "searchTerm"));
	}

	@Test
	public void getNameTest() {
		// test if no results
		List<Citizen> searchList = new ArrayList<>();
		searchList.add(TestConstants.MOCK_CITIZEN_OBJECT);
		searchList.add(TestConstants.MOCK_CITIZEN_OBJECT3);
		String name = "John";
		List<Citizen> list = new ArrayList<>();
		Mockito.when(citizenRepo.findAll()).thenReturn(searchList);
		assertEquals(list, service.getName(name));
		Mockito.verify(citizenRepo).findAll();
	}

	@Test
	public void getNameTest2() {
		// test if one result
		List<Citizen> searchList = new ArrayList<>();
		searchList.add(TestConstants.MOCK_CITIZEN_OBJECT);
		searchList.add(TestConstants.MOCK_CITIZEN_OBJECT3);
		List<Citizen> list = new ArrayList<>();
		list.add(TestConstants.MOCK_CITIZEN_OBJECT);
		String name = "Name";
		Mockito.when(citizenRepo.findAll()).thenReturn(searchList);
		assertEquals(list, service.getName(name));
		Mockito.verify(citizenRepo).findAll();
	}

	@Test
	public void getNameTest3() {
		// test if no data
		List<Citizen> searchList = new ArrayList<>();
		List<Citizen> list = new ArrayList<>();
		String name = "Name";
		Mockito.when(citizenRepo.findAll()).thenReturn(searchList);
		assertEquals(list, service.getName(name));
		Mockito.verify(citizenRepo).findAll();
	}

	@Test
	public void getLocationTest() {
		// test if no results
		List<Citizen> searchList = new ArrayList<>();
		searchList.add(TestConstants.MOCK_CITIZEN_OBJECT);
		searchList.add(TestConstants.MOCK_CITIZEN_OBJECT3);
		String location = "location";
		List<Citizen> list = new ArrayList<>();
		Mockito.when(citizenRepo.findAll()).thenReturn(searchList);
		assertEquals(list, service.getLocation(location));
		Mockito.verify(citizenRepo).findAll();
	}

	@Test
	public void getLocationTest2() {
		// test if one result
		List<Citizen> searchList = new ArrayList<>();
		searchList.add(TestConstants.MOCK_CITIZEN_OBJECT);
		searchList.add(TestConstants.MOCK_CITIZEN_OBJECT3);
		String location = "somePlace";
		List<Citizen> list = new ArrayList<>();
		list.add(TestConstants.MOCK_CITIZEN_OBJECT3);
		Mockito.when(citizenRepo.findAll()).thenReturn(searchList);
		assertEquals(list, service.getLocation(location));
		Mockito.verify(citizenRepo).findAll();
	}

	@Test
	public void getLocationTest3() {
		// test if no data
		List<Citizen> searchList = new ArrayList<>();
		String location = "empty";
		List<Citizen> list = new ArrayList<>();
		Mockito.when(citizenRepo.findAll()).thenReturn(searchList);
		assertEquals(list, service.getLocation(location));
		Mockito.verify(citizenRepo).findAll();
	}

	@Test
	public void getCarregTest() {
		// test if no results
		List<SuspectCar> searchList = new ArrayList<>();
		searchList.add(TestConstants.MOCK_CAR_OBJECT);
		searchList.add(TestConstants.MOCK_CAR_OBJECT3);
		String carReg = "car reg";
		List<SuspectCar> list = new ArrayList<>();
		Mockito.when(suspectRepo.findAll()).thenReturn(searchList);
		assertEquals(list, service.getSuspectCar(carReg));
		Mockito.verify(suspectRepo).findAll();
	}

	@Test
	public void getCarregTest2() {
		// test if one results
		List<SuspectCar> searchList = new ArrayList<>();
		searchList.add(TestConstants.MOCK_CAR_OBJECT);
		searchList.add(TestConstants.MOCK_CAR_OBJECT3);
		String carReg = "QW12 QWE";
		List<SuspectCar> list = new ArrayList<>();
		list.add(TestConstants.MOCK_CAR_OBJECT3);
		Mockito.when(suspectRepo.findAll()).thenReturn(searchList);
		assertEquals(list, service.getSuspectCar(carReg));
		Mockito.verify(suspectRepo).findAll();
	}

	@Test
	public void getCarregTest3() {
		// test if no data
		List<SuspectCar> searchList = new ArrayList<>();
		String carReg = "QW12 QWE";
		List<SuspectCar> list = new ArrayList<>();
		Mockito.when(suspectRepo.findAll()).thenReturn(searchList);
		assertEquals(list, service.getSuspectCar(carReg));
		Mockito.verify(suspectRepo).findAll();
	}

	@Test
	public void getIDTest() {
		// test if no results
		List<Associate> searchList = new ArrayList<>();
		searchList.add(TestConstants.MOCK_ASSOCIATE_OBJECT);
		searchList.add(TestConstants.MOCK_ASSOCIATE_OBJECT3);
		String id = "nothing";
		List<Associate> list = new ArrayList<>();
		Mockito.when(associateRepo.findAll()).thenReturn(searchList);
		assertEquals(list, service.getId(id));
		Mockito.verify(associateRepo).findAll();
	}

	@Test
	public void getIDTest2() {
		// test if one results
		List<Associate> searchList = new ArrayList<>();
		searchList.add(TestConstants.MOCK_ASSOCIATE_OBJECT);
		searchList.add(TestConstants.MOCK_ASSOCIATE_OBJECT3);
		String id = "123";
		List<Associate> list = new ArrayList<>();
		list.add(TestConstants.MOCK_ASSOCIATE_OBJECT3);
		Mockito.when(associateRepo.findAll()).thenReturn(searchList);
		assertEquals(list, service.getId(id));
		Mockito.verify(associateRepo).findAll();
	}
	
	@Test
	public void getIDTest3() {
		// test if no data
		List<Associate> searchList = new ArrayList<>();
		String id = "123";
		List<Associate> list = new ArrayList<>();
		Mockito.when(associateRepo.findAll()).thenReturn(searchList);
		assertEquals(list, service.getId(id));
		Mockito.verify(associateRepo).findAll();
	}

}