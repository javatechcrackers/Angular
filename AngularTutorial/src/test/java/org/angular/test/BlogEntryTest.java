package org.angular.test;

import org.angular.controller.BlogEntryController;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultHandler;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class BlogEntryTest {

	@InjectMocks
	private BlogEntryController controller;

	private MockMvc mvc;

	@Before
	public void seup() {
		MockitoAnnotations.initMocks(this);
		mvc = MockMvcBuilders.standaloneSetup(controller).build();

	}

	@Test
	public void test() throws Exception{
		mvc.perform((RequestBuilder) get("/test").buildRequest(null));
	}

	private ResultHandler print() {
		// TODO Auto-generated method stub
		return null;
	}

}
 