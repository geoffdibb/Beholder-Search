package com.bae.controller;

import static org.junit.Assert.assertEquals;

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
	public void getAUserTest() {
		TestConstants.MOCK_CITIZEN_ARRAY.add(TestConstants.MOCK_CITIZEN);
		TestConstants.MOCK_CITIZEN_ARRAY.add(TestConstants.MOCK_CITIZEN_2);
		
		Mockito.when(service.getName(null)).thenReturn(TestConstants.MOCK_CITIZEN_ARRAY);
		assertEquals(TestConstants.MOCK_CITIZEN_ARRAY, controller.getName(null));
		Mockito.verify(service).getName(null);
	}
}

