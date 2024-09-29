package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_005_TabletMenuTest extends BaseClass {

	@Test(groups = {"Regression"})
	public void VerifyTabletMenu() {
		logger.info("*** Starting TC_005_TabletMenuTest ***");
		try {
			HomePage hp = new HomePage(driver);
			String tabletText = hp.checkTabletMenu();
			if (tabletText.equals("Tablets")) {
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
