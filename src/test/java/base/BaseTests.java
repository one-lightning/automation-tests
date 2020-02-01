package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {

	private WebDriver driver;

	
	public void RunTest() {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		//driver.quit();
	}

	public static void main(String[] args) {
		BaseTests tests = new BaseTests();
		tests.RunTest();
	}
}
