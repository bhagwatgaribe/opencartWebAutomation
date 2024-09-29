package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_006_LogoTest extends BaseClass {

	@Test
	public void verifyLogoTest() {
		logger.info("*** Starting TC_006_LogoTest ***");
		try {
			HomePage hp = new HomePage(driver);
			
			boolean logo = hp.checkLogoIsPresent();
			Assert.assertTrue(logo);			
		} catch (Exception e) {
			Assert.fail();
		}
	}
}
