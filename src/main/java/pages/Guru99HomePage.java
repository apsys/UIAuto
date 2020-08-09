package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Guru99HomePage {

	WebDriver driver;

	private static String homePageun_xpath = "//table//tr[@class='heading3']";

	public Guru99HomePage(WebDriver driver){
		
		this.driver = driver;
	}

	//Get the User name from Home Page
	public String getHomePageDashboardUserName() {

		WebElement homePage = driver.findElement(By.xpath(homePageun_xpath));
		return homePage.getText();
	}
}