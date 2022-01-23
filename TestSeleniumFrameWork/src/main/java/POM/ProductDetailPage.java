package POM;

import java.util.function.BooleanSupplier;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {
	
	By addToBasketButtonLocator = By.id("add-to-basket");
	
	public ProductDetailPage(WebDriver driver) {
		super(driver);
	}

	public Boolean isOnProductDetailPage() {
		return isDisplayed(addToBasketButtonLocator);
	}

	public void addToBasket() {
		click(addToBasketButtonLocator);
		
	}

}
