package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductSearchPage extends BasePage{

	public ProductSearchPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[normalize-space()='MacBook']")
	WebElement txtMackbook;
	
	public boolean isSearchedproductExists() {
		try {
			return (txtMackbook.isDisplayed());
		} catch (Exception e) {
			return false;
		}		
	}
}
