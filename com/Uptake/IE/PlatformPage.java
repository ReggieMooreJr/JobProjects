package com.Uptake.IE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//// This class will identify all the objects on the home page for Uptake.com
public class PlatformPage {

	WebDriver driver;
	
	
	By GhostButton =By.className("ghost-btn");
	
	
public PlatformPage(WebDriver driver){
	this.driver=driver;
}
public void FindPlat(){
	
	driver.findElement(GhostButton).equals("Our Solutions");
	
	}

}

