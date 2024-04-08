package com.training.testcases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.trainig.pages.Accountpage;
import com.trainig.pages.Homepage;
import com.trainig.pages.loginpage;
import com.trainig.pages.opportunitiespage;
import com.training.log.Log;
import com.training.utilities.propertiesfile;
import com.training.utilities.screenshotutility;
import com.trining.base.baseTest;

public class opportunityTabTestcases extends baseTest {
	WebDriver driver;
	loginpage loginpage;
	screenshotutility screen =new screenshotutility();
	propertiesfile prop;
	Homepage home;
	Accountpage account;
	opportunitiespage opp;
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
}
@Test
public void opportunitylink() {
	Log.startTestCase("test case15 starting");
	String username=prop.getproperty("username");
	loginpage.enterusername(username);
	String password=prop.getproperty("password");
	loginpage.enterpassword(password);
	loginpage.Loginbutton();
	opp.opportunitieslink();
}
@Test
public void createnewoppurtunity() {
	Log.startTestCase("test case16 starting");
	String username=prop.getproperty("username");
	loginpage.enterusername(username);
	String password=prop.getproperty("password");
	loginpage.enterpassword(password);
	loginpage.Loginbutton();
	opp.opportunitieslink();
	opp.newopportunity();
	opp.closedate();
	opp.satge();
	opp.sourcelead();
}
@Test
public void opportunitypipelineReport() {
	Log.startTestCase("test case17 starting");
	String username=prop.getproperty("username");
	loginpage.enterusername(username);
	String password=prop.getproperty("password");
	loginpage.enterpassword(password);
	loginpage.Loginbutton();
	opp.opportunitieslink();
	opp.pipelineopp();
}
@Test
public void opportunitystuckoppreport() {
	Log.startTestCase("test case18 starting");
	String username=prop.getproperty("username");
	loginpage.enterusername(username);
	String password=prop.getproperty("password");
	loginpage.enterpassword(password);
	loginpage.Loginbutton();
	opp.opportunitieslink();
	opp.stuckoppreport();
}
@Test
public void opportunityQuarterlySummaryreport() {
	Log.startTestCase("test case19 starting");
	String username=prop.getproperty("username");
	loginpage.enterusername(username);
	String password=prop.getproperty("password");
	loginpage.enterpassword(password);
	loginpage.Loginbutton();
	opp.opportunitieslink();
	opp.QuarterlySummaryreport();
}

@AfterMethod
public void teardown() {
	screen.takescreenshot(driver);
	close();
}
}
