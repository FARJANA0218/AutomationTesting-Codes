package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabOrderAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.saucedemo.com/");
	    driver.findElement(By.id("user-name")).sendKeys("standard_user");
	    driver.findElement(By.id("password")).sendKeys("secret_sauce");
	    driver.findElement(By.xpath("//input[@id='login-button']")).click();
	    driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	    driver.findElement(By.xpath("//div[text()='Swag Labs']/following::a[1]")).click();
	    driver.findElement(By.id("checkout")).click();
	    driver.findElement(By.id("first-name")).sendKeys("farjana");
	    driver.findElement(By.id("last-name")).sendKeys("B");
	    driver.findElement(By.id("postal-code")).sendKeys("638005");
	    driver.findElement(By.id("continue")).click();
	    driver.findElement(By.id("finish")).click();
	    driver.findElement(By.id("back-to-products")).click();
	    
	    
	    
	    
	    
	    
	}

}
