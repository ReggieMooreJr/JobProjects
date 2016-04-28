package target;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.*;
import com.Uptake.Platformss;
import com.Uptake.ApproachPageFF;
import com.Uptake.CheckLinks;
import com.Uptake.HomepageFF;
import com.Uptake.People;
import com.Uptake.Platformss;
import com.Uptake.Solutions;
import com.Uptake.IE.ApproachPage;

import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class VerifyHome {

    
	public WebDriver driver;
	
@BeforeMethod
public void beforeMethod() {
		System.out.println("Test Cases have begun");
}

	//@Test
	//Verify  Uptake Home page. 
		public void VerifyHomePage() {
	    System.out.println("mj");
	    CheckLinks.VerifyCheckLink_Appro();
	    CheckLinks.VerifyCheckLink_Solu();
	    			}
     ///Test 2 Verify Link from Home Page to People Page 
	 @Test	
     public void VerifyPeoplePage() {
		 System.out.println("Start the Test");
		 People.VerifyCheckLink_Appro();
		 System.out.println("People Page is correctly connected.");

	 }
	 //Third Test - Checks connection with Solutions Page.
	@Test
	 public void VerifySolutionsPage(){
		 System.out.println("Start the Test");
		 Solutions.VerifyCheckLink_Solu();
		 System.out.println("Solutions==Passed");
	 }
	//Fourth Test -Checks connection with Solutions Page.
	 //@Test
		 public void VerifyPlatformPage(){
     	 System.out.println("Start the Test");
			 Platformss.VerifyCheckLink_Platform();
			 System.out.println("Platform==Passed");
		 }
	 
	//Fifth Test -Checks connection with Solutions Page.
		// @Test
			 public void VerifyApproachPage(){
				 System.out.println("Start the Test");
				 ApproachPageFF.FindSection();
				 System.out.println("ApproachPage==Passed");
			 }
	 @AfterTest
	 public void PostTestInformation(){
		 		 System.out.println("All Test have been completed");
	 }
	 
}
