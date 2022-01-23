package POM;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage extends BasePage{
	
	SearchBox searchBox;
	By basketCountLocator = By.cssSelector("notify-user basket-item-count");
	By basketContainerLocator = By.cssSelector("basket-icon-container");
	
	public Homepage(WebDriver driver) {
		super(driver);
		searchBox = new SearchBox(driver);
	}

	public SearchBox searchBox(){
		return this.searchBox;
		
	}

	public Boolean isProductCountUp() {
		return getBasketCount()>0;
	}

	public void goToBasket() {
		click(basketContainerLocator);
		
	}
	
	private int getBasketCount() {
		
		String count = find(basketCountLocator).getText();
		return Integer.parseInt(count);
	}

}
