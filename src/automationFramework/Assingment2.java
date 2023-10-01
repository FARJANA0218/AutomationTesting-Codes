package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assingment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.guru99.com/test/newtours/register.php");
	    driver.findElement(By.name("firstName")).sendKeys("AjithKumar");
	    driver.findElement(By.name("lastName")).sendKeys("Farjana");
	    driver.findElement(By.name("phone")).sendKeys("7010019779");
	    driver.findElement(By.id("userName")).sendKeys("ajithfana@love.com");
	    driver.findElement(By.name("address1")).sendKeys("ajithfarjana's House");
	    driver.findElement(By.name("city")).sendKeys("india");
	    driver.findElement(By.name("state")).sendKeys("Tamilnadu");
	    driver.findElement(By.name("postalCode")).sendKeys("143");
	    Select Country= new Select(driver.findElement(By.name("country")));
	    Country.selectByVisibleText("ALGERIA");
	    driver.findElement(By.id("email")).sendKeys("ajithfana@love.com");
	    driver.findElement(By.name("password")).sendKeys("ajithfana@love.com");
	    driver.findElement(By.name("confirmPassword")).sendKeys("ajithfana@love.com");
	    WebElement Sub=driver.findElement(By.name("submit"));
	    Sub.click();
	    //Select objSelect =new Select(driver.findElement(By.id("search-box")));
	    //objSelect.selectByVisibleText("Automation");
	    
	    

	    
	    

	    
	    

	}

}
