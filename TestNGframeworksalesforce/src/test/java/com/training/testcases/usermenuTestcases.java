package com.training.testcases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.trainig.pages.Homepage;
import com.trainig.pages.loginpage;
import com.trainig.pages.usermenupage;
import com.training.log.Log;
import com.training.utilities.propertiesfile;
import com.training.utilities.screenshotutility;
import com.trining.base.baseTest;

public class usermenuTestcases extends baseTest{
	WebDriver driver;
	loginpage loginpage;
	screenshotutility screen =new screenshotutility();
	propertiesfile prop;
	 usermenupage usermenu;
@BeforeMethod
public void beforemethod() {
	driver=getdriver();
prop=new propertiesfile();
String url=prop.getproperty("url");
driver.get(url);
loginpage=new loginpage(driver);
DOMConfigurator.configure("log4j.xml");	
usermenu=new  usermenupage(driver);
}
@Test
public void mysetting7() {
	Log.startTestCase("displylink");
	String username=prop.getproperty("username");
	loginpage.enterusername(username);
	String password=prop.getproperty("password");
	loginpage.enterpassword(password);
	loginpage.Loginbutton();
	loginpage.userlableclick();
	usermenu.displaylink();
	usermenu.personallink();
	usermenu.Emaillink();
	usermenu.calender();
String original=driver.getCurrentUrl();
String exp="https://ilg-dev-ed.develop.my.salesforce.com/ui/core/activity/ReminderSettingsPage?setupid=Reminders&retURL=%2Fui%2Fsetup%2FSetup%3Fsetupid%3DCalendarAndReminders";
Assert.assertEquals(original, exp);
	
}
@Test
public void developerconsole8() {
	Log.startTestCase("test case 8 is starting");
	String username=prop.getproperty("username");
	loginpage.enterusername(username);
	String password=prop.getproperty("password");
	loginpage.enterpassword(password);
	loginpage.Loginbutton();
	loginpage.userlableclick();
	Log.startTestCase("developerconsole");
	
	usermenu.developerconsole();
	
	
}	
@Test
public void logout() {
	Log.startTestCase("test case 9 is starting");
	String username=prop.getproperty("username");
	loginpage.enterusername(username);
	String password=prop.getproperty("password");
	loginpage.enterpassword(password);
	loginpage.Loginbutton();
	loginpage.userlableclick();	
	loginpage.logout();
	//String original=driver.getCurrentUrl();
	//String exp="https://ilg-dev-ed.develop.my.salesforce.com/";
	//Assert.assertEquals(original, exp);

}
@AfterMethod
public void teardowm() {
	screen.takescreenshot(driver);
	close();	
}
}