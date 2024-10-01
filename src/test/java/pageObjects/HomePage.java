package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	WebElement lnkMyAccount;

	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement lnkRegister;

	@FindBy(xpath = "//a[normalize-space()='Login']")
	WebElement lnkLogin;

	@FindBy(xpath = "//input[@name='search']")
	WebElement txtSearchBox;

	@FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
	WebElement btnSearch;

	@FindBy(xpath = "//a[normalize-space()='Tablets']")
	WebElement lnkTablet;

	@FindBy(xpath = "//img[@class='img-fluid']")
	WebElement logo;

	@FindBy(xpath = "//span[contains(text(),'Checkout')]")
	WebElement lnkCheckout;

	@FindBy(xpath = "//a[@class='dropdown-toggle']/child::span[contains(text(),'Currency')]")
	WebElement dropdownCurrency;
	
	@FindBy(xpath = "//span[normalize-space()='Wish List (0)']")
	WebElement lnkWishList;
	

	public void clickMyAccount() {
		lnkMyAccount.click();
	}

	public void clickRegister() {
		lnkRegister.click();
	}

	public void clickLogin() {
		lnkLogin.click();
	}

	public void setSearchProduct(String product) {
		txtSearchBox.sendKeys(product);
	}

	public void clickSearch() {
		btnSearch.click();
	}

	public String checkTabletMenu() {
		return (lnkTablet.getText());
	}

	public boolean checkLogoIsPresent() {
		return logo.isDisplayed();
	}

	public boolean checkCheckoutOptionIsPresent() {
		return logo.isDisplayed();
	}

	public String checkCurrencyDropdown() {
		return dropdownCurrency.getText();
	}
	
	public boolean checkWishListOption() {
		return lnkWishList.isDisplayed();
	}
}
