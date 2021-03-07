package io.testinium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.testinium.base.BasePage;
import io.testinium.constant.AFourPageConstants;

public class AFourPage extends BasePage{
	
	/*Constructor*/
    public AFourPage(WebDriver webDriver){
        super(webDriver);
    }
    
    /*Add to Cart*/
    public void addToBasket(){
    	WebElement element = webDriver.findElement(AFourPageConstants.ADD_TO_CART);
        element.click();
    }
	
}
