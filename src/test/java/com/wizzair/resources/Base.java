package com.wizzair.resources;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	  
	 public static WebDriver driver;
	
	public static WebDriver browserlaunnch() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\M\\eclipse-1\\Cucumberfirst\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
	}
	
	public void loadurl(String url) {
		driver.get(url);
	}
	
	public void send(WebElement element, String send) {
	
	element.sendKeys(send);
		
	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	public void maximize() {
		
		driver.manage().window().maximize();
	}
	
	public void wait1() {

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	}

	
	

}
