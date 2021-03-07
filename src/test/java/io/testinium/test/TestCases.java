package io.testinium.test;

import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import io.testinium.constant.HomePageConstants;
import io.testinium.constant.ProductPageConstants;
import io.testinium.constant.SearchPageConstants;
import io.testinium.pages.AFourPage;
import io.testinium.pages.HomePage;
import io.testinium.pages.LogitechPage;
import io.testinium.pages.ProductPage;
import io.testinium.pages.SearchPage;
import io.testinium.test.base.BaseTest;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestCases extends BaseTest{
	
	/*Select Male Photo*/
    @Test
    public void a_selectMale(){
    	HomePage homePage = new HomePage(webDriver);
    	homePage.waitElement(HomePageConstants.MALE_IMAGE);
    	homePage.selectMale();
    }
    
    /*Search WebCam*/
    @Test
    public void b_searchWebCam() {
    	SearchPage searchPage = new SearchPage(webDriver);
    	searchPage.waitElement(SearchPageConstants.SEARCH_BOX);
    	searchPage.searchWebCam();
    }
    
    /*Select Cheapest Logitech*/
    @Test
    public void c_selectCheapestLogitech(){
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
    public void d_getRatingsComments() throws InterruptedException {
    	
    	LogitechPage logitechPage = new LogitechPage(webDriver);
    	logitechPage.switchToNewTab();
    	logitechPage.getCommentNumber();
    	logitechPage.getRatingNumber();	
    	logitechPage.switchToPreviousTab();
    	
    }
    
    /*Get Comment and Rating Number of Cheapest Logitech*/
    @Test
    public void e_selectCheapestAFourTech() {
    	
    	ProductPage productPage = new ProductPage(webDriver);
    	productPage.waitElement(ProductPageConstants.AFOUR_CHECKBOX);
    	productPage.selectAFourTech();
    	productPage.waitElement(ProductPageConstants.LOGITECH_REMOVE_CHECKBOX);
    	productPage.deSelectLogitech();
    	productPage.waitElement(ProductPageConstants.CHEAPEST_ITEM);
    	productPage.clickCheapest();
    }
    
    /*Add to Cart*/
    @Test
    public void f_AFourTechaddToBasket() {
    	AFourPage afourPage = new AFourPage(webDriver);
    	afourPage.addToBasket();
    }
    
    
}
