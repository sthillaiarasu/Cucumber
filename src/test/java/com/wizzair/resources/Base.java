package com.wizzair.resources;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	  protected static WebDriver driver;
	
	public static WebDriver browserlaunnch() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\M\\eclipse-1\\Cucumberfirst\\driver\\chromedriver.exe");
		setDriver(new ChromeDriver());
		return getDriver();
	}
	
	public void loadurl(String url) {
		getDriver().get(url);
	}
	
	public void send(WebElement element, String send) {
	
	element.sendKeys(send);
		
	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	public void maximize() {
		
		getDriver().manage().window().maximize();
	}
	
	public void wait1() {

		getDriver().manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		Base.driver = driver;
	}
	

}
