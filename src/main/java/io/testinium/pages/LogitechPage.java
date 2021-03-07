package io.testinium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.testinium.base.BasePage;
import io.testinium.constant.LogitechPageConstants;

public class LogitechPage extends BasePage{
	
	/*Constructor*/
    public LogitechPage(WebDriver webDriver){
        super(webDriver);
    }
    
    /*Return Comment Number*/
    public void getCommentNumber() {
    	WebElement commentNumber = webDriver.findElement(LogitechPageConstants.COMMENT_NUMBER);
    	System.out.println(commentNumber.getText());
    }
    
    /*Return Rating Number*/
    public void getRatingNumber() {
    	WebElement ratingNumber = webDriver.findElement(LogitechPageConstants.RATING_NUMBER);
    	System.out.println(ratingNumber.getText());
    }
    
}
