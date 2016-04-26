package com.Uptake.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.Uptake.Homepage;

public class VerifyHome {
@Test
	public void VerifyHomePage() {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.uptake.com");
		
		Homepage Homepage=new Homepage(driver);
		Homepage.clickApproach();
		Homepage.clickBlogLink();
		Homepage.clickPeopleLink();
		
		driver.quit();
	}

}
