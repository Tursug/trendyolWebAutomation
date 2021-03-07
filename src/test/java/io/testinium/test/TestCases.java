package io.testinium.test;

import org.junit.Test;

import io.testinium.constant.HomePageConstants;
import io.testinium.constant.ProductPageConstants;
import io.testinium.constant.SearchPageConstants;
import io.testinium.pages.AFourPage;
import io.testinium.pages.HomePage;
import io.testinium.pages.LogitechPage;
import io.testinium.pages.ProductPage;
import io.testinium.pages.SearchPage;
import io.testinium.test.base.BaseTest;

public class TestCases extends BaseTest{
	
	/*Select Male Photo*/
    @Test
    public void selectMale(){
    	HomePage homePage = new HomePage(webDriver);
    	homePage.waitElement(HomePageConstants.MALE_IMAGE);
    	homePage.selectMale();
    }
    
    /*Search WebCam*/
    @Test
    public void searchWebCam() {
    	SearchPage searchPage = new SearchPage(webDriver);
    	searchPage.waitElement(SearchPageConstants.SEARCH_BOX);
    	searchPage.searchWebCam();
    }
    
    /*Select Cheapest Logitech*/
    @Test
    public void selectCheapestLogitech(){
    	ProductPage productPage = new ProductPage(webDriver);
    	productPage.waitElement(ProductPageConstants.LOGITECH_CHECKBOX);
    	productPage.selectLogitech();
    	productPage.waitElement(ProductPageConstants.CHEAPEST);
    	productPage.selectCheapest();
    	productPage.waitElement(ProductPageConstants.CHEAPEST_ITEM);
    	productPage.clickCheapest();
    	
    }
    
    /*Get Comment and Rating Number of Cheapest Logitech*/
    @Test
    public void getRatingsComments() throws InterruptedException {
    	
    	LogitechPage logitechPage = new LogitechPage(webDriver);
    	logitechPage.switchToNewTab();
    	logitechPage.getCommentNumber();
    	logitechPage.getRatingNumber();	
    	logitechPage.switchToPreviousTab();
    	
    	/*Select A4Tech, re-select logitech, click cheapest, add to basket*/
    	ProductPage productPage = new ProductPage(webDriver);
    	productPage.waitElement(ProductPageConstants.AFOUR_CHECKBOX);
    	productPage.selectAFourTech();
    	productPage.waitElement(ProductPageConstants.LOGITECH_REMOVE_CHECKBOX);
    	productPage.deSelectLogitech();
    	productPage.waitElement(ProductPageConstants.CHEAPEST_ITEM);
    	productPage.clickCheapest();
    	
    	AFourPage afourPage = new AFourPage(webDriver);
    	afourPage.addToBasket();
    	
    }
    
    
}
