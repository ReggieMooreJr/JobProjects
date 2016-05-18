import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class VerifyHomePageTest1 {
	
	
	public  WebDriver driver = new FirefoxDriver();
	
    @Test
    //Test Looks for Links on Home page & validates the links work correctly 
    public void ChecknewLinks() {
		String baseURL="http://www.usajobs.com";
		driver.get(baseURL);
		WebElement alinks;
		alinks=driver.findElement(By.linkText("Jobs"));		 
		System.out.println("We found the links : " + (alinks));
		
		/**
		int k = alinks.size();
		System.out.println("List of links Available: ");
		for(int i=0;i<k;i++)
		{
		if(Rlinks.get(i).getAttribute("href").contains("google"))
		{
		String link =Rlinks.get(i).getAttribute("href");
		System.out.println(link);
		}  
		*/ 
		
		}
}
