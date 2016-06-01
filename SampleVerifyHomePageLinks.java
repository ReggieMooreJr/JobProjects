import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class SampleVerifyHomePageLinks {
	
	
	public  WebDriver driver = new FirefoxDriver();
	
    @SuppressWarnings("deprecation")
	@Test
    //Test Looks for Links on Home page & validates the links work correctly 
    public void VerifyHomePageLinks() throws FileNotFoundException, UnsupportedEncodingException {
		String baseURL="http://www.usajobs.com";
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement alinks;
		String TitleFind=driver.getTitle();
		alinks=driver.findElement(By.linkText("Sign In"));		 
		System.out.println("We found the links : " + (alinks));
		String TitleFind2=driver.getTitle();
		Assert.assertEquals(TitleFind2, TitleFind);
		
		///Lets find the links //////////////
		
		java.util.List<WebElement> reflinks = driver.findElements(By.tagName("a"));
		System.out.println(reflinks.size());
 
		for (int i = 1; i==118; i=i+1)
 
		{
 			System.out.println(reflinks.size());
			System.out.println(reflinks.get(i).getText());
			PrintWriter writer = new PrintWriter("C:/Users/Letisha/Desktop/Output/URLlinks.txt", "UTF-8");
			writer.println(reflinks.get(i).getText());
 		}
		driver.close();
		driver.quit();
		}
}
