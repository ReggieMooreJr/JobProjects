
package com.ReggieTest;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ApproachPageFF {
    
	public static void FindSection() {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://uptake.com");
		driver.manage().window().maximize();
		
		//Wait for page to load
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);		
		
		//Get element 
		//WebElement doThis = driver.findElement(By.cssSelector("a.btn.btn-lg.btn-warning")); 
         WebElement doThis= driver.findElement(By.linkText("Approach"));
         //By SectionTitle=By.className("icon icon--logo");
     	 //driver.findElement(SectionTitle).click();
		
		
		
		//Click Link
		doThis.click();
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

