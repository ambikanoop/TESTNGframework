package com.training.testcases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.trainig.pages.Accountpage;
import com.trainig.pages.Homepage;
import com.trainig.pages.RandomScenariospage;
import com.trainig.pages.contactspage;
import com.trainig.pages.leadpage;
import com.trainig.pages.loginpage;
import com.trainig.pages.opportunitiespage;
import com.training.log.Log;
import com.training.utilities.propertiesfile;
import com.training.utilities.screenshotutility;
import com.trining.base.baseTest;

public class RandomScenariostestcases extends baseTest{
	WebDriver driver;
	loginpage loginpage;
	screenshotutility screen =new screenshotutility();
	
	propertiesfile prop;
	Homepage home;
	Accountpage account;
	opportunitiespage opp;
	leadpage lead;
	contactspage contacts;
	RandomScenariospage Rpage;
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
opp=new opportunitiespage(driver);
lead=new leadpage(driver);
contacts=new contactspage(driver);
Rpage=new RandomScenariospage(driver);
}
@Test
public void VerifythecustomizationTab() {
	Log.startTestCase("test case35 starting");
	String username=prop.getproperty("username");
	loginpage.enterusername(username);
	String password=prop.getproperty("password");
	loginpage.enterpassword(password);
	loginpage.Loginbutton();
	Rpage.clickonplusbutton();
	Rpage.clickoncustomizemyTab();
	Rpage.clickonassettab();
	Rpage.clickonremovebutton();
	Rpage.clickonsave();
	Rpage.clickonusername();
	Rpage.logout();
}
@Test
public void Blockinganeventinthecalender() {
	Log.startTestCase("test case36 starting");
	String username=prop.getproperty("username");
	loginpage.enterusername(username);
	String password=prop.getproperty("password");
	loginpage.enterpassword(password);
	loginpage.Loginbutton();
	home.clickonHome();
	Rpage.clickondatelink();
	Rpage.clickontimelink();
	Rpage.clickonsubcombutton();
	
	
	Rpage.endtime();
	Rpage.save1();
	
}
@Test
public void Blockinaneventinthecalenderwithweeklyrecurrance() {
	Log.startTestCase("test case37 starting");
	String username=prop.getproperty("username");
	loginpage.enterusername(username);
	String password=prop.getproperty("password");
	loginpage.enterpassword(password);
	loginpage.Loginbutton();
	home.clickonHome();
	Rpage.clickondatelink();
	Rpage.clickontimelink();
	Rpage.clickonsubcombutton();
	Log.endTestCase("switching to parent window");
Rpage.endtime1();
  Rpage.clickonrecurring();
  Log.startTestCase("click on recurring button");
  Rpage.weeklyradiobutton();
  Rpage.enddate1();
  Rpage.month();
  Rpage.year();
  Rpage.save3();
  Rpage.monthview();
}
}