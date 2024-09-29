package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_007_CheckoutOptionTest extends BaseClass{

	@Test(groups = {"Regression"})
	public void validateCheckOutOption() {
		try {
			logger.info("*** Starting TC_007_CheckoutOptionTest ***");
			
			HomePage hp = new HomePage(driver);
			boolean checkoutOption = hp.checkCheckoutOptionIsPresent();
			Assert.assertTrue(checkoutOption);
		} catch (Exception e) {
			Assert.fail();
		}
	}
}
