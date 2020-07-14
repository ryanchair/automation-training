package org.ryanchair.testCase;

import org.ryanchair.utility.ActionHandler;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CariDokterTestCase extends TestCaseBase {

	@BeforeTest
	@Override
	public void LaunchBrowser(ITestContext context) {
		// TODO Auto-generated method stub
		super.LaunchBrowser(context);
	}
	
	
	@Test(description ="Cari Dokter")
	public void cariDokter() {
		ActionHandler action = new ActionHandler(super.driver, 40);
		action.waitForObjectByXpath("/html/body/div[1]/app-root/div/div[1]/magneto-header/div[1]/div/div/nav/div/ul/li[5]/a");
		action.clickObjectByXpath("/html/body/div[1]/app-root/div/div[1]/magneto-header/div[1]/div/div/nav/div/ul/li[5]/a");
	}
	
	@AfterTest
	@Override
	public void TerminateBrowser() {
		// TODO Auto-generated method stub
		super.TerminateBrowser();
	}
}
