package com.spicetag.qa.testcases;

import com.spicetag.qa.Base.TestBase;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.spicetag.qa.pages.Dashboard;

import com.spicetag.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	Dashboard dashboard;	


	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new LoginPage();

	}

	@Test(priority=1)
	public void LoginPageTitleValidate() {
		String title = loginpage.ValidateLoginPageTitle();
		AssertJUnit.assertEquals(title, "SpiceTag");
	}

	@Test(priority=2)
	public void spicetaglogo() {
		boolean flag = loginpage.ValidateSpicetagimage();
		AssertJUnit.assertTrue(flag);
	}

	@Test(priority=3)
	public void logintest() {
		dashboard =	loginpage.Longin(prop.getProperty("username"), prop.getProperty("password"));
	}

	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
}
