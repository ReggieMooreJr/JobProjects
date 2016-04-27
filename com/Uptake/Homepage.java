package com.Uptake;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//// This class will identify all the objects on the home page for Uptake.com
public class Homepage {

	 WebDriver driver;
	
	
	//By ApproachLink = By.linkText("http://uptake.com/approach");

	By ApproachLink =By.linkText("Approach");
	By PlatformLink =By.xpath("//div[@id='Platform']/a");
	By SolutionsLink = By.id("menu-item-4162");
	By PeopleLink = By.id("menu-item-4162");
	By JoinUsLink = By.id("menu-item-4167");
	By BlogLink = By.id("menu-item-4166");
	
public Homepage(WebDriver driver){
	this.driver=driver;
 
}

public void checkkMainPageLinks(){
	String baseURL="www.uptake.com";
	driver.get(baseURL);
	java.util.List<WebElement> Rlinks = driver.findElements(By.tagName("a")); 
	System.out.println("Total no of links Available: ");
	int k = Rlinks.size();
	System.out.println("List of links Available: ");
	for(int i=0;i<k;i++)
	{
	if(Rlinks.get(i).getAttribute("href").contains("google"))
	{
	String link =Rlinks.get(i).getAttribute("href");
	System.out.println(link);
	}   
	}
}


public void clickApproach(){
	   
		driver = new InternetExplorerDriver(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Step 1");
	    driver.get("www.uptake.com");
	    driver.findElement(ApproachLink).clear();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String title =driver.getTitle();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(title);
		System.out.println("Page open sucessfull");

		//WebDriverWait = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Approach")));
		String url=driver.getCurrentUrl();
		
		System.out.println(url);
		String linktext = driver.findElement(ApproachLink).getText();
	    System.out.println(linktext);
	    driver.findElement(ApproachLink).clear();
	   
	    
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

