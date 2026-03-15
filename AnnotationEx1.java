package com.TestNGFramework.Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class AnnotationEx1 {
  @Test
  public void registerTest() {
	  System.out.println("This is the register test");
  }
  @Test
  public void loginTest() {
	  System.out.println("This is the login test");
  }
  @Test
  public void logoutTest() {
	  System.out.println("This is the logout test");
  }
  
  //annotations
  @BeforeMethod
  public void bmethod() {
	  System.out.println("Before method will execute before every test case");
  }
  @AfterMethod
  public void amethod() {
	  System.out.println("After method will execute after every test case");
  }
  @BeforeClass
  public void bclass() {
	  System.out.println("Before class will execute before first test case");
  }
  @AfterClass
  public void aclass() {
	  System.out.println("After class will execute once after all test case(last test case)");
}
}
