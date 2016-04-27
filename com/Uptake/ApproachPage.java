package com.Uptake;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//// This class will identify all the objects on the home page for Uptake.com
public class ApproachPage {

	WebDriver driver;
	
	
	By SectionTitle =By.className("section-title");
	
	
public ApproachPage(WebDriver driver){
	this.driver=driver;
}
public void FindSection(){
		driver.findElement(SectionTitle).getText();
	
	}

}

