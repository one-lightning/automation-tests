package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class BaseTest {

	private WebDriver driver;

	public void RunTest() {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().fullscreen();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		
		WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
		inputsLink.click();
		
		
		System.out.println(driver.getTitle());
		//driver.close();
	}

	public static void main(String[] args) {
		BaseTest tests = new BaseTest();
		tests.RunTest();
	}
}
