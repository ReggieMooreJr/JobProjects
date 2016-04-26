
package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test {
	
	public static void main(String[] args) { 
		System.setProperty("webdriver.ie.InternetExplorerDriver", "C:/Users/Letisha/Desktop/New folder//IEDriverServer.exe");
        WebDriver driver= new InternetExplorerDriver();
		driver.get("http://www.google.com"); 
	}
}

