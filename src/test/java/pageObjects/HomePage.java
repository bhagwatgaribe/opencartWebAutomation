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
}
