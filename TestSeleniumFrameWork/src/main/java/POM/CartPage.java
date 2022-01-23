package POM;

import java.util.List;
import java.util.function.BooleanSupplier;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage{
	
	By productNameLocator = By.cssSelector("Turbox Tx828 i7 860 16GB Ram 256GB SSD 4GB Ekran Kartý 23.8'' Curved Mon. Masaüstü Oyun Bilgisayarý");
	
public CartPage(WebDriver driver) {
	super(driver);
}

public Boolean checkIfProductAdded() {

	return getProducts().size()>0;
}

private List<WebElement> getProducts(){
	
	return findAll(productNameLocator);
}
	
}
