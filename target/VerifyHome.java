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

import com.Uptake.ApproachPage;
import com.Uptake.Homepage;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class VerifyHome {

    static String driverPath="C:/Users/Letisha/Desktop/IE/";
	public WebDriver driver;
	
@BeforeMethod
public void beforeMethod() {
 
	  System.out.println("Launching IE");
	  System.setProperty("webdriver.ie.driver", driverPath + "IEDriverServer.exe" );
	  	  }

		@Test
		public void VerifyHomePage() {
		Homepage Homepage=new Homepage(driver);
	    System.out.println("mj");
	    Homepage.clickApproach();
		//Homepage.clickBlogLink();
		//Homepage.clickPeopleLink();
			
		}
     ///Test 2 
	 @Test	
     public void VerifyApprPage() {
		ApproachPage ApproachPage =new ApproachPage(driver);
		System.out.println("Sucess 1");
		ApproachPage.FindSection();

	 }
	 //Third Test
	 @Test
	 public void VerifyAllLinksHomepage(){
		 System.out.println("Start the Test");
		 Homepage.findAllLinks(driver);
		 System.out.println("All Links have Been Verified on the Home Page");
	 }
	 @AfterTest
	 public void PostTestInformation(){
		 System.out.println("All Test have been completed");
	 }
	 
}
