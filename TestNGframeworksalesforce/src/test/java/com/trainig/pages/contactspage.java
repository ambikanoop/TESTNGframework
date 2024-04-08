package com.trainig.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.trining.base.basePage;
import com.trining.base.baseTest;

public class contactspage extends basePage {
@FindBy(xpath="//a[contains(text(),'Contacts')]")
WebElement contacts;
@FindBy(xpath="//td[@class='pbButton']/input[@value=' New ']")	
WebElement newbutton;
@FindBy(xpath="//input[@id='name_lastcon2']")	
WebElement lastname;
@FindBy(xpath="//input[@id='con4']")
WebElement company;
@FindBy(xpath="//td[@class='pbButtonb']/input[@value=' Save ']")
WebElement save;
@FindBy(xpath="//a[contains(text(),'Create New View')]")
WebElement newview;
@FindBy(xpath="//td[@class='dataCol']//input[@id='fname']")	
WebElement viewname;
@FindBy(xpath="//td[@class='dataCol']//input[@id='devname']")
WebElement uviewname;
@FindBy(xpath="//td[@class='pbButtonb']//input[@data-uidsfdc='3']")
WebElement save1;
@FindBy(xpath="//td[@class='pbHelp']//select[@id='hotlist_mode']")
WebElement recentview;
@FindBy(xpath="//select[@id='fcf']")
WebElement view;
@FindBy(xpath="//a[contains(text(),'Aksha')]")
WebElement contactname;
@FindBy(xpath="//td[@class='pbButtonb']//input[@fdprocessedid='1ng1nw']")
WebElement cancel;

	
	public contactspage(WebDriver driver) {
		super(driver);
	
	}
	public void contactTab() {
		waitforelements(contacts);
		mousehover(contacts);
	}
	public void newcontact() {
		newbutton.click();
		lastname.clear();
		lastname.sendKeys("Aksha");
		company.sendKeys("Ambika");
		save.click();
	}
	public void newview() {
		newview.click();
		viewname.sendKeys("aa1");
		uviewname.clear();
		uviewname.sendKeys("bb");
		save1.click();
	}
	public void recectview() {
		Select s1=new Select(recentview);
		s1.selectByVisibleText("Recently Created");
	}
	public void view() {
		Select s1=new Select(view);
		s1.selectByVisibleText("My Contacts");
		
	}
	public void contactname() {
		contactname.click();
	}
	public void newviewincontacterror() {
		newview.click();
		uviewname.sendKeys("EFGH");
		save1.click();
	}
	public void newviewincontactcancel() {
		newview.click();
		viewname.sendKeys("ABCD");
	
		uviewname.click();
		waitforelements(cancel);
		mousehover(cancel);
}
	public void newcontacterror() {
		newbutton.click();
		lastname.clear();
		lastname.sendKeys("Indian");
		company.sendKeys("Global Media");
		save.click();
	}
}