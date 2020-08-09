package pages;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Guru99LoginPage {

	WebDriver driver;
	private final String name_id = "uid";
	private final String name_password = "password";
	private final String title_class = "barone";
	private final String login_name = "btnLogin";

	public Guru99LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	//Set user name in textbox
	public void setUserName(String strUserName) {
		WebElement elementId = driver.findElement(By.name(name_id));
		elementId.sendKeys(strUserName);
	}

	//Set password in password textbox
	public void setPassword(String strPassword) {
		WebElement password = driver.findElement(By.name(name_password));
		password.sendKeys(strPassword);
	}

	//Click on login button
	public void clickLogin(){
		WebElement login = driver.findElement(By.name(login_name));
		login.click();
	}

	//Get the title of Login Page
	public String getLoginTitle(){
		WebElement title = driver.findElement(By.className(title_class));
		return title.getText();
	}

	/**
	 * This POM method will be exposed in test case to login in the application
	 * @param strUserName
	 * @param strPasword
	 * @return
	 */

	public void loginToGuru99(String strUserName, String strPasword) {
		//Fill user name
		this.setUserName(strUserName);
		//Fill password
		this.setPassword(strPasword);
		//Click Login button
		this.clickLogin();        
	}
}