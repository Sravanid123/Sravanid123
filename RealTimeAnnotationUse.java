package com.TestNGFramework.Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class RealTimeAnnotationUse extends BaseClass{

//	  driver=new ChromeDriver();
//	  driver.get("https://automationplayground.com/crm/");
//	  driver.manage().window().maximize();
//} {
	
//  WebDriver driver;
//  @BeforeClass
//  public void browserSetup() {
//	  
//	  driver=new ChromeDriver();
//	  driver.get("https://automationplayground.com/crm/");
//	  driver.manage().window().maximize();
//  }
  @Test(priority=1,description="SmokeTest")
  public void signInLink1() {
	  WebElement ele= driver.findElement(By.id("SignIn"));
	  if(ele.isDisplayed()&&ele.isEnabled())
	  {
		  ele.click();
		  
	  }
	 System.out.println("Sign In Link validation done");
	  
  }
  @Test(priority=2,description="Functional Test", dependsOnMethods="signInLink1")
  public void logInLink() throws InterruptedException {
	  driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("test@123");
	  driver.findElement(By.id("submit-id")).click();
	  Thread.sleep(3000);
	  
  }
//  @BeforeMethod
//  public void title() {
//	  System.out.println("Application Title:" +driver.getTitle());
//	  
//  }
//  @AfterMethod
//  public void getUrl() {
//	  System.out.println("Apllication URL:" +driver.getCurrentUrl());
//  }
//  @AfterClass
//  public void teardown() {
//	  driver.quit();
//	  System.out.println("session is closed");
//  }
}
