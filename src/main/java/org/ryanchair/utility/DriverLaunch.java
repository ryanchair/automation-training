package org.ryanchair.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverLaunch{

	public static WebDriver chrome() {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/src/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

	

}
