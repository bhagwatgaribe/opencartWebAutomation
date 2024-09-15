package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass {

	@Test
	public void verifyAccountRegistration() throws InterruptedException {
		logger.info("*** Starting TC001_AccountRegistrationTest ***");
		try {
			HomePage hp = new HomePage(driver);
			AccountRegistrationPage regpage = new AccountRegistrationPage(driver);

			hp.clickMyAccount();
			logger.info("Clicked on MyAccount Link");

			hp.clickRegister();
			logger.info("Clicked on Register Link");

			logger.info("Providing customer details");
			regpage.setFirstName("John");
			regpage.setLastName("Nicholas");
			regpage.setEmail(randomstring() + "@gmail.com");
			regpage.setPhoneNumber("1234567890");

			String password = randomAlphaNumeric();
			regpage.setPassword(password);
			regpage.setPasswordConfirm(password);

			regpage.clickPrivacyPolicy();
			regpage.clickContinue();

			logger.info("Validating expected message");
			String confmsg = regpage.getConfirmationMsg();

			if (confmsg.equals("Your Account Has Been Created!")) {
				Assert.assertTrue(true);
			} else {
				logger.error("Test failed...");
				logger.debug("Debuge logs...");
				Assert.assertTrue(false);
			}
		} catch (Exception e) {
			Assert.fail();
		}
	}
}
