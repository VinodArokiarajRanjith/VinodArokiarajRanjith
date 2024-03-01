package com.fb.web.stepDefinition;



import com.fb.Utilities.Utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class WebHooks extends Utilities{
	
	@Before
	public void setUp() throws Exception {
		webinitiateApp();
	}

	@After
	public void tearDown() {
	//driver.quit();
	}
}
