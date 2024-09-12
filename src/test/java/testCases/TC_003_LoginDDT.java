package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_003_LoginDDT extends BaseClass {

	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)
	public void verify_LoginDDT(String email, String pwd, String exp) {

		logger.info("*** Starting TC003_LoginDDT ***");
		try {
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			logger.info("Clicked on My Account");
			hp.clickLogin();
			logger.info("Clicked on Login");

			LoginPage lp = new LoginPage(driver);
			logger.info("Providing login details");
			lp.setEmail(email);
			lp.setPassword(pwd);
			lp.clickLogin();
			logger.info("Clicked on Login button");

			MyAccountPage map = new MyAccountPage(driver);
			logger.info("Validating My Account page is exists or not");
			boolean targetpage = map.isMyAccountPageExists();

			if (exp.equalsIgnoreCase("Valid")) {
				if (targetpage == true) {
					map.clickLogout();
					Assert.assertTrue(true);
				} else {
					Assert.assertTrue(false);
				}
			}

			if (exp.equalsIgnoreCase("Invalid")) {
				if (targetpage == true) {
					map.clickLogout();
					Assert.assertTrue(false);
				} else {
					Assert.assertTrue(true);
				}
			}
		} catch (Exception e) {
			Assert.fail();
		}
	}

}
