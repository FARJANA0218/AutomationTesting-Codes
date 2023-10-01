package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment1 {

	public static void main(String[] args) {
		//Register Form assingment
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.findElement(By.id("input-firstname")).sendKeys("farjana");
		driver.findElement(By.name("lastname")).sendKeys("B");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("farjana020399@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("6380998558");
		driver.findElement(By.id("input-password")).sendKeys("Welcome@01");
		driver.findElement(By.id("input-confirm")).sendKeys("Welcome@01");
		WebElement Subscribe=driver.findElement(By.xpath("//label[contains(text(),'Subscribe')]/following::input[1]"));
		Subscribe.click();
		WebElement Priavcypolicy=driver.findElement(By.xpath("//label[contains(text(),'Subscribe')]/following::input[3]"));
		Priavcypolicy.click();
		driver.findElement(By.xpath("//label[contains(text(),'Subscribe')]/following::input[4]")).click();
		
		
		
		
		
		
		
	}

}
