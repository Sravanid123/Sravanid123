package com.TestNGFramework.Annotations;

import org.testng.annotations.Test;
import org.testng.annotations.*;

public class ClassB {
  @Test
  public void testcase2() {
	  System.out.println("This test case 2 of class B");
  }
  @AfterSuite
  public void asuit() {
	  System.out.println("after suit will execute after test");
  }
}
