package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass {

	@Test
	public void verify_Login() {

		logger.info("*** Starting TC002_LoginTest ***");
		try {
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			logger.info("Clicked on My Account");
			hp.clickLogin();
			logger.info("Clicked on Login");

			LoginPage lp = new LoginPage(driver);
			logger.info("Providing login details");

			lp.setEmail(p.getProperty("email"));
			lp.setPassword(p.getProperty("password"));

			lp.clickLogin();
			logger.info("Clicked on Login button");

			MyAccountPage map = new MyAccountPage(driver);

			logger.info("Validating My Account page is exists or not");
			boolean targetPage = map.isMyAccountPageExists();

			Assert.assertTrue(targetPage);
		} catch (Exception e) {
			Assert.fail();
		}
	}
}
