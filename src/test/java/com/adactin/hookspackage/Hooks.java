package com.adactin.hookspackage;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	@Before
	public void beforemethod() {
		System.out.println("Hooks Before");
	}
	
	@After
	public void aftermethod() {
		System.out.println("Hooks After");
	}
}
