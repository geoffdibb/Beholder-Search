package com.bae.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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

	@Override
	public String toString() {
		return super.toString() + TestConstants.FOUNDLIST;
	}

	@Test
	public void searchTest() {
		Mockito.when(service.search("name", "searchTerm")).thenReturn(TestConstants.MOCK_OBJECT_ARRAY);
		assertEquals(TestConstants.MOCK_OBJECT_ARRAY, service.search("name", "searchTerm"));
//		Mockito.when(service.search("car reg", "searchTerm")).thenReturn(TestConstants.MOCK_OBJECT_ARRAY);
//		assertEquals(TestConstants.MOCK_OBJECT_ARRAY, service.search("name", "searchTerm"));
//		Mockito.when(service.search("getassociates", "searchTerm")).thenReturn(TestConstants.MOCK_OBJECT_ARRAY);
//		assertEquals(TestConstants.MOCK_OBJECT_ARRAY, service.search("name", "searchTerm"));
	}

	@Test
	public void getNameTest() {
		TestConstants.MOCK_CITIZEN_ARRAY.add(TestConstants.MOCK_CITIZEN_OBJECT);
		TestConstants.MOCK_CITIZEN_ARRAY.add(TestConstants.MOCK_CITIZEN_OBJECT2);
		String name = "name";
		assertEquals(TestConstants.FOUNDLIST, service.getName(name));
		Mockito.verify(citizenRepo).findAll();
	}

	@Test
	public void getLocationTest() {
		TestConstants.MOCK_CITIZEN_ARRAY.add(TestConstants.MOCK_CITIZEN_OBJECT);
		TestConstants.MOCK_CITIZEN_ARRAY.add(TestConstants.MOCK_CITIZEN_OBJECT2);
		String location = "location";
		assertEquals(TestConstants.FOUNDLIST, service.getLocation(location));
		Mockito.verify(citizenRepo).findAll();
	}

	@Test
	public void getCarregTest() {
		TestConstants.MOCK_CITIZEN_ARRAY.add(TestConstants.MOCK_CITIZEN_OBJECT);
		TestConstants.MOCK_CITIZEN_ARRAY.add(TestConstants.MOCK_CITIZEN_OBJECT2);
		String carReg = "car reg";
		assertEquals(TestConstants.FOUNDLIST, service.getSuspectCar(carReg));
		Mockito.verify(suspectRepo).findAll();
	}

	@Test
	public void getIDTest() {
		TestConstants.MOCK_CITIZEN_ARRAY.add(TestConstants.MOCK_CITIZEN_OBJECT);
		TestConstants.MOCK_CITIZEN_ARRAY.add(TestConstants.MOCK_CITIZEN_OBJECT2);
		String id = "id";
		assertEquals(TestConstants.FOUNDLIST, service.getId(id));
		Mockito.verify(associateRepo).findAll();
	}

}