package com.beatO.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class extra {
	
	    private WebDriver driver;

	    @AndroidFindBy(id = "com.healtharx.beato:id/et_number")
	    private WebElement usernameInput;

	    @AndroidFindBy(id = "com.example.app:id/password_input")
	    private WebElement passwordInput;

	    @AndroidFindBy(id = "com.example.app:id/login_button")
	    private WebElement loginButton;

	    public extra(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	    }

	    public void enterUsername(String username) {
	        usernameInput.sendKeys(username);
	    }

	   

}
