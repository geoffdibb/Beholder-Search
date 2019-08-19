package com.bae.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.bae.service.SearchService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchControllerTest {
	@InjectMocks
	SearchController controller;

	@Mock
	SearchService service;

	@Test
	public void getAUserTest() {

}
}
