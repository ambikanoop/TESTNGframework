package com.training.testcases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.trainig.pages.Accountpage;
import com.trainig.pages.Homepage;
import com.trainig.pages.leadpage;
import com.trainig.pages.loginpage;
import com.trainig.pages.opportunitiespage;
import com.training.log.Log;
import com.training.utilities.propertiesfile;
import com.training.utilities.screenshotutility;
import com.trining.base.baseTest;

public class leadTabtestcases extends baseTest {
	WebDriver driver;
	loginpage loginpage;
	screenshotutility screen =new screenshotutility();
	propertiesfile prop;
	Homepage home;
	Accountpage account;
	opportunitiespage opp;
	leadpage lead;
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
}
@Test
public void leadTab() {
	Log.startTestCase("test case20 starting");
	String username=prop.getproperty("username");
	loginpage.enterusername(username);
	String password=prop.getproperty("password");
	loginpage.enterpassword(password);
	loginpage.Loginbutton();
	lead.leadtab();
}
@Test
public void leadsselectview() {
	Log.startTestCase("test case21 starting");
	String username=prop.getproperty("username");
	loginpage.enterusername(username);
	String password=prop.getproperty("password");
	loginpage.enterpassword(password);
	loginpage.Loginbutton();
	
	lead.viewclick();
}
@Test
public void defaultView() {
	Log.startTestCase("test case22 starting");
	String username=prop.getproperty("username");
	loginpage.enterusername(username);
	String password=prop.getproperty("password");
	loginpage.enterpassword(password);
	loginpage.Loginbutton();
	lead.viewclick();
	lead.unreadleads();
	loginpage.userlableclick();
	loginpage.mosehoverl();
	//
	lead.leadtab();
	lead.gobutton();
	}
@Test
public void todayslead() {
	Log.startTestCase("test case23 starting");
	String username=prop.getproperty("username");
	loginpage.enterusername(username);
	String password=prop.getproperty("password");
	loginpage.enterpassword(password);
	loginpage.Loginbutton();
	lead.viewclick();
	lead.todayslead();
}
@Test
public void checknewbuttononleadshomeapplication() {
	Log.startTestCase("test case24 starting");
	String username=prop.getproperty("username");
	loginpage.enterusername(username);
	String password=prop.getproperty("password");
	loginpage.enterpassword(password);
	loginpage.Loginbutton();
	lead.viewclick();
	lead.newbutton();
}
@AfterMethod
public void teardown() {
	screen.takescreenshot(driver);
	close();
}
}