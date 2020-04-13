package stepDefinations;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	
	@Before("@SmokeTest")
	public void beforeValidation(){
		System.out.println("Before test hook called....................");
	}
	
	@After("@MobileTest")
	public void afterValidation(){
		System.out.println("After test hook validation called...........");
	}
	
	
	fdshdhsgdhgshdg
	
	
	
	
}
