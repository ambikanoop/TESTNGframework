package com.trainig.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.training.log.Log;
import com.trining.base.basePage;

public class Accountpage extends basePage{
	@FindBy(id="Account_Tab")
	WebElement Account;
	@FindBy(xpath="//input[@title='New']")
	WebElement newbutton;
	@FindBy(xpath="//input[@id='acc2']")
	WebElement  Accountname;
	@FindBy(xpath="//select[@id='acc6']")
	WebElement typedropdown;
	@FindBy(xpath="//select[@id='00Naj000001201m']")
	WebElement customerprioritydropdwon;
	@FindBy(xpath="//td[@id='bottomButtonRow']//input[@title='Save']")
	WebElement save;
	@FindBy(xpath="//a[contains(text(),'Create New View')]")
	WebElement newview;
	@FindBy(xpath="//input[@id='fname']")
	WebElement viewname;
	@FindBy(xpath="//input[@id='devname']")
	WebElement  viewuniqname;
	@FindBy(xpath="//input[@data-uidsfdc='4']")
	WebElement savebutton;
	@FindBy(xpath="//select[@id='fcf']")
	WebElement viewdropdown;
	@FindBy(xpath="//*[@id=\"00Baj000005TuxM_filterLinks\"]/a[1]")
	WebElement  edit;
	@FindBy(xpath="//select[@id='fcol1']")
	WebElement fielddropdown;
	@FindBy(xpath="//select[@id='fop1']")
	WebElement operatordropdown;
	@FindBy(xpath="//input[@title='Value 1']")
	WebElement  value;
	@FindBy(xpath="//select[@id='colselector_select_0']")
	WebElement availabeTabs ;
	@FindBy(xpath="//a[@id='colselector_select_0_right']//img[@title='Add']")
	WebElement Add;
	@FindBy(xpath="//input[@data-uidsfdc='5']")
	WebElement savebutton1;
	@FindBy(xpath="//a[contains(text(),'Merge Accounts')]")
	WebElement merge;
	@FindBy(xpath="//input[@id='srch']")
	WebElement search;
	@FindBy(xpath="//input[@value='Find Accounts']")
	List<WebElement> alloptions;
	@FindBy(xpath="//table[@class='list']/tbody/tr/td")
	List<WebElement> table;
	@FindBy(xpath="//td[text()='ambika']//preceding-sibling::th//input")
	WebElement input;
	@FindBy(xpath="//td[text()='AmbikaKrishnamurthy']//preceding-sibling::th//input")
	WebElement input2;
	@FindBy(xpath="//div[@class='pbTopButtons']//input[@title='Next']")
	WebElement next;
	@FindBy(xpath="//div[@class='pbTopButtons']//input[@title='Merge']")
	WebElement merge1;
	@FindBy(xpath="//a[contains(text(),'Accounts with last activity')]")
	WebElement last30dayactivity;
	@FindBy(xpath="//*[@id=\"ext-gen152\"]")
	WebElement fromdropdown;
	@FindBy(xpath="//table[@id='ext-comp-1111']/tbody/tr[2]/td[2]")
	WebElement todaybutton;
	@FindBy(xpath="//*[@id='ext-gen268']/tbody/tr[2]/td/table/tbody/tr[1]/td[3]/a")
	WebElement date;
	@FindBy(xpath="//img[@id='ext-gen154']")
	WebElement todate;
	@FindBy(xpath="//*[@id='ext-comp-1045']")
	WebElement date1;
	@FindBy(xpath="//*[@id='ext-gen49']")
	WebElement savebutton2;
	@FindBy(xpath="//*[@id='saveReportDlg_reportNameField']")
	WebElement reportname;
	@FindBy(xpath="//*[@id='saveReportDlg_DeveloperName']")////table[@id='dlgSaveAndRun']/tbody/tr[2]/td[2]
	WebElement ureportname;
	@FindBy(xpath="//*[@id=\"ext-gen315\"]")
	WebElement saveandrun;
	
	
	public Accountpage(WebDriver driver) {
		super(driver);
	
	}
	
	public void Accountlink() {
		waitforelements(Account);
		Account.click();
	}
	public void Account() {
		waitforelements(Account);
		Account.click();}
	public void clickonnewbutton() {
		newbutton.click();}
	public void accountname() {
		Accountname.sendKeys("AAA1");
		selectByText(typedropdown,"Technology Partner");
		selectByText(customerprioritydropdwon,"High");
		
		save.click();
	}
	public void createnewview() {
		 newview.click();
		 viewname.sendKeys("Abc");
		 viewname.click();
		 viewuniqname.click();
		 waitforelements(savebutton);
		 savebutton.click();
	}
	public void Editbutton() {
		
		viewdropdown.click();
		selectByText(viewdropdown,"Ambi2");
		
		waitforelements(edit);
		edit.click();
		
viewname.clear();
		 viewname.sendKeys("Ambi14");
	}
	public void dropdown()
	{
		waitforelements(fielddropdown);
		selectByText(fielddropdown,"Account Name");
		waitforelements(operatordropdown);
		selectByText(operatordropdown,"contains");
		
		mousehover( value);
	}
	public void Tab() {
		waitforelements(availabeTabs);
		selectByText(availabeTabs,"Last Activity");
		
		Add.click();
		savebutton1.click();
	}
	public void mergeaccount() {
		waitforelements(merge);
		mousehover( merge);
		waitforelements(search);
		search.sendKeys("Am");
		for(WebElement w:alloptions) {
			w.getAttribute("Am");
			w.click();
	}
		input.click();
		input2.click();
		next.click();
		
	}
	public void merge2() {
		waitforelements(merge1);
		mousehover( merge1);
	}
	public void  last30dayactivity() {
		mousehover(last30dayactivity);
	}
	public void fromdate() {
		
		fromdropdown.click();
		 todaybutton.click();
		//fromdropdown.sendKeys("4/5/2024");
	}
	public void date() {
		date.click();
	}
	public void todate() {
		waitforelements(todate);
		todate.click();
		date1.clear();
		date1.sendKeys("4/10/2024");
	}
	public void savebutton2() {
		savebutton2.click();
	}
	public void reportname() {
		reportname.sendKeys("Ac");
	}
	public void ureportname() {
		ureportname.click();
	}
	public void saveandrunbutton() {
		//waitforelements(saveandrun);
		//saveandrun.click();
		mousehover(saveandrun);
}
}