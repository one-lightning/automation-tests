package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class MenuElement {

	private WebDriver driver;

	public void RunTest() {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/shifting_content/menu");
		driver.manage().window().fullscreen();
		
		List<WebElement> links = driver.findElements(By.cssSelector("li a"));
		System.out.println(links.size());
	}

	public static void main(String[] args) {
		MenuElement tests = new MenuElement();
		tests.RunTest();
	}
}
