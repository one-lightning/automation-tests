package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {

	public WebDriver driver;

	
	public void RunTest() {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
		inputsLink.click();
		System.out.println(driver.getTitle());
		//driver.quit();
	}

	public static void main(String[] args) {
		BaseTests tests = new BaseTests();
		tests.RunTest();
	}
}
