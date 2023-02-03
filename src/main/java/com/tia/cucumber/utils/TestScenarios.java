package com.tia.cucumber.utils;

public enum TestScenarios {

	T1("User valid login"),
	T2("User on Dashboard");
//	T1000
	
	private String testName;
	
	TestScenarios(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
	
}
