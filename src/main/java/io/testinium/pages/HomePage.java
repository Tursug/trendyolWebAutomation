package io.testinium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.testinium.base.BasePage;
import io.testinium.constant.HomePageConstants;

public class HomePage extends BasePage{
	
	/*Constructor*/
    public HomePage(WebDriver webDriver){
        super(webDriver);
    }
    
    /*Select Male*/
    public void selectMale(){
    	WebElement element = webDriver.findElement(HomePageConstants.MALE_IMAGE);
        element.click();
    }

}
