package com.spicetag.qa.Base;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.spicetag.qa.util.TestUtil;

public class TestBase 
{

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()
	{
		try 
		{
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/home/aeologic/eclipse-workspace/SpiceTag/src/main/java/com/spicetag"
					+ "/qa/config/config.properties");
					prop.load(ip);
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}


	public static void initialization()
	{
		String browserName = prop.getProperty("browser");

		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/home/aeologic/Downloads/chromedriver");	
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("FF"))
		{
			System.setProperty("webdriver.gecko.driver", "/Users/naveenkhunteta/Documents");	
			driver = new FirefoxDriver(); 
		}
	


		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIME_OUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));
	}
	}