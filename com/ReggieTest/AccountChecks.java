package com.ReggieTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
@Test
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
		ClickSignIn();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.className("trigger-sign-out")).isDisplayed();
		driver.findElement(By.className("trigger-sign-out")).click();
		
	    
	    
	}

	public static void ClickSignIn(){
		//click sign-in button
		WebDriver driver= new FirefoxDriver();
		WebElement signInbtn;
	    signInbtn=driver.findElement(By.className("btn primary btn-lrg"));
	    signInbtn.click();
	}

	
}

