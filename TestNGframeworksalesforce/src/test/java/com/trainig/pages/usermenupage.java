package com.trainig.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.trining.base.basePage;

public class usermenupage  extends basePage{

 
		
		@FindBy(xpath="//a[text()='Home']")
		WebElement hometab;
		@FindBy(id="DisplayAndLayout_font")
		WebElement displayandlayout;
		@FindBy(xpath="//span[@id='CustomizeTabs_font']")
		WebElement cutamizedtab;
		@FindBy(xpath="//select[@id='p4']")
		WebElement custmapp;
		@FindBy(xpath="//option[@value='report']")
		WebElement report;
		@FindBy(xpath="//img[@alt='Add']")
		WebElement add;
		@FindBy(xpath="//input[@value=' Save ']")
		WebElement save;
		@FindBy(xpath="//a[@title='My Settings']")
		WebElement mysetting;
		@FindBy(id="PersonalInfo_font")
		WebElement personalinfo;
		@FindBy(id="LoginHistory_font")
		WebElement LoginHistory;
		@FindBy(xpath="//a[contains(text(),'Download login history for last six months, includ')]")
		WebElement downloadbutton;
		@FindBy(id="EmailSetup_font")
		WebElement emaillink;
		@FindBy(xpath="//span[@id='EmailSettings_font']")
		WebElement emailsttinglink;
		@FindBy(id="sender_name")
		WebElement name;
		@FindBy(id="sender_email")
		WebElement email;
		@FindBy(xpath="//input[@id='auto_bcc1'] ")
		WebElement bccbutton;
		@FindBy(xpath="//input[@class='btn primary")
		WebElement savebutton;
		@FindBy(xpath="//span[@id='CalendarAndReminders_font']")
		WebElement calender;
		@FindBy(xpath="//span[@id='Reminders_font']")
		WebElement activity;
		@FindBy(xpath="//input[@id='testbtn']")
		WebElement test_remender;
		@FindBy(xpath="//a[@class='debugLogLink menuButtonMenuLink']")
		WebElement developerconsole;
		@FindBy(xpath="//span[@class='pageType']//a[contains(text(),'Ambika Abcd')]")
		WebElement profilename;
		@FindBy(xpath="//*[@id=\"ptBody\"]/div/div[2]/span[1]/h1/a")
		WebElement v;
		@FindBy(xpath="//a[@class='contactInfoLaunch editLink']//img[@title='Edit Profile']")
		WebElement edit;
		@FindBy(xpath="//iframe[@id='contactInfoContentId']")
		WebElement iframe;
		@FindBy(xpath="//a[contains(text(),'About')]")
		WebElement about;
		@FindBy(xpath="//input[@id='lastName']")
		WebElement lastname;
		@FindBy(xpath="//input[@value='Save All']")
		WebElement saveall;

		public usermenupage(WebDriver driver) {
			super(driver);
		}
		basePage basepage=new basePage(driver);
		public void clickonHome() {
			waitforelements(hometab);
			hometab.click();
		}
		public void displaylink() {
			mysetting.click();
			waitforelements(displayandlayout);
			displayandlayout.click();
			cutamizedtab.click();
			waitforelements(custmapp);
			Select dropdown=new Select(custmapp);
			dropdown.selectByVisibleText("Salesforce Chatter");
			waitforelements(report);
			report.click();
			add.click();
			save.click();
			}
		public void personallink() {
			waitforelements(personalinfo);
			personalinfo.click();
			waitforelements(LoginHistory);
			 LoginHistory.click();
			 downloadbutton.click();
			
		}
		public void Emaillink() {
			waitforelements(emaillink);
			emaillink.click();
			emailsttinglink.click();
			name.clear();
			name.sendKeys("Ambika");
			email.clear();
			email.sendKeys("ck.ambika@gmail.com");
			//bccbutton.click();
	      // savebutton.click();
		}
		public void calender() {
			calender.click();
			waitforelements(activity);
			activity.click();
			test_remender.click();
		}
		public void developerconsole() {
			waitforelements(developerconsole);
			developerconsole.click();
			
			
		}
		public void profilename() {
			profilename.click();
		}
		
			
		
	public void  editlink() {
		edit.click();
		
	}
	public void switchToFrame() {
		driver.switchTo().frame(iframe);
	}
	public void about() {
		about.click();
		lastname.click();
		saveall.click();
	}
	

}
