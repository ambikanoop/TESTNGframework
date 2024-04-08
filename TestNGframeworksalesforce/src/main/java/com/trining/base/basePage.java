package com.trining.base;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basePage {
protected WebDriver driver;
	public basePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void waitforelements(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void mousehover(WebElement element) {
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
		action.click().build().perform();
	}
	public void selectByText(WebElement element,String Text) {
		Select s=new Select(element);
		s.selectByVisibleText(Text);
	}
	public String getParentWindow() {
		String parentwindow=driver.getWindowHandle();
		return parentwindow;
	}
	 public void switchTowindow()
	 {
		 String parentwindow=driver.getWindowHandle();
		 Set<String>handles=driver.getWindowHandles();
		 for(String windowhandle:handles) {
			if(!parentwindow.equals(windowhandle)) {
				driver.switchTo().window(windowhandle);
			}
			
		 }
	 }
	
	public void switchToframe(WebElement ele) {
		driver.switchTo().frame(ele);
	}
	public void switchToParentwindow1(String parentwindow)
	 {
		// String parentwindow=driver.getWindowHandle();
		
		 Set<String>handles=driver.getWindowHandles();
		 for(String windowhandle:handles) {
			if(!parentwindow.equals(windowhandle)) {
				driver.switchTo().window(windowhandle);
				driver.close();
			driver.switchTo().window(parentwindow);
		 }
	 }}
		 
		 public void switchToParentwindow()
		 {
			 String parentwindow=driver.getWindowHandle();
			
			 Set<String>handles=driver.getWindowHandles();
			 for(String windowhandle:handles) {
				if(!parentwindow.equals(windowhandle)) {
					driver.switchTo().window(windowhandle);
					driver.close();
				driver.switchTo().window(parentwindow);
			 }
		 }	 
}}