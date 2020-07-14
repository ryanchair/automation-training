package org.ryanchair.testCase;

import org.openqa.selenium.By;
import org.ryanchair.utility.ActionHandler;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class CariObatTestCase extends TestCaseBase {

	@BeforeTest
	@Override
	public void LaunchBrowser(ITestContext context) {
		// TODO Auto-generated method stub
		super.LaunchBrowser(context);
	}
	
	@Test(description ="Cari Obat")
	public void CariObat() throws InterruptedException {
		  //TestUtility.waitForObjectbyId(driver, 10, "hd-login-global-btn");
		  ActionHandler action = new ActionHandler(super.driver, 40);
		  action.waitForObjectByXpath("/html/body/div[1]/app-root/div/div[1]/magneto-header/div[1]/div/div[1]/nav/div/ul/li[2]/a");
		  action.clickObjectByXpath("/html/body/div[1]/app-root/div/div[1]/magneto-header/div[1]/div/div[1]/nav/div/ul/li[2]/a");
		  action.waitForObjectByXpath("/html/body/div[1]/app-root/div/div[2]/div/obat/div[2]/div[1]/magneto-products-search/div/div/div/div/input");
		  action.sendKeysByXpath("Vitamin C", "/html/body/div[1]/app-root/div/div[2]/div/obat/div[2]/div[1]/magneto-products-search/div/div/div/div/input");
		  super.driver.findElement(By.className("suggestion--search-icon")).click();
		  //suggestion--search-icon
	  }
	
	@AfterTest
	@Override
	public void TerminateBrowser() {
		// TODO Auto-generated method stub
		super.TerminateBrowser();
	}


}
