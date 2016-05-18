package com.ReggieTest;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Platformss {
    


 public static void VerifyCheckLink_Platform() {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.wwf.org");
		String compare1=driver.getTitle();
		driver.manage().window().maximize();
		
		//Wait for page to load
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/ul/li[2]/a")).click();
		String compare=driver.getTitle();
		Assert.assertNotSame(compare1, compare);
		System.out.println(compare);
		System.out.println(compare1);
		driver.quit();
		
	}
}