package com.beatO.testcases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beatO.pageobject.Onboarding;

import Utitlity.baseclasss;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileBy.ByAccessibilityId;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.remote.MobileCapabilityType;

public class Login extends Baseclass {
	
//@BeforeTest
//public void setup() throws MalformedURLException {
//	DesiredCapabilities dc= new DesiredCapabilities();
//
//	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
//	
//	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//	
////dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, 78);
//	
//	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
//	dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
//	
//	dc.setCapability(MobileCapabilityType.APP,"C:\\Users\\Yogesh\\Downloads\\seleniumPractice\\app-release (1).apk");
//	
//
//		
//	
//	URL url=new URL("http://127.0.0.1:4723/wd/hub");
//	
//	driver= new AndroidDriver<WebElement>(url,dc);
//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	
//    
//}
@Test

public void appaction() throws InterruptedException {
	//driver.findElementById("com.healtharx.beato:id/et_number").sendKeys("9820123456");
	try {
	Onboarding onboard=new Onboarding(driver);
	//driver.findElement(MobileBy.AccessibilityId("Enter 10 digit mobile number")).sendKeys("9820123457");
	onboard.enterPhonenum("9820123456");
	onboard.verify();
	onboard.OTPadded("123456");
	onboard.enterName("test");
	onboard.yearbirth();
	//driver.findElements(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView")).get(2).click();;
	List<WebElement> yob=driver.findElements(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView"));
	for(WebElement options : yob) {
		if(options.getText().equals("1941")) {
			options.click();
			break;
		}
	}
		
	//driver.findElementById("com.healtharx.beato:id/custom_spinner_text").sendKeys("1942");	
    onboard.selectgender();
    onboard.clickonproceed();
    onboard.selectdiabetic();
    

List<WebElement> typediabetic=driver.findElements(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView"));
System.out.println(typediabetic.size());
for(WebElement options2 : typediabetic) {
	if(options2.getText().equalsIgnoreCase("Type 2 Diabetic")) {
		options2.click();
		break;
	}
}

onboard.clickoncaregiver();
onboard.clickonsubmit();
onboard.entercaregivername("test caregiver");
onboard.entercaregivernum("9820123456");
onboard.clickonrelationship();

List<WebElement> relationship=driver.findElements(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView"));
for(WebElement options3 : relationship) {
	if(options3.getText().equalsIgnoreCase("father")) {
		options3.click();
		break;
	}
}
onboard.clickonsubmit();

List<WebElement> path=driver.findElements(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup"));
System.out.println(path.size());
path.get(0);
onboard.clickonnext();
}
catch(Exception e) {
	System.out.println(e.getMessage());
	System.out.println(e.getCause());
	e.printStackTrace();
	
}
	
//driver.findElementById("com.healtharx.beato:id/et_number").sendKeys("8149593940");
//	
//	driver.findElementById("com.healtharx.beato:id/tv_verify").click();
	
	
}
}
