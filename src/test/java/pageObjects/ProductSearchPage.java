package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductSearchPage extends BasePage{

	WebDriverWait wait;
	public ProductSearchPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath = "//a[normalize-space()='MacBook Pro']")
	WebElement txtMackbook;
	
	public String isSearchedproductExists() {
		try {
			return txtMackbook.getText();
		} catch (Exception e) {
			return null;
		}		
	}
}
