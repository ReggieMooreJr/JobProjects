package com.Uptake;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;




public class VerifyHome {

	static String driverPath="C:/Users/Letisha/Desktop/IE/";
	public WebDriver driver;
	
@BeforeMethod
public void beforeMethod() {
 // Create a new instance of the Firefox driver
	  //WebDriver driver=new FirefoxDriver();
	  /////Use IE Web driver
	  System.out.println("Launching IE");
	  System.setProperty("webdriver.ie.driver", driverPath + "IEDriverServer.exe" );
	  driver = new InternetExplorerDriver();
	  //driver.manage().window().maximize();
	  driver.get("http://www.uptake.com");
	  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  //driver.close();
	  }
		@Test
		//public void VerifyHomePage() {
		//driver = new InternetExplorerDriver();
		//Homepage Homepage=new Homepage(driver);
		//Homepage.checkkMainPageLinks();
		//Homepage.clickBlogLink();
		//Homepage.clickPeopleLink();
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

		
	public void VerifyApprPage() {
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("http://www.uptake.com");
		
		ApproachPage ApproachPage =new ApproachPage(driver);
		ApproachPage.FindSection();
		driver.close();
				}
	@AfterMethod
	public void afterMethod() {
	driver = new InternetExplorerDriver();
	// Close the driver
	driver.quit();
			}
}


