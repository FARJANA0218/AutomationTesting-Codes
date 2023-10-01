package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CloseQuitDemo {
	WebDriver driver;
	@Test
	public void a_wedDriver(){
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	     driver=new ChromeDriver();
	    driver.get("https://www.naukri.com/");
	    driver.manage().window().maximize();
	}
	@Test
	public void b_Services()
	{
	    driver.findElement(By.xpath("//div[contains(text(),'Services')]")).click();
	    //driver.close();this meathod is used to close selinium focus tab
	    //driver.quit();this method is used close cuurent opening tabs
	    
	}

}
