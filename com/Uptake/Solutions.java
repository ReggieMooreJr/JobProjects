package com.Uptake;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Solutions{
    


 public static void VerifyCheckLink_Solu() {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://uptake.com");
		driver.manage().window().maximize();
		
		//Wait for page to load
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);		
		
		//Get element 
		//WebElement doThis = driver.findElement(By.cssSelector("a.btn.btn-lg.btn-warning")); 
      WebElement doThis= driver.findElement(By.id("menu-item-4172"));
		//By PlatformLink =By.xpath("//div[@id='Platform']/a");
		//By SolutionsLink = By.id("menu-item-4162");
		//By PeopleLink = By.id("menu-item-4162");
		//By JoinUsLink = By.id("menu-item-4167");
		//By BlogLink = By.id("menu-item-4166");
		
		
		
		//Click Link
		doThis.click();
		
		/////Test to check if the function worked.
		Boolean URLname=driver.getCurrentUrl().equals("http://uptake.com");
		System.out.println(URLname);
		if (URLname==true)
		{
		System.out.println(" Solutions TestCaseFailed");
		}
			
		//Close browser
		driver.quit();
	}
	
}

