package login;

import org.testng.annotations.Test;

import base.BaseTests;
import junit.framework.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTests extends BaseTests {
	
	@Test
	public void testSuccessfulLogin() {
		HomePage homePage = new HomePage(driver);

		LoginPage loginPage = homePage.clickFormAuthentication();

		loginPage.setUsername("tomsmith");
		loginPage.setPassword("SuperSecretPassword!");

		SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
		Assert.assertEquals(secureAreaPage.getAlertText(), "You logged into a secure area! x",
				"Alert text is incorrect");
	}
}