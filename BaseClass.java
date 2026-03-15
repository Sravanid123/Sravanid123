package com.TestNGFramework.Annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
 
public class BaseClass {
	
	WebDriver driver;
	@BeforeClass
	public void browserSetup() {
		  System.out.println("Application browser setup is running!");
		  driver = new ChromeDriver();
		  driver.get("https://automationplayground.com/crm/");
		  driver.manage().window().maximize();
	 }
//	 @BeforeMethod
//	  public void title() {
//		  System.out.println("Application Title:" +driver.getTitle());
//		  
//	  }
//	  @AfterMethod
//	  public void getUrl() {
//		  System.out.println("Apllication URL:" +driver.getCurrentUrl());
//	  }
//	  @AfterClass
//	  public void teardown() {
//		  driver.quit();
//		  System.out.println("session is closed");
//	  }


	

}
