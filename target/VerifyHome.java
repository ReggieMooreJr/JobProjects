package target;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
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
 // Create a new instance of the Firefox driver
	  //WebDriver driver=new FirefoxDriver();
	  /////Use IE Web driver
	  System.out.println("Launching IE");
	  System.setProperty("webdriver.ie.driver", driverPath + "IEDriverServer.exe" );
	  //driver = new InternetExplorerDriver();
	  //driver.manage().window().maximize();
	  //driver.get("http://www.uptake.com");
	  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  //driver.close();
	  }
		@Test
		public void VerifyHomePage() {
		Homepage Homepage=new Homepage(driver);
	    System.out.println("mj");
		Homepage.clickApproach();
		//Homepage.clickBlogLink();
		//Homepage.clickPeopleLink();
			
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


