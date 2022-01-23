package Gittigidiyor;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import POM.CartPage;
import POM.Homepage;
import POM.ProductDetailPage;
import POM.ProductsPage;



public class Test_Add_Product_To_Basket extends BaseTest{
	
	public Logger logger = LoggerFactory.getLogger(Logger.class);
	
	Homepage homePage;
	ProductsPage productsPage;
	ProductDetailPage productDetailPage;
	CartPage cartPage;
	
	@Test
	@Order(1)
	public void search_product() {
		homePage = new Homepage(driver);
		productsPage = new ProductsPage(driver);
		homePage.searchBox().search("bilgisayar");
		Assertions.assertTrue(productsPage.isOnProductPage(), "Not on products page!");
	}
	@Order(2)
    public void select_product() {
    	productDetailPage = new ProductDetailPage(driver);
    	productsPage.selectProduct(1);
    	Assertions.assertTrue(productDetailPage.isOnProductDetailPage(), "Not on product detail page!");
		
	}
	@Order(3)
    public void add_product() {
    	productDetailPage.addToBasket();
    	Assertions.assertTrue(homePage.isProductCountUp(), "Product count did not increase");
		
	}
	@Order(4)
    public void go_to_basket() {
    	cartPage = new CartPage(driver);
    	homePage.goToBasket();
    	Assertions.assertTrue(cartPage.checkIfProductAdded(), "Product was not added to basket");
    		
    }

}
