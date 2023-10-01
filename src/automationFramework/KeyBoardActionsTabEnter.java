package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActionsTabEnter {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("email")).sendKeys("farjana@gmail.com");
	    //driver.findElement(By.id("pass")).sendKeys("Pa$$word");
	    Actions abc=new Actions(driver);
	    Thread.sleep(5000);
	    abc.sendKeys(Keys.TAB,"pa$$word").build().perform();
	    abc.sendKeys(Keys.ENTER).build().perform();
	    //abc.sendKeys(Keys.RETURN).build().perform();**we can use both(both are working win,mac,apple)
	    
	    
	    
	}

}
