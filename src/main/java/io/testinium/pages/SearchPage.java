package io.testinium.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.testinium.base.BasePage;
import io.testinium.constant.SearchPageConstants;

public class SearchPage extends BasePage{

	/*Constructor*/
    public SearchPage(WebDriver webDriver){
        super(webDriver);
    }

    /*Search Webcam*/
    public void searchWebCam(){
    	WebElement searchInput = webDriver.findElement(SearchPageConstants.SEARCH_BOX);
        searchInput.sendKeys("webcam");
        searchInput.sendKeys(Keys.ENTER);
    }

}
