package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_009_WishListOptionTest extends BaseClass{
	
	@Test
	public void verifyWishListOption() {
		try {
			logger.info("*** Starting TC_009_WishListOptionTest *** ");
			HomePage hp = new HomePage(driver);
			boolean wishList = hp.checkWishListOption();
			
			Assert.assertTrue(wishList);
			
		} catch (Exception e) {
			Assert.fail();
		}
	}

}
