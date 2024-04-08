package com.training.testcases;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.w3c.dom.DOMConfiguration;

import com.trainig.pages.Homepage;
import com.trainig.pages.loginpage;
import com.training.log.Log;
import com.training.utilities.propertiesfile;
import com.training.utilities.screenshotutility;
import com.trining.base.baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;


public class loginTest extends baseTest{
	
	loginpage loginpage;
	WebDriver driver;
	propertiesfile prop;
	screenshotutility screen=new screenshotutility();
	@BeforeMethod

	public void beforeMethod() {
		driver=getdriver();
		 prop=new propertiesfile();
	    String url=prop.getproperty("url");
		driver.get(url);
		 loginpage=new loginpage(driver);
		 DOMConfigurator.configure("log4j.xml");
		 
	}



@Test
	public void Login() {
	Log.startTestCase("Login Test case started");
	String username=prop.getproperty ("username");
	loginpage.enterusername( username);
	Log.info("Succefuly enter the username");
	String password=prop.getproperty("password");
	
	loginpage.enterpassword(password);
	
	loginpage.Loginbutton();
		
	}
@Test
public void passwordInvalid() {
		Log.startTestCase("password field empty test");
		String username=prop.getproperty("username");
		loginpage.enterusername(username);
		loginpage.Loginbutton();
String exp=	loginpage.errormsg();
	String actual="Please enter your password.";	
	Assert.assertEquals(actual, exp);
	Log.endTestCase("Invalidpassword test case ended");
	
	}
@Test
public void Remembercheckbox() {
	Log.startTestCase("password field empty test");
	String username=prop.getproperty("username");
	loginpage.enterusername(username);
	String password=prop.getproperty("password");
	loginpage.enterpassword(password);
	loginpage.remembercheckbox();
	loginpage.Loginbutton();
	loginpage.userlableclick();
	String exp=loginpage.userlablename();
	String actual="Ambika Abcd";
	Assert.assertEquals(actual, exp);
	loginpage.logout();
	Log.endTestCase("succefully logout");
}
@Test
public void forgotpassword() {
	Log.startTestCase("password field empty test");
	String username=prop.getproperty("username");
	loginpage.enterusername(username);
	loginpage.forgotpassword();
	String str=loginpage.gettext();
	String actaltext="Forgot Your Password";
	Assert.assertEquals(str, actaltext);
	Log.endTestCase("forgot password text displyed ");
}
@Test
public void usernamelableclick() {
	Log.startTestCase("usernamelable click");
	String username=prop.getproperty("username");
	loginpage.enterusername(username);
	String password=prop.getproperty("password");
	loginpage.enterpassword(password);
	
	loginpage.remembercheckbox();
	loginpage.Loginbutton();
	loginpage.userlableclick();
	String exp=loginpage.userlablename();
	String actual="Ambika Abcd";
	Assert.assertEquals(actual, exp);
}

@AfterMethod
public void teardown() {
screen.takescreenshot(driver);
	close();
}
}
