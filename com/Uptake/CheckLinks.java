package com.Uptake;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CheckLinks {
    
	public static void VerifyCheckLink_Appro() {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://uptake.com");
		driver.manage().window().maximize();
		
		//Wait for page to load
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);		
		
		//Get element 
		//WebElement doThis = driver.findElement(By.cssSelector("a.btn.btn-lg.btn-warning")); 
         WebElement doThis= driver.findElement(By.linkText("Approach"));
		//By PlatformLink =By.xpath("//div[@id='Platform']/a");
		//By SolutionsLink = By.id("menu-item-4162");
		//By PeopleLink = By.id("menu-item-4162");
		//By JoinUsLink = By.id("menu-item-4167");
		//By BlogLink = By.id("menu-item-4166");
		
		
		
		//Click Link
		doThis.click();
			
		//Close browser
		driver.quit();
	}
	
 public  void VerifyCheckLink_Platform() {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://uptake.com");
		driver.manage().window().maximize();
		
		//Wait for page to load
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);		
		
		//Get element 
		//WebElement doThis = driver.findElement(By.cssSelector("a.btn.btn-lg.btn-warning")); 
         WebElement doThis= driver.findElement(By.xpath("//div[@id=Platform']/a"));
		//By PlatformLink =By.xpath("//div[@id='Platform']/a");
		//By SolutionsLink = By.id("menu-item-4162");
		//By PeopleLink = By.id("menu-item-4162");
		//By JoinUsLink = By.id("menu-item-4167");
		//By BlogLink = By.id("menu-item-4166");
		
		
		
		//Click Link
		doThis.click();
			
		//Close browser
		driver.quit();
	}

 public static void VerifyCheckLink_Solu() {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://uptake.com");
		driver.manage().window().maximize();
		
		//Wait for page to load
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);		
		
		//Get element 
		//WebElement doThis = driver.findElement(By.cssSelector("a.btn.btn-lg.btn-warning")); 
      WebElement doThis= driver.findElement(By.linkText("Solutions"));
		//By PlatformLink =By.xpath("//div[@id='Platform']/a");
		//By SolutionsLink = By.id("menu-item-4162");
		//By PeopleLink = By.id("menu-item-4162");
		//By JoinUsLink = By.id("menu-item-4167");
		//By BlogLink = By.id("menu-item-4166");
		
		
		
		//Click Link
		doThis.click();
			
		//Close browser
		driver.quit();
	}
	
}

