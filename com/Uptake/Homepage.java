package com.Uptake;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//// This class will identify all the objects on the home page for Uptake.com
public class Homepage {

	static WebDriver driver;
	
	
	//By ApproachLink = By.linkText("http://uptake.com/approach");
	By MainTitle =By.xpath("/html/body/header/div/div[1]/div/ul/li[1]/a");
	By ApproachLink =By.id("menu-primary-nav");
	By ApproachLinkA =By.xpath("/html/body/header/div/div[1]/div/ul/li[1]/a");
	By ApproachLink2 =By.className("menu-item menu-item-type-post_type menu-item-object-page menu-item-4164");
	By PlatformLink = By.xpath("/html/body/header/div/div[1]/div/ul/li[2]/a");
	By SolutionsLink = By.id("menu-item-4162");
	By PeopleLink = By.id("menu-item-4162");
	By JoinUsLink = By.id("menu-item-4167");
	By BlogLink = By.id("menu-item-4166");
	
public Homepage(WebDriver driver){
	this.driver=driver;
}



public void clickApproach(){

	driver.findElement(ApproachLink).getTagName();
	driver.findElement(ApproachLinkA).click();
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

