import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckingAllLinks {
	
	String driverPath="C:/Users/Letisha/Desktop/IE/";
	public  WebDriver driver;
	
    @Test
    public void ChecknewLinks() {
		String baseURL="www.uptake.com";
		driver.get(baseURL);
		java.util.List<WebElement> Rlinks = driver.findElements(By.tagName("a")); 
		System.out.println("Total no links Available: ");
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
}
