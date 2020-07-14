package org.ryanchair.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ActionHandler {
	
	private WebDriver driver;
	private long timeOut;

	public ActionHandler(WebDriver driver,long timeOut) {
		this.driver = driver;
		this.timeOut = timeOut;
	}
	
	public void waitForObjectByXpath(String Xpath) {
		WebDriverWait wait = new WebDriverWait(this.driver, this.timeOut);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath)));
	}
	public void clickObjectByXpath(String Xpath) {
		this.driver.findElement(By.xpath(Xpath)).click();
	}
	public void sendKeysByXpath(String Text,String Xpath) {
		this.driver.findElement(By.xpath(Xpath)).sendKeys(Text);
	}
		
	
}
