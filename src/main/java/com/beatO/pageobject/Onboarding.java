package com.beatO.pageobject;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Onboarding {
	
	 AndroidDriver<WebElement> driver;
	//driver.findElementById("com.healtharx.beato:id/et_number").sendKeys("9820123456");

//	    @AndroidFindBy(id = "com.healtharx.beato:id/et_number")
//	    private WebElement userNum;
//	    
//	    @AndroidFindBy(xpath = "//*[contains(@text, 'Enter 10 digit mobile number')]")
//	    private WebElement userNum;
//	
	    @FindBy(id = "com.healtharx.beato:id/et_number")
	    private WebElement userNum;
        

	    @FindBy(id ="com.healtharx.beato:id/tv_verify")
	    private WebElement clickonverify;
	    
	    @FindBy(id = "com.healtharx.beato:id/edt_otp")
	    private WebElement enterOTP;

	    
	    @FindBy(id = "com.healtharx.beato:id/ll_greeting")
	    private WebElement welcomepage;
	    
	    @FindBy(id = "com.healtharx.beato:id/et_name")
	    private WebElement username;
	    

	    
	    @FindBy(id  = "com.healtharx.beato:id/spinner_yob")
	    private WebElement birthyear;

	    
	    @FindBy(id = "com.healtharx.beato:id/rb_male" )
	    private WebElement gender;
	    
	    @FindBy(id = "com.healtharx.beato:id/tv_submit")
	    private WebElement proceed;
	///////////////////    
	    @FindBy(id = "com.healtharx.beato:id/spinner_diabetes_type")
	    private WebElement diabetictype;
	    
	    @FindBy(id = "com.healtharx.beato:id/checkbox_caregiver")
	    private WebElement havecaregiver;
	    
	    @FindBy(id = "com.healtharx.beato:id/tv_submit")
	    private WebElement submit;
	    
	    @FindBy(id = "com.healtharx.beato:id/et_caregiver")
	    private WebElement caregivername;

	    @FindBy(id = "com.healtharx.beato:id/et_caregiver_number")
	    private WebElement caregivernumber;
	    
	    @FindBy(id ="com.healtharx.beato:id/spinner_relationship")
	    private WebElement caregiverrelation;
	    
	    @FindBy(id ="com.healtharx.beato:id/tv_next")
	    private WebElement next;
	    
	    @AndroidFindBy(accessibility = "Ok")
	    private WebElement verifypopup;
	    
	   

	    public Onboarding(AndroidDriver<WebElement> driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	        }

	    public void enterPhonenum(String phonenum) {
	    	userNum.sendKeys(phonenum);
	    }

		public void verify() {
		  clickonverify.click();	
		}

		public void verifypopup() {
			verifypopup.click();	
		}

		public void OTPadded(String OTP) {
	        enterOTP.sendKeys(OTP);
	    }
		
		public void enterName(String name) {
			username.sendKeys(name);	
		}
		
		public void yearbirth(){
			birthyear.click();
	    }
		
		public void selectgender() {
			gender.click();	
		}
		
		public void clickonproceed() {
			proceed.click();	
		}
		
		public void selectdiabetic() {
			diabetictype.click();	
		}
		public void clickoncaregiver() {
			havecaregiver.click();	
		}
		public void clickonsubmit() {
			submit.click();	
		}
		public void entercaregivername(String name) {
			caregivername.sendKeys(name);;	
		}
		public void entercaregivernum(String numb) {
			caregivernumber.sendKeys(numb);;	
		}
		public void clickonrelationship() {
			caregiverrelation.click();	
		}

		public void clickonnext() {
			next.click();
			
		}
}
