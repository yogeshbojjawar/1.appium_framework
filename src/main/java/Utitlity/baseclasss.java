package Utitlity;

import java.net.MalformedURLException;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class baseclasss  {
	
	Readconfig readconfig=new Readconfig();  //as soon as u create object it invoke constructor and invoke configuration file
	
	public String automationName=readconfig.getautomationName();
	public String platformName=readconfig.getplatformName();
	public String UDID=readconfig.getUDID();
	public String deviceName=readconfig.getDeviceName();
	public String APPLocation=readconfig.getAPPpath();

	
	 public static AndroidDriver<WebElement> driver;
		

		
		@BeforeClass
		public void settup()throws MalformedURLException {
			
			DesiredCapabilities dc= new DesiredCapabilities();

			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, automationName);
			
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
			
		//dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, 78);
			
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
			dc.setCapability(MobileCapabilityType.UDID, UDID);
			
			dc.setCapability(MobileCapabilityType.APP, APPLocation);
			
			

				
			
			URL url=new URL("http://127.0.0.1:4723/wd/hub");    //in appium 2.0,no need to write the "wd/hub"
			
			driver= new AndroidDriver<WebElement>(url,dc);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//	        driver.findElementById("com.healtharx.beato:id/et_number").sendKeys("8149593940");
//			
//			driver.findElementById("com.healtharx.beato:id/tv_verify").click();
			

}
}
