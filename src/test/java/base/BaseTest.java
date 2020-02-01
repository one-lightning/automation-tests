package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	private WebDriver driver;

	public void RunTest() {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com/");
		System.out.println(driver.getTitle());
		driver.close();
	}

	public static void main(String[] args) {
		BaseTest tests = new BaseTest();
		tests.RunTest();
	}
}
