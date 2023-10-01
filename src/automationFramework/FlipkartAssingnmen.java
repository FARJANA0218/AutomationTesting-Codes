package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAssingnmen {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.flipkart.com/");
	    driver.findElement(By.xpath("//a[contains(text(),'Create an account')]/preceding::button[2]")).click();
	    driver.findElement(By.name("q")).sendKeys("Vivo Mobiles");
	    driver.findElement(By.xpath("//a[text()='Login']/preceding::button")).click();
	    driver.findElement(By.xpath("//div[contains(text(),'OPPO A17k (Blue, 64 GB)')]")).click();
	  
	}
}
