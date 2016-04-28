package com.Uptake.IE;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;
import com.sun.jna.platform.FileUtils;

//// This class will identify all the objects on the home page for Uptake.com
public class ApproachPage {

	WebDriver driver;
	By SectionTitle =By.className("section-title");
		
public ApproachPage(WebDriver driver){
	this.driver=driver;
}
public void FindSection(){
	driver = new InternetExplorerDriver(); 	
	driver.get("www.uptake.com");
	System.out.println("Sucess 1");
	//((Object) driver).save_screenshot("C:/EclipseProjects/JobProjects/Results/screen.jpg");
	//driver.findElement(SectionTitle).click();
	driver.findElement(SectionTitle);
        
	}

}

