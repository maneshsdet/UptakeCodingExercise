package com.pom.uptake.Uptake;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pom.uptake.base.TestBase;
import com.pom.uptake.pages.HomePage;
import com.pom.uptake.pages.ProductsPage;

public class HomePageTest extends TestBase {
	HomePage homepage;
	ProductsPage productpage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		try {
			intialization();
		} catch (IOException e) {
			e.printStackTrace();
		}
		homepage = new HomePage();
		productpage = homepage.ClickProduct();
	}
	
	
	@Test(priority =1)
	public void verifyPRODUCTStextTest() {
		String Productstext = productpage.validateProductsText();
		Assert.assertEquals(Productstext, "PRODUCTS");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
