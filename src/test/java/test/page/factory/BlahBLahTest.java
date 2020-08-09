package test.page.factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.factory.Guru99HomePageFactory;
import page.factory.Guru99LoginPageFactory;

public class BlahBLahTest {
	
	WebDriver driver;
	Guru99HomePageFactory home;
	Guru99LoginPageFactory login;
	
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		home = new Guru99HomePageFactory(driver);
		login = new Guru99LoginPageFactory(driver);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	}
	
	@Test
	public void SampleTest() {
		String text1 = driver.getTitle();
		System.out.println(text1);
		Assert.assertEquals(text1, "Google");
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
