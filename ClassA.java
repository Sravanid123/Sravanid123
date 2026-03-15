package com.TestNGFramework.Annotations;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class ClassA {
  @Test
  public void testCase1() {
	  System.out.println("Test case 1 of class A");
  }
  @BeforeTest
  public void btest() {
	  System.out.println("Before Test will execute before all the classes in this package");
  }
  @AfterTest
  public void atest() {
	  System.out.println("After test will execute after all the classes in this package");
  }
  @BeforeSuite
  public void bsuit() {
	  System.out.println("Before suite will execute before all the test");
  }
}
  