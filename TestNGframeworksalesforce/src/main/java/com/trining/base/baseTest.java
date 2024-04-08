package com.trining.base;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseTest {
	WebDriver driver;
	public WebDriver getdriver() {
		if(driver==null)
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	
	return driver;
}
	
	public void close() {
		driver.close();
		driver=null;
	}
	public void Alert() {
		driver.switchTo().alert().accept();
	}
	
}
