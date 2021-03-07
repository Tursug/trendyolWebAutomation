package io.testinium.base;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	protected static WebDriver webDriver;
	WebDriverWait wait;
	
	/*Constructor*/
    public BasePage(WebDriver driver) {
        webDriver = driver;
        wait = new WebDriverWait(webDriver, 1000);
    }
    
    /*Print Title*/
    public void getTitle() {
    	System.out.println(webDriver.getTitle());
    }
    
    /*Wait Element*/
    public void waitElement(By by) {
    	WebDriverWait wait = new WebDriverWait(webDriver, 10);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
   
    /*Tabs*/
    public ArrayList<String> Tabs()    {
    	ArrayList<String> tabs = new ArrayList<String>(webDriver.getWindowHandles());
        return(tabs);
     }
    
    /*Switch to New Tab*/
    public void switchToNewTab() {
    	ArrayList<String> tabs = Tabs();
    	webDriver.switchTo().window(tabs.get(1));
    }
    
    /*Switch to Previous Tab*/
    public void switchToPreviousTab() {
    	ArrayList<String> tabs = Tabs();
    	webDriver.close();
    	webDriver.switchTo().window(tabs.get(0));
    }
    
    
}

