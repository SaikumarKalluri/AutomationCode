package com.digitalbank.welcompageTestcase;

import org.apache.tools.ant.taskdefs.WaitFor;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.digibank.TestBase.TestBase;
import com.digitalbank.pages.welcompage.WelcomScreenPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;
@SuppressWarnings("unused")
public class WelcomScreenTest extends TestBase {
	
	public void verifyWelcomScreenlements()throws InterruptedException,FileNotFoundException {
		
	 WelcomScreenPage welcompage = new WelcomScreenPage(driver);
	  
	  waitForElement (driver, welcompage.Appicon, DefaultTimeout);
	  

	  Assert.assertTrue(welcompage.Appicon.isDisplayed());		
	}


		
}





