package com.bae.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.repository.CitizenRepository;
import com.bae.util.TestConstants;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceTests {
//	@InjectMocks
//	private SearchServiceImpl service;
//
//	@Mock
//	private CitizenRepository repository;
//
//	@Override
//	public String toString() {
//		return super.toString() + TestConstants.FOUNDLIST;
//	}
//
//	@Test
//	public void getNameTest() {
//
//		TestConstants.MOCK_CITIZEN_ARRAY.add(TestConstants.MOCK_CITIZEN_OBJECT);
//		TestConstants.MOCK_CITIZEN_ARRAY.add(TestConstants.MOCK_CITIZEN_OBJECT2);
//		String name = "name";
//		assertEquals(TestConstants.FOUNDLIST, service.getName(name));
//		Mockito.verify(repository).findAll();
//	}
//
//	@Test
//	public void getCarregTest() {
//
//		TestConstants.MOCK_CITIZEN_ARRAY.add(TestConstants.MOCK_CITIZEN_OBJECT);
//		TestConstants.MOCK_CITIZEN_ARRAY.add(TestConstants.MOCK_CITIZEN_OBJECT2);
//		String carreg = "car";
//		assertEquals(TestConstants.FOUNDLIST, service.getSuspectCar(carreg));
//		Mockito.verify(repository).findAll();
//	}
//
//	@Test
//	public void getLocationTest() {
//
//		TestConstants.MOCK_CITIZEN_ARRAY.add(TestConstants.MOCK_CITIZEN_OBJECT);
//		TestConstants.MOCK_CITIZEN_ARRAY.add(TestConstants.MOCK_CITIZEN_OBJECT2);
//		String location = "loce";
//		assertEquals(TestConstants.FOUNDLIST, service.getLocation(location));
//		Mockito.verify(repository).findAll();
//	}
//
//	@Test
//	public void getIDTest() {
//
//		TestConstants.MOCK_CITIZEN_ARRAY.add(TestConstants.MOCK_CITIZEN_OBJECT);
//		TestConstants.MOCK_CITIZEN_ARRAY.add(TestConstants.MOCK_CITIZEN_OBJECT2);
//		String id = "ID";
//		assertEquals(TestConstants.FOUNDLIST, service.getId(id));
//		Mockito.verify(repository).findAll();
//	}
}