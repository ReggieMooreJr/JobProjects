package com.ReggieTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.awt.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

//// This class will identify all the objects on the home page for Uptake.com
public class TestingSamples {

	 WebDriver driver;
	
	
	//By ApproachLink = By.linkText("http://uptake.com/approach");

	By ApproachLink =By.id("menu-item-4164");
	By PlatformLink =By.xpath("//div[@id='Platform']/a");
	By SolutionsLink = By.id("menu-item-4162");
	By PeopleLink = By.id("menu-item-4162");
	By JoinUsLink = By.id("menu-item-4167");
	By BlogLink = By.id("menu-item-4166");

	

public TestingSamples(WebDriver driver){
this.driver=driver;
}



	
//The below test shows how you can verify a web page title 
//@Test
public void VerifyHomepageTitle(){
		System.out.print("This is test case 1  ");
		System.out.println("Step 1");
		WebDriver driver = new FirefoxDriver(); 
		System.out.println("Step 2");
	    driver.get("http://bossip.com");
	    //boolean URLname=driver.getCurrentUrl().equals("http://uptake.com");
	    //System.out.println(URLname);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    System.out.println("Step 3");
	    String URL="www.bossip.com";
	    Assert.assertEquals(URL, "www.bossip.com", "www.bossip.com");
	    String sTitle= driver.getTitle();
	    String getTitle=sTitle;
	    
	    if (sTitle==getTitle) {	    
	    System.out.println("The First test case worked");
	    }
	    else {
	    System.out.println("The first test worked but the second failed");
	    }
	     
	  	driver.quit();
	    
	}
//@Test

///Test case 2, The test verifies clicking a link on a home page and going to another page
public static void clickPlatformLink(){
	System.out.print("This test case 2   ");
	com.ReggieTest.Platformss.VerifyCheckLink_Platform();
	System.out.print("Verfication of Link Functionality works");
	}

@Test
//Test Case 3 verify Username and password
public static void PasswordTest(){
com.ReggieTest.AccountChecks.VerifyAccountTest();
System.out.print("Verfication of Email Accounts works");

}

}


