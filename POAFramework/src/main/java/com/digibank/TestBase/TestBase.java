package com.digibank.TestBase;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TestBase {
	
	//Appium Driver
	protected AppiumDriver<MobileElement> driver;
	//Default Timeout
	protected final int DefaultTimeout = 3000;
	
	public void defineDriver(){
		DesiredCapabilities dc=new DesiredCapabilities();
		/*dc.setCapability("browserName","");*/		
		dc.setCapability("deviceName","DUM0220110006769");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","10");
		dc.setCapability("automationName","UiAutomator2");
		dc.setCapability("app","C:\\Users\\kallu\\Documents\\digitalbank\\digitalbank-uatreleasewithskip-2021-03-04_v1.apk");

	}

}
