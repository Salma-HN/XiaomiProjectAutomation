package Pages;

import java.time.Duration;
//import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePage {

	
	@FindBy(xpath = "//*[@id[starts-with(., 'menu-1')]]/li")
	List<WebElement> menus;

	@FindBy(xpath = "//*[@id[starts-with(., 'menu-1')]]/li[3]//section/div//h4")
	List<WebElement> submenus;

	
	public HomePage() {
		PageFactory.initElements(Config.driver, this);
	}

	

	public void selectMenu(String menuName) throws Exception {
		//Thread.sleep(6000);

		for (WebElement menu : menus) {
			System.out.println(menu.getText());
			if (menu.getText().contains(menuName)) {
				// menu.click();

				Config.actions = new Actions(Config.driver);
				Config.actions.moveToElement(menu).build().perform();
				Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				}
			
			}
		}
	

	public void clickOnSubMenu(String subMenuName) {

		for (WebElement subMenu : submenus) {
			if (subMenu.getText().contains(subMenuName)) {
				subMenu.click();
				break;
			}
		}

	}

	
}
