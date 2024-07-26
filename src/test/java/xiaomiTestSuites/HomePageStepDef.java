package xiaomiTestSuites;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utils;
import Pages.HomePage;
import Pages.ProductPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDef {

	@Given("admin is on the homepage")
	public void admin_is_on_homepage() throws Exception {
		Config.confchrome();
		Config.driver = new ChromeDriver();
		Config.maximizeWindow();
		Config.driver.get(Utils.getproperty("Web_Porta_Link"));
	}

	@When("admin hovers over the menu {string}")
	public void admin_mousehover_on_menu(String menu) throws Exception {

		HomePage page = new HomePage();
		page.selectMenu(menu);

	}

	@When("admin clicks on the submenu {string}")
	public void admin_click_on_subMenuName(String subMenuName) throws InterruptedException {
		HomePage page = new HomePage();
		page.clickOnSubMenu(subMenuName);
		// Thread.sleep(5000);

	}

	@When("admin clicks on product {string}")
	public void admin_click_on_product(String productName) throws InterruptedException {
		ProductPage productPage = new ProductPage();
		productPage.clickOnProduct(productName);
		// Thread.sleep(5000);

	}

	@When("admin add the product to the shopping cart")
	public void admin_click_on_add_to_cart() throws InterruptedException {
		ProductPage productPage = new ProductPage();
		productPage.clickOnAddToCart();

	}

	@When("admin clicks on cart button")
	public void admin_clicks_on_cart_button() throws InterruptedException {
		ProductPage productPage = new ProductPage();
		productPage.clickOnCartBtn();
	}

	@When("admin clicks on show cart button")
	public void admin_clicks_on_show_cart_button() throws InterruptedException {
		ProductPage productPage = new ProductPage();
		productPage.clickOnShowCart();

	}

	@Then("admin is directed to the page that contains the message {string}")
	public void admin_is_directed_to_the_page_that_contains_message(String ExpectedMessage) throws Exception {

		ProductPage productPage = new ProductPage();
		// Thread.sleep(8000);
		// productPage.closePopup();
		String actualMessage = productPage.verification();
		Assert.assertEquals(ExpectedMessage, actualMessage);
	}

	@Then("admin is directed to the page that contains the message {string} and the product name {string}")
	public void admin_is_directed_to_the_cart_page(String ExpectedMessage, String expectedProductName) throws Exception {

		ProductPage productPage = new ProductPage();
		// Thread.sleep(8000);
		// productPage.closePopup();
		String actualMessage = productPage.cartPageVerification();
		String actualProductName = productPage.productNameVerfifcation();
		Assert.assertEquals(ExpectedMessage, actualMessage);
		Assert.assertEquals(expectedProductName, actualProductName);
	}
	@Then("admin is directed to the page that contains the product name {string}")
	public void admin_is_directed_to_the_page_that_contains_product_name(String ExpectedMessage) throws Exception {

		ProductPage productPage = new ProductPage();
		// Thread.sleep(8000);
		// productPage.closePopup();
		String actualMessage = productPage.productVerification();
		Assert.assertEquals(ExpectedMessage, actualMessage);
	}
}
