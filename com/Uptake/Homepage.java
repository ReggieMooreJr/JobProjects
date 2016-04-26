package com.Uptake;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//// This class will identify all the objects on the home page for Uptake.com
public class Homepage {

	WebDriver driver;
	
	By MainClass = By.className("main");
	By ApproachLink = By.id("menu-item-4164");
	By PlatformLink = By.id("menu-item-4172");
	By SolutionsLink = By.id("menu-item-4162");
	By PeopleLink = By.id("menu-item-4162");
	By JoinUsLink = By.id("menu-item-4167");
	By BlogLink = By.id("menu-item-4166");
	
public Homepage(WebDriver driver){
	this.driver=driver;
}
public void clickApproach(){

	driver.findElement(ApproachLink).click();
	}
public void clickPlatformLink(){
	driver.findElement(PlatformLink).click();
	}
public void clickSolutionsLink(){
	driver.findElement(SolutionsLink).click();
	}
public void clickPeopleLink(){
	driver.findElement(PeopleLink).click();
	}
public void clickJoinUsLink(){
	driver.findElement(JoinUsLink).click();
	}
public void clickBlogLink(){
	driver.findElement(BlogLink).click();
	}
}

