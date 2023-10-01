package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assingment2 {

	WebDriver driver;
	@Test
	public void a_webdriver(){
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	     driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.guru99.com/test/newtours/register.php");
	}
	@Test
	public void b_ContactInformation(){
	    driver.findElement(By.name("firstName")).sendKeys("AjithKumar");
	    driver.findElement(By.name("lastName")).sendKeys("Farjana");
	    driver.findElement(By.name("phone")).sendKeys("7010019779");
	    driver.findElement(By.id("userName")).sendKeys("ajithfana@love.com");
}
	@Test
	public void c_Country() {
	    driver.findElement(By.name("address1")).sendKeys("ajithfarjana's House");
	    driver.findElement(By.name("city")).sendKeys("india");
	    driver.findElement(By.name("state")).sendKeys("Tamilnadu");
	    driver.findElement(By.name("postalCode")).sendKeys("143");
	    WebElement Country= driver.findElement(By.xpath("//option[@value='INDIA']"));
	    Country.click();
}
	@Test
	public void d_userIformation() {
	    driver.findElement(By.id("email")).sendKeys("ajithfana@love.com");
	    driver.findElement(By.name("password")).sendKeys("ajithfana@love.com");
	    driver.findElement(By.name("confirmPassword")).sendKeys("ajithfana@love.com");
	    WebElement Sub=driver.findElement(By.name("submit"));
	    Sub.click();
	    }

}
