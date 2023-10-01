package testNGFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Swaglab {
//Click operation dummy website
	WebDriver driver;
@Test(priority=1)
public void webPage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.saucedemo.com/");
	    driver.manage().window().maximize();
}
@Test(priority=2)
public void logIn() throws InterruptedException {
	    driver.findElement(By.id("user-name")).sendKeys("standard_user");
	    driver.findElement(By.id("password")).sendKeys("secret_sauce");
	    driver.findElement(By.xpath("//input[@id='login-button']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.id("react-burger-menu-btn")).click();
	    Thread.sleep(5000);
}
@Test(priority=3)
public void logOut() throws InterruptedException {
	    driver.findElement(By.id("logout_sidebar_link")).click();
	    Thread.sleep(5000);
	    
	      
	}

}
