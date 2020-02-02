package base;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Test {

	private WebDriver driver;

	public void RunTest() {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().setSize(new Dimension (375, 812));
		System.out.println(driver.getTitle());
		//driver.close();
	}

	public static void main(String[] args) {
		Base_Test tests = new Base_Test();
		tests.RunTest();
	}
}
