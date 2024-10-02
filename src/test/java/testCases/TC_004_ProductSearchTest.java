package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProductSearchPage;
import testBase.BaseClass;

public class TC_004_ProductSearchTest extends BaseClass{

	@Test(groups = {"Regression"})
	public void VerifyProductSearch() {
		logger.info("*** Starting TC_004_ProductSearchTest ***");
		try {
			HomePage hp = new HomePage(driver);
			hp.setSearchProduct("MacBook Pro");
			logger.info("Entered product name for searching");
			
			hp.clickSearch();
			logger.info("Clicked on search button");
			
			ProductSearchPage psp = new ProductSearchPage(driver);
			
			logger.info("Validating product is available or not");
			String product = psp.isSearchedproductExists();
			Assert.assertEquals(product,"MacBook Pro");
			
		} catch (Exception e) {
			Assert.fail();
		}
	}
}
