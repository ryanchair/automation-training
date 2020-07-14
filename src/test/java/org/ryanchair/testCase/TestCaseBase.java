package org.ryanchair.testCase;

import org.testng.annotations.Test;

import io.qameta.allure.Description;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.ryanchair.utility.DriverLaunch;
import org.ryanchair.utility.TestListeners;
import org.ryanchair.utility.ActionHandler;
import org.testng.Assert;
import org.testng.ITestContext;

@Listeners(TestListeners.class)
public class TestCaseBase {
	private static final String baseUrl="https://www.halodoc.com";
	protected WebDriver driver;
	
	
  @BeforeTest()
  public void LaunchBrowser(ITestContext context) {
	  driver = DriverLaunch.chrome();
	  context.setAttribute("webDriver", driver);
	  driver.get(baseUrl);
	  driver.manage().window().maximize(); 
	  String expectedTitle = "Halodoc - Beli Obat, Tanya Dokter, Cek Lab Terpercaya";
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(actualTitle, expectedTitle);
  }

  
  @AfterTest
  public void TerminateBrowser() {
	  driver.close();
	  driver.quit();
  }

}
