package com.trainig.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.trining.base.basePage;

public class RandomScenariospage extends basePage{

	@FindBy(xpath="//*[@id='AllTab_Tab']/a")
	WebElement Plusbutton;
	@FindBy(xpath="//input[@value='Customize My Tabs']")
	WebElement customizeTab;
	@FindBy(xpath="//select[@id='duel_select_1']/option[@value='Asset']")
	WebElement assettab;
	@FindBy(xpath="//a[@id='duel_select_0_left']")
	WebElement removebutton;
	@FindBy(xpath="//td[@id='bottomButtonRow']/input[@value=' Save ']")
	WebElement save;
	@FindBy(xpath="//span[contains(text(),'Ambika')]")
	WebElement username;
	@FindBy(xpath="//a[@title='Logout']")
	WebElement logout;
	@FindBy(xpath="//span[@class='pageDescription']/a")
	WebElement date;
	@FindBy(xpath="//td[@class='calendarBlock']//div[@id='p:f:j_id25:j_id61:28:j_id64']/a")
	WebElement timelink;
	@FindBy(xpath="//a[@title='Combo (New Window)']")
	WebElement  subcombo;
	@FindBy(xpath="//table[@id='calTable']/tbody/tr/td[@class='fixedTable']")
	WebElement table;
	@FindBy(xpath="//li[@class='listItem4']/a")
	WebElement otherbutton;
	@FindBy(xpath="//input[@id='EndDateTime_time']")
	WebElement endtime;
	@FindBy(xpath="//*[@id=\"ep\"]/div[3]/table/tbody/tr/td[2]/input[1]")
	WebElement save1;
	@FindBy(xpath="//input[@id='EndDateTime_time']")
	WebElement endtime1;
	@FindBy(xpath="//input[@id='IsRecurrence']")
	WebElement recurring;
	@FindBy(xpath="//*[@id=\"rectypeftw\"]")
	WebElement weeklyradiobutton;
	@FindBy(xpath="//*[@id=\"RecurrenceEndDateOnly\"]")
	WebElement enddate1;
	@FindBy(xpath="//*[@id=\"calMonthPicker\"]")
	WebElement month;
	@FindBy(xpath="//*[@id=\"calYearPicker\"]")
	WebElement year;
	@FindBy(xpath="//*[@id=\"calRow2\"]/td[5]")
	WebElement date2;
	@FindBy(xpath="//*[@id=\"bottomButtonRow\"]/input[1]")
	WebElement save3;
	@FindBy(xpath="//*[@id='bCalDiv']/div/div[2]/span[2]/a[3]/img")
	WebElement Monthview;
	
	
	
	
	
	public RandomScenariospage(WebDriver driver) {
		super(driver);
		
	}
public void clickonplusbutton() {
	mousehover(Plusbutton);
}
public void clickoncustomizemyTab() {
	customizeTab.click();
}
public void clickonassettab() {
	assettab.click();
}
public void clickonremovebutton() {
	removebutton.click();
}
public void clickonsave() {
	save.click();
	}
public void clickonusername() {
	username.click();
}
public void logout() {
	logout.click();
}
public void clickondatelink() {
	date.click();
}
public void clickontimelink() {
	timelink.click();
}
public void  clickonsubcombutton() {
	waitforelements(subcombo);
	String parent=getParentWindow();
	 subcombo.click();
	 switchTowindow();
	 otherbutton.click();
	 switchToParentwindow1(parent);
}
public void timetable() {
	table.click();
	 
}




public void endtime() {
	endtime.click();
	endtime.sendKeys("9:00PM");
}
public void save1() {
	waitforelements(save1);
	mousehover(save1);
}
public void endtime1() {
	//waitforelements(enddate1);
	//mousehover(endtime1);
	endtime1.click();
	endtime1.sendKeys("7:00 PM");
}
public void clickonrecurring() {
	waitforelements(recurring);
	mousehover(recurring);
}
public void weeklyradiobutton() {
	weeklyradiobutton.click();
}
public void enddate1() {
	enddate1.click();
}
public void month() {
	selectByText(month,"April");
}
public void year() {
	selectByText(year,"2024");
}
public void save3() {
	save3.click();
}
public void monthview() {
	waitforelements(Monthview);
	Monthview.click();
	
}
}
