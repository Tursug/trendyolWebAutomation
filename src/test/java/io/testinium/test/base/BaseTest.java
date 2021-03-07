package io.testinium.test.base;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	protected static WebDriver webDriver;
	
	/*Setup Driver*/
    @BeforeClass
    public static void before(){
        WebDriverManager.chromedriver().setup();
        
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-notifications");
        options.addArguments("test-type");
        
        webDriver = new ChromeDriver(options);
        webDriver.get("https://www.trendyol.com");
    }
    
    /*Quit Driver*/
    @AfterClass
    public static void after() {
    	webDriver.quit();
    }

}
