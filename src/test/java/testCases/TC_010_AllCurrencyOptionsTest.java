package testCases;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_010_AllCurrencyOptionsTest extends BaseClass{
	
	HomePage hp;
	
	@Test(groups = "Regression")
	public void validateCurrencyOptions() {
		
		List<String> expectedOptions = Arrays.asList("€ Euro", "£ Pound Sterling","$ US Dollar");
		
		try {
			List<String> actualOptions = hp.getAllCurrencyOptions();
			Assert.assertEquals(actualOptions, expectedOptions);
		} catch (AssertionError e) {
			System.out.println("Assertion error occurred: " + e.getMessage());
            throw e; 
		} catch (Exception e){
			System.out.println("An unexpected error occurred during the test: " + e.getMessage());
		}
	}
}
