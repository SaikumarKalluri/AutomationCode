package com.digitalbank.pages.welcompage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class WelcomScreenPage {

	public WelcomScreenPage(AppiumDriver<MobileElement> driver ){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id="il.co.firstdigitalbank:id/circleIndicator")
	public MobileElement Appicon;
	
	@AndroidFindBy(id="il.co.firstdigitalbank:id/txtHeader")
	public MobileElement Title;
	
	@AndroidFindBy(id="il.co.firstdigitalbank:id/txtDesc")
	public MobileElement Description;
	
	@AndroidFindBy(id="il.co.firstdigitalbank:id/terms_of_use_tv")
	public MobileElement Termsofuse;
	
	@AndroidFindBy(id="il.co.firstdigitalbank:id/privacy_statement_tv")
	public MobileElement Privacy;
	
	@AndroidFindBy(id="il.co.firstdigitalbank:id/btnOnboardingContinue")
	public MobileElement OpenAccount;
	
	@AndroidFindBy(id="il.co.firstdigitalbank:id/tvOnboardingLogIn")
	public MobileElement Login;
	
	public void Appicon(){
		Appicon.isDisplayed();
	}
	
}
