package com.MySeleniumProject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTest {
  @Test
  public void CheckAssert() {
	  Assert.assertEquals(true, true);
  }
  
  @Test
  public void CheckAssert1() {
	  Assert.assertEquals(true, true);
  }

}
