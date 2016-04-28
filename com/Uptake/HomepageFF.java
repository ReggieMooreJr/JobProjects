package com.Uptake;

import java.awt.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//// This class will identify all the objects on the home page for Uptake.com
public class HomepageFF {

	 WebDriver driver;
	
	
	//By ApproachLink = By.linkText("http://uptake.com/approach");

	By ApproachLink =By.id("menu-item-4164");
	By PlatformLink =By.xpath("//div[@id='Platform']/a");
	By SolutionsLink = By.id("menu-item-4162");
	By PeopleLink = By.id("menu-item-4162");
	By JoinUsLink = By.id("menu-item-4167");
	By BlogLink = By.id("menu-item-4166");

	
	
public HomepageFF(WebDriver driver){
	this.driver=driver;
 
}


	
public void clickApproach(){

		System.out.println("Step 1");
		WebDriver driver = new FirefoxDriver();; 
		System.out.println("Step 2");
	    driver.get("http://uptake.com");
	    //boolean URLname=driver.getCurrentUrl().equals("http://uptake.com");
	    //System.out.println(URLname);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    System.out.println("Step 3");
	    driver.findElement(ApproachLink).click();
	    System.out.println("Step 4");
	   	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   	driver.close();
			   
	    
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

