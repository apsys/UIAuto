package com.test.UIAuto;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPageObject {

	private WebDriver driver;
	private final String xpath_logo = "//*[@id='hplogo']";

	public LoginPageObject(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean findDisplayed() {
		WebElement elemnt = driver.findElement(By.xpath(xpath_logo));
		Boolean b = elemnt.isDisplayed();
		return b;
	}
	
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	
}
