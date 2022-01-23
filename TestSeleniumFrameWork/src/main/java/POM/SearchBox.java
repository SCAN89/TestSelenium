package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage{
	
	By searchBoxLocator = By.cssSelector("sc-4995aq-0 sc-14oyvky-0 gHqOYK");
	By submitButtonLocator = By.cssSelector("qjixn8-0 sc-1bydi5r-0 cZmXaL bUdQbp");
	
	public SearchBox(WebDriver driver) {
		super(driver);
	}
	
	public void search(String text) {
		type(searchBoxLocator, text);
		click(submitButtonLocator);
	}

}
