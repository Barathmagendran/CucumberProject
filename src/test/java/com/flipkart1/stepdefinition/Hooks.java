package com.flipkart1.stepdefinition;

import cucumber.api.java.Before;

public class Hooks {
	static long current;
	@Before
	public void before() {
	 current= System.currentTimeMillis();
		System.out.println("broswserlanched"+current);
	}
public void after() {
	long after = System.currentTimeMillis();
	System.out.println("browser quitted" +(after-current));
}
}


