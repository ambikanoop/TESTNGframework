package com.training.testcases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.trainig.pages.Accountpage;
import com.trainig.pages.Homepage;
import com.trainig.pages.contactspage;
import com.trainig.pages.leadpage;
import com.trainig.pages.loginpage;
import com.trainig.pages.opportunitiespage;
import com.training.log.Log;
import com.training.utilities.propertiesfile;
import com.training.utilities.screenshotutility;
import com.trining.base.baseTest;

public class hometabTestcases extends baseTest {
	WebDriver driver;
	loginpage loginpage;
	screenshotutility screen =new screenshotutility();
	
	propertiesfile prop;
	Homepage home;
	Accountpage account;
	opportunitiespage opp;
	leadpage lead;
	contactspage contacts;
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
}
@Test
public void verifyfirstnameandlastname() {
	Log.startTestCase("test case 33 is starting");
	String username=prop.getproperty("username");
	loginpage.enterusername(username);
	String password=prop.getproperty("password");
	loginpage.enterpassword(password);
	loginpage.Loginbutton();
	home.clickonHome();
	home.profilename();
	//home.validation();
}
@Test
public void Editlastname() {
	Log.startTestCase("test case 34 is  starting");
	String username=prop.getproperty("username");
	loginpage.enterusername(username);
	String password=prop.getproperty("password");
	loginpage.enterpassword(password);
	loginpage.Loginbutton();
	home.clickonHome();
	home.profilename();
	home.editlink();
	home.switchToFrame();
	home.about();
}
@AfterMethod
public void teardown() {
	screen.takescreenshot(driver);
	close();
}
}