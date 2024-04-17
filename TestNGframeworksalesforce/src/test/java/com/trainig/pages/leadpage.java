package com.trainig.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.training.utilities.propertiesfile;
import com.trining.base.basePage;

public class leadpage extends basePage {
@FindBy(xpath="//a[@title='Leads Tab']")
WebElement lead;
@FindBy(xpath="//select[@id='fcf']")
WebElement view;
@FindBy(xpath="//input[@title='Go!']")
WebElement  go;
@FindBy(xpath="//input[@title='New']")	
WebElement nwbutton;
@FindBy(xpath="//input[@id='name_lastlea2']")
WebElement lastname;
@FindBy(xpath="//input[@id='lea3']")
WebElement company;
	@FindBy(xpath="//td[@id='bottomButtonRow']//input[@title='Save']")
	WebElement save;
	

	
	public leadpage(WebDriver driver) {
		super(driver);
		
	}
	public void leadtab() {
		waitforelements(lead);
		mousehover( lead);
	}
	public void viewclick() {
		waitforelements(lead);
		mousehover( lead);
		waitforelements(view);
		mousehover( view);
	}
	public void unreadleads() {
		Select select=new Select(view);
		select.selectByVisibleText("My Unread Leads");
		}
public void gobutton() {
	go.click();
}
public void todayslead() {
	Select select=new Select(view);
	select.selectByVisibleText("Today's Leads");
	
}
public void newbutton() {
	nwbutton.click();
	lastname.clear();
	lastname.sendKeys("ABCD");}
public void companyname() {
	company.clear();
	company.sendKeys("ABCD");
	save.click();
}
}