package com.Uptake;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//// This class will identify all the objects on the home page for Uptake.com
public class ApproachPage {

	WebDriver driver;
	
	By MainClass = By.className("main");
	By ApproachLink = By.id("menu-item-4164");
	By PlatformLink = By.id("menu-item-4172");
	By SolutionsLink = By.id("menu-item-4162");
	By PeopleLink = By.id("menu-item-4162");
	By JoinUsLink = By.id("menu-item-4167");
	By BlogLink = By.id("menu-item-4166");
	
	By SectionTitle =By.className("section-title");
	
	
public ApproachPage(WebDriver driver){
	this.driver=driver;
}
public void FindSection(){
		driver.findElement(SectionTitle).getText();
	
	}

}

