package com.training.testcases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.trainig.pages.Accountpage;
import com.trainig.pages.Homepage;
import com.trainig.pages.loginpage;
import com.training.log.Log;
import com.training.utilities.propertiesfile;
import com.training.utilities.screenshotutility;
import com.trining.base.baseTest;

public class AccountTabtestcases extends baseTest {
	WebDriver driver;
	loginpage loginpage;
	screenshotutility screen =new screenshotutility();
	propertiesfile prop;
	Homepage home;
	Accountpage account;
@BeforeMethod
public void beforemethod() {
	driver=getdriver();
prop=new propertiesfile();
String url=prop.getproperty("url");
driver.get(url);
loginpage=new loginpage(driver);
DOMConfigurator.configure("log4j.xml");	
home=new Homepage(driver);
account=new Accountpage(driver);

}
@Test
public void createnewAccount() {
	Log.startTestCase("test case10 starting");
	String username=prop.getproperty("username");
	loginpage.enterusername(username);
	String password=prop.getproperty("password");
	loginpage.enterpassword(password);
	loginpage.Loginbutton();
	account.Account();
	account.clickonnewbutton();
	account.accountname();
}
@Test
public void createAccountnewview() {
	Log.startTestCase("test case11 starting");
	String username=prop.getproperty("username");
	loginpage.enterusername(username);
	String password=prop.getproperty("password");
	loginpage.enterpassword(password);
	loginpage.Loginbutton();
	account.Accountlink();
	account.createnewview();
}
@Test
public void Editview() {
	Log.startTestCase("test case12 starting");
	String username=prop.getproperty("username");
	loginpage.enterusername(username);
	String password=prop.getproperty("password");
	loginpage.enterpassword(password);
	loginpage.Loginbutton();
	account.Accountlink();
	account.Editbutton();
	account.dropdown();
	account.Tab();
	
}
@Test
public void mergeaccount() {
	Log.startTestCase("test case13 starting");
	String username=prop.getproperty("username");
	loginpage.enterusername(username);
	String password=prop.getproperty("password");
	loginpage.enterpassword(password);
	loginpage.Loginbutton();
	account.Accountlink();
	account.mergeaccount();
	account.merge2();
	Alert();
	
}
@Test
public void AccountLast30dayactivity() {
	Log.startTestCase("test case14 starting");
	String username=prop.getproperty("username");
	loginpage.enterusername(username);
	String password=prop.getproperty("password");
	loginpage.enterpassword(password);
	loginpage.Loginbutton();
	account.Accountlink();
	account.last30dayactivity();
	account.fromdate();
	//account.date();
	account.todate();
	account.savebutton2();
	account.reportname();
	account.ureportname();
	account.saveandrunbutton();
}
@AfterMethod
public void teardown() {
	screen.takescreenshot(driver);
	close();
}
}
