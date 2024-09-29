package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_008_CurrencyDropdownTest extends BaseClass{
	
	@Test(groups = {"Regression"})
	public void validateCurrencyDropdown() {
		try {
			logger.info("*** Starting TC_008_CurrencyDropdownTest ***");
			
			HomePage hp = new HomePage(driver);
			String text = hp.checkCurrencyDropdown();
			Assert.assertEquals(text, "Currency");
			
		} catch (Exception e) {
			Assert.fail();
		}
	}
}
