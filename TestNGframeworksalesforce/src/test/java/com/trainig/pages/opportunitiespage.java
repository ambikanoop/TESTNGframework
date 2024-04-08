package com.trainig.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.trining.base.basePage;

public class opportunitiespage extends basePage {
	@FindBy(xpath="//a[contains(text(),'Opportunities')]")
	WebElement opportunity;
	@FindBy(xpath="//select[@id='fcf']")
	WebElement view;
	@FindBy(xpath="//td[@class='pbButton']/input[@name='new']")
	WebElement newbutton;
	@FindBy(xpath="//input[@id='opp3']")
	WebElement oppname;
	@FindBy(xpath="//input[@id='opp4']")
     WebElement Accountname;
	@FindBy(xpath="//input[@id='opp9']")
	WebElement closedate;
	@FindBy(id="calMonthPicker")
	WebElement monthdropdown;
	@FindBy(id="calYearPicker")
	WebElement yeardropdown;
	@FindBy(xpath="//*[@id=\"calRow5\"]/td[7]")
	WebElement date;
	@FindBy(id="opp11")
	WebElement stagedropdown;
	@FindBy(id="opp12")
	WebElement probability;
	@FindBy(xpath="//select[@id='opp6']")
	WebElement sourcedropdown;
	@FindBy(xpath="//td[@id='bottomButtonRow']//input[@title='Save']")
	WebElement save;
	@FindBy(xpath="//a[contains(text(),'Opportunity Pipeline')")
	WebElement opppipeline;
	@FindBy(xpath="//select[@id='quarter_q']")
	WebElement interval;
	@FindBy(xpath="//select[@id='open']")
	WebElement include;
	@FindBy(xpath="//input[@title='Run Report']")
	WebElement runreport;
	@FindBy(xpath="//a[contains(text(),'Stuck Opportunities')]")
	WebElement quarterly;
	public opportunitiespage(WebDriver driver) {
		super(driver);
		
	}
	public void opportunitieslink() {
		waitforelements(opportunity);
	
		opportunity.click();
		view.click();
	}
	public void newopportunity() {
		newbutton.click();
		oppname.clear();
		oppname.sendKeys("Ambikack");
		Accountname.clear();
		Accountname.sendKeys("Ambika");
		
	}
	public void closedate() {
		closedate.click();
		Select month=new Select(monthdropdown);
		month.selectByVisibleText("March");
		Select year=new Select(yeardropdown);
		year.selectByValue("2024");
		date.click();
	}
	public void satge() {
		Select st=new Select(stagedropdown);
		st.selectByVisibleText("Qualification");
		probability.sendKeys("0");
	}
	public void sourcelead()
	{
		Select st1=new Select(sourcedropdown);
		st1.selectByVisibleText("Other");
		save.click();
	}
	public void pipelineopp() {
		opppipeline.click();
	}
	public void stuckoppreport() {
		Select st=new Select(interval);
		st.selectByVisibleText("Next FQ");
		Select st1=new Select( include);
		st1.selectByVisibleText("Open Opportunities");
		runreport.click();
	}
	public void QuarterlySummaryreport() {
		quarterly.click();
	}
}
