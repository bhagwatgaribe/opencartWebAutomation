package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_007_CurrencyDropdownTest extends BaseClass{

	@Test(groups = { "Regression" })
	public void TC002_validateCurrencyDropdown() {
		try {
			logger.info("*** Starting TC002_CurrencyDropdownTest ***");

			HomePage hp = new HomePage(driver);
			String text = hp.checkCurrencyDropdown();
			Assert.assertEquals(text, "Currency");

		} catch (Exception e) {
			Assert.fail();
		}
	}
}
