package com.trainig.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.trining.base.basePage;

public class loginpage extends basePage{
	
	@FindBy(id="username")
	WebElement username;
	@FindBy(name="pw")
	WebElement password;
	@FindBy(id="Login")
	WebElement Login;
	@FindBy(id="error")
	WebElement Error;
	@FindBy(id="rememberUn")
	WebElement rememberbutton;
	@FindBy(xpath="//span[contains(text(),'Ambika')]")
	WebElement userlabel;
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	WebElement logout;
	@FindBy(xpath="//a[@id='forgot_password_link']")
	WebElement forgotpassword;
	@FindBy(xpath="//h1[@class='mb12']")
	WebElement Fpasswordtext;
	
	
	
	public loginpage(WebDriver driver) {
		super(driver);
	}
	
	public void enterusername(String username1)

	{
		username.sendKeys(username1);
	}
	public void enterpassword(String password1) {
		password.sendKeys(password1);
	}
	public void Loginbutton() {
		
		Login.click();
	}
	
public String errormsg() {
		String estr=Error.getText();
		return estr;
	}
public void remembercheckbox() {
	rememberbutton.click();
}
public void userlableclick() {
	waitforelements(userlabel);
	mousehover(userlabel);
	waitforelements(userlabel);

	
}
public String userlablename( ) {
	String s1=userlabel.getText();
	return s1;
}
public void logout() {

	logout.click();
}
public void mosehoverl() {

	mousehover(logout);
}
public String gettext() {
	String s=Fpasswordtext.getText();
	return s;	
}
public void forgotpassword() {
	forgotpassword.click();
}

}
