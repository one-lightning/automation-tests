package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;

public class Base_Tests {

	private WebDriver driver;
	protected HomePage homePage;

	
	public void RunTest() {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		homePage = new HomePage(driver);
		
		driver.quit();

	}

	public static void main(String[] args) {
		Base_Tests tests = new Base_Tests();
		tests.RunTest();
	}
}
