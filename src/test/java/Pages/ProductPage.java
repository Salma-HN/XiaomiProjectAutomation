package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class ProductPage {
	
	@FindBy(xpath = "//*[@id=\"main\"]/header/h1")
	WebElement verif;
	
	@FindBy(xpath = "//*[@id=\"main\"]/div[3]/div/div//h3/a")
	List<WebElement> products;
	
	@FindBy(xpath = "//*[@id[starts-with(., 'product-')]]/div[1]/div/div[1]/div/div[1]/h1")
	WebElement productName;
	
	@FindBy(name = "add-to-cart")
	WebElement addToCart;
	
	@FindBy(xpath = "//*[@id[starts-with(., 'cart-')]]/a/span/span")
	WebElement cartBtn;
	
	@FindBy(xpath = "//*[@id[starts-with(., 'cart-')]]/div/div[2]//div[1]/p[2]/a[1]")
	WebElement showCart;
	
	@FindBy(className = "page-title")
	WebElement cartPageTitle;
	
	@FindBy(xpath = "//*[@class='product-info']/span/a")
	WebElement productNameCart;
	
	
	public ProductPage() {
		PageFactory.initElements(Config.driver, this);
	}

	
	public String verification() {
		String verifMessage = verif.getText();
		return verifMessage;
	}
	
	public String productVerification() {
		String verifProductName = productName.getText();
		return verifProductName;
	}
	
	public String productNameVerfifcation() {
		String verifProductNameCart = productNameCart.getText();
		return verifProductNameCart;
	}
	
	public String cartPageVerification() {
		String verifCartPage = cartPageTitle.getText();
		return verifCartPage;
	}
	public void clickOnProduct(String productName) {

		for (WebElement product : products) {
			if (product.getText().contains(productName)) {
				product.click();
				break;
			}
		}

	}
	public void clickOnAddToCart() {
		addToCart.click();
	}
	
	public void clickOnCartBtn() {
		cartBtn.click();
	}
	
	public void clickOnShowCart() {
		showCart.click();
	}
	 

}
