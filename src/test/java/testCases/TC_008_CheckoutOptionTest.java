package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_008_CheckoutOptionTest extends BaseClass {

	@Test(groups = { "Regression" })
	public void TC003_validateCheckOutOption() {
		try {
			logger.info("*** Starting TC003_CheckoutOptionTest ***");

			HomePage hp = new HomePage(driver);
			boolean checkoutOption = hp.checkCheckoutOptionIsPresent();
			Assert.assertTrue(checkoutOption);
		} catch (Exception e) {
			Assert.fail();
		}
	}
}
