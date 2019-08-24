package com.bae.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.service.SearchServiceImpl;
import com.bae.util.TestConstants;

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

	@Test
	public void testGetService() {
		assertEquals(service, controller.getService());
	}

	@Test
	public void testSetService() {
		controller.setService(service);
		assertEquals(service, controller.getService());
	}

	@Test
	public void searchTest() {
		Mockito.when(service.getName("name")).thenReturn(TestConstants.MOCK_OBJECT_ARRAY);
		assertEquals(TestConstants.MOCK_OBJECT_ARRAY, controller.search("name", "searchTerm"));
//		Mockito.verify(service.getName("name"));
	}
	
}
