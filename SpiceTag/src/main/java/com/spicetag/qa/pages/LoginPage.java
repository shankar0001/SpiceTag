package com.spicetag.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spicetag.qa.Base.TestBase;

import net.bytebuddy.asm.Advice.This;

public class LoginPage extends TestBase {

	//Page Factory
	@FindBy(xpath = "//input[@placeholder=\"User ID\"]")
	WebElement username;
	
	@FindBy(xpath = "//input[@placeholder=\"Password\"]" )
	WebElement password;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement loginbtn;
	
	@FindBy(xpath = "(//IMG[@_ngcontent-c0=''])[1]")
	WebElement spicetaglogo;
	
	public LoginPage() {
		
		PageFactory.initElements(driver,this);
		
	}
	
	public String ValidateLoginPageTitle() {
		return driver.getTitle();
			}
	
	public boolean ValidateSpicetagimage() {
		return spicetaglogo.isDisplayed();
		
	}
	public Dashboard Longin(String un , String pwd) {
		
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		return new Dashboard();
	}
}
