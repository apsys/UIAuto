package com.test.UIAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	
	private WebDriver driver;

	@FindBy(xpath = "//input[@name='user_name']")
	WebElement userName;

	@FindBy(xpath = "//input[@name='user_password']")
	WebElement password;
	
	@FindBy(id = "submitButton")
	WebElement loginButton;


	public LoginPageFactory(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	public void setUserName(String userName) {
		System.out.println("entering user Name: " + userName);
		this.userName.sendKeys(userName);
	}

	public void setPassword(String password) {
		System.out.println("entering password: " + password);
		this.password.sendKeys(password);
	}
	
	public void clickLogin() {
		System.out.println("clicking login button");
		loginButton.click();
	}


}
