package com.ui.firstcry.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FCHomePage {

	@FindBy(css="div[class='menu-container'] ul li[class='B14_42 allcat'] a")
	private WebElement allCategories; 
	
	@FindBy(xpath="//*[contains(text(),'STORES & PLAYSCHOOLS']")
	private WebElement storesAndSchools;
	
	@FindBy(xpath="//*[contains(text(),'Playschools']")
	private WebElement playSchools;
	
	@FindBy(css="map[name='indiaschoolmap'] area[alt='Bengaluru']")
	private WebElement pinBengaluru;
	
	
	
	
}
