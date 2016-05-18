package com.ReggieTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class AccountChecks {

	public AccountChecks() {
		// TODO Auto-generated constructor stub
	}
	
	public static void VerifyAccountTest(){
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.gogoair.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("cta-acct-state")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("loginEmail")).sendKeys("testreggie");
		driver.findElement(By.id("loginPassword")).sendKeys("reggie");
		driver.findElement(By.tagName("Sign in")).click();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.className("trigger-sign-out")).isDisplayed();
		driver.findElement(By.className("trigger-sign-out")).click();
		driver.findElement(By.linkText("Sign-In")).isDisplayed();
		
		
	}

}

