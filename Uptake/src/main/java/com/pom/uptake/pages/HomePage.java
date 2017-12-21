package com.pom.uptake.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pom.uptake.base.TestBase;

public class HomePage extends TestBase {
	WebDriverWait wait = new WebDriverWait(driver,30);

	// Page Factory
	@FindBy(xpath = "//h1[@class = 'hero-heading__subheading']")
	WebElement homepagetext;
	
	@FindBy(linkText = "PRODUCTS")
	WebElement ProductLink;

	
	// Intializing PageObjects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String validateHomePageTitle() {
		return driver.getTitle();
	}

	public void waitForVisibility() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class,'btn__text') and contains(text(), 'Put Your Data to Work')]")));
	}
	public String validateUptakeProductstext() {
		return homepagetext.getText();
	}
	
	public ProductsPage ClickProduct() {
		ProductLink.click();
		
		return new ProductsPage();
		
	}

		// TODO Auto-generated method stub
		
	}

