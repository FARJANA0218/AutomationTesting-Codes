package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swaglab {
//Click operation dummy website
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.saucedemo.com/");
	    driver.findElement(By.id("user-name")).sendKeys("standard_user");
	    driver.findElement(By.id("password")).sendKeys("secret_sauce");
	    driver.findElement(By.xpath("//input[@id='login-button']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.id("react-burger-menu-btn")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.id("logout_sidebar_link")).click();
	    Thread.sleep(5000);
	    
	    
	    
	    
	    
	    
	}

}
