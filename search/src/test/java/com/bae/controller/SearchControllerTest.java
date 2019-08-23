package com.bae.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.service.SearchServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchControllerTest {

	@InjectMocks
	SearchController controller;

	@Mock
	SearchServiceImpl service;
	
	@Test
	public void contextLoads() {
		assertThat(controller).isNotNull();
	}
//
//	@Test
//	public void testGetService() {
//		assertEquals(service, controller.getService());
//	}
//
//	@Test
//	public void testSetService() {
//		controller.setService(service);
//		assertEquals(service, controller.getService());
//	}
//
//	@Test
//	public void getAUserTest() {
//		TestConstants.MOCK_CITIZEN_ARRAY.add(TestConstants.MOCK_CITIZEN_OBJECT);
//		TestConstants.MOCK_CITIZEN_ARRAY.add(TestConstants.MOCK_CITIZEN_OBJECT2);
//
//		Mockito.when(service.getName(null)).thenReturn(TestConstants.MOCK_CITIZEN_ARRAY);
//		assertEquals(TestConstants.MOCK_CITIZEN_OBJECT, controller.getName(null));
//		Mockito.verify(service).getName(null);
////		
////		Mockito.when(service.getProfile(3)).thenReturn(Constant.MOCK_PROFILE_OBJECT2);
////		assertEquals(Constant.MOCK_PROFILE_OBJECT, controller.getProfile(3));
////		Mockito.verify(service).getProfile(3);
//	}
//
//	@Test
//	public void getAcarTest() {
//		TestConstants.MOCK_SUSPECT_CAR_ARRAY.add(TestConstants.MOCK_CAR_OBJECT);
//		TestConstants.MOCK_SUSPECT_CAR_ARRAY.add(TestConstants.MOCK_CAR_OBJECT2);
//
//		Mockito.when(service.getSuspectCar(null)).thenReturn(TestConstants.MOCK_SUSPECT_CAR_ARRAY);
//		assertEquals(TestConstants.MOCK_CITIZEN_ARRAY, controller.getCarReg(null));
//		Mockito.verify(service).getSuspectCar(null);
//	}
//
//	@Test
//	public void getAlocationTest() {
//		TestConstants.MOCK_CITIZEN_ARRAY.add(TestConstants.MOCK_CITIZEN_OBJECT);
//		TestConstants.MOCK_CITIZEN_ARRAY.add(TestConstants.MOCK_CITIZEN_OBJECT2);
//
//		Mockito.when(service.getLocation(null)).thenReturn(TestConstants.MOCK_CITIZEN_ARRAY);
//		assertEquals(TestConstants.MOCK_CITIZEN_ARRAY, controller.getLocation(null));
//		Mockito.verify(service).getLocation(null);
//	}
//
//	@Test
//	public void getAnIdTest() {
//		TestConstants.MOCK_CITIZEN_ARRAY.add(TestConstants.MOCK_CITIZEN_OBJECT);
//		TestConstants.MOCK_CITIZEN_ARRAY.add(TestConstants.MOCK_CITIZEN_OBJECT2);
//
//		Mockito.when(service.getId(null)).thenReturn(TestConstants.MOCK_OBJECT_ARRAY);
//		assertEquals(TestConstants.MOCK_CITIZEN_ARRAY, controller.getId(null));
//		Mockito.verify(service).getId(null);
//	}
	
}
