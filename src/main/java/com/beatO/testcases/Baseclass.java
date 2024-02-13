package com.beatO.testcases;

import java.net.MalformedURLException;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beatO.pageobject.Onboarding;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Baseclass  {

	
	   AndroidDriver<WebElement> driver;
		

		
		@BeforeClass
		public void settup()throws MalformedURLException {
			
			DesiredCapabilities dc= new DesiredCapabilities();

			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
			
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			
		//dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, 78);
			
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
			dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
			
			dc.setCapability(MobileCapabilityType.APP,"C:\\Users\\Yogesh\\Downloads\\seleniumPractice\\app-release (1).apk");
			
			

				
			
			URL url=new URL("http://127.0.0.1:4723/wd/hub");    //in appium 2.0,no need to write the "wd/hub"
			
			driver= new AndroidDriver<WebElement>(url,dc);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//	        driver.findElementById("com.healtharx.beato:id/et_number").sendKeys("8149593940");
//			
//			driver.findElementById("com.healtharx.beato:id/tv_verify").click();
			
			
			

		
		
}
		
		

		
		}



	


