package POM;

import java.util.List;
import java.util.function.BooleanSupplier;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage extends BasePage{
	
	By shippingOptionLocator = By.cssSelector("sc-84am1q-0 sc-1r48nyr-0 kSHKaN cOEmMu");
	By productNameLocator = By.cssSelector("sc-1ku3a4v-0 sc-7u3xly-0 clhtrN jytHfD sc-1n49x8z-16 fzmRLa");
	
	public ProductsPage(WebDriver driver) {
		super(driver);
	}

	public Boolean isOnProductPage() {
		
		return isDisplayed(shippingOptionLocator);
	}

	public void selectProduct(int i) {
		getAllProducts().get(i).click();
		
	}
	
	private List<WebElement> getAllProducts(){
		return findAll(productNameLocator);
	}
}
