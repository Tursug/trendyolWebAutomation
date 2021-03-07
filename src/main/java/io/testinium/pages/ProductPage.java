package io.testinium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.testinium.base.BasePage;
import io.testinium.constant.ProductPageConstants;

public class ProductPage extends BasePage{
	
	/*Constructor*/
    public ProductPage(WebDriver webDriver){
        super(webDriver);
    }
    
    /*Select Logitech*/
    public void selectLogitech() {
    	WebElement element = webDriver.findElement(ProductPageConstants.LOGITECH_CHECKBOX);
        element.click();
    }
    
    /*Re-Select Logitech*/
    public void deSelectLogitech() {
    	WebElement element = webDriver.findElement(ProductPageConstants.LOGITECH_REMOVE_CHECKBOX);
        element.click();
    }
    
    /*Select A4 Products*/
    public void selectAFourTech() {
    	WebElement element = webDriver.findElement(ProductPageConstants.AFOUR_CHECKBOX);
        element.click();
    }
    
    /*Sort By Price*/
    public void selectCheapest() {
    	Select options = new Select(webDriver.findElement(ProductPageConstants.CHEAPEST));
        options.selectByIndex(1);
    }
    
    /*Click Cheapest Product*/
    public void clickCheapest() {
    	WebElement element = webDriver.findElement(ProductPageConstants.CHEAPEST_ITEM);
        element.click();
    }
    
    
    
}
