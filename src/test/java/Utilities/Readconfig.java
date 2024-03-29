package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
	
Properties pro;       //import from java.util
	
	public Readconfig() {
		
		File src= new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src);           //when u have to read the data in read mode then we use fileinputstream
			pro=new Properties();
			pro.load(fis);                                         //load and read the file
			}
		catch(Exception e) {
			System.out.println("Exception is" + e.getMessage());
			
		}
	}
		
		
		public String getautomationName() {
			String autoamtion_name=pro.getProperty("automationName");
			return autoamtion_name;
		}
		 
		public String getplatformName(){
			String platform_name=pro.getProperty("platformName");
			return platform_name;
		}
			
		public String getUDID() {
			String UDID=pro.getProperty("UDID");      //they are case sensitive, check before executing
			return UDID;
		}
		
		
		public String getDeviceName() {
			String device_name=pro.getProperty("deviceName");
			return device_name;	
		}
		
		public String getAPPpath() {
			String app_Path=pro.getProperty("APPLocation");
			return app_Path;	
		}

}
