package io.testinium.constant;

import org.openqa.selenium.By;

public class ProductPageConstants {
	
	/*Logitech CheckBox Button*/
	public static final By LOGITECH_CHECKBOX = By.xpath("//DIV[@class='fltr-item-text'][text()='logitech']");
	
	/*Logitech Remove CheckBox Button*/
	public static final By LOGITECH_REMOVE_CHECKBOX = By.xpath("(//SPAN[@class='remove'])[2]");
	
	/*A4 Checkbox Button*/
	public static final By AFOUR_CHECKBOX = By.xpath("//DIV[@class='fltr-item-text'][text()='A4 Tech']");
	
	/*Sort By Price*/
	public static final By CHEAPEST = By.xpath("(//SELECT)[1]");
	
	/*Cheapest Product*/
	public static final By CHEAPEST_ITEM = By.xpath("(//IMG[@class='p-card-img'])[1]");
	
}
