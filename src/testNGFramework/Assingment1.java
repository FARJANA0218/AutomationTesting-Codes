package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assingment1 {
	WebDriver driver;
@Test
public void a_webDriver(){
		//Register Form assingment
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().window().maximize();
}
@Test
public void b_personalDetails()
{
		driver.findElement(By.id("input-firstname")).sendKeys("farjana");
		driver.findElement(By.name("lastname")).sendKeys("B");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("farjana020399@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("6380998558");
}
@Test
public void c_passWord() {
		driver.findElement(By.id("input-password")).sendKeys("Welcome@01");
		driver.findElement(By.id("input-confirm")).sendKeys("Welcome@01");
}
@Test
public void d_NewsLetter() {
		WebElement Subscribe=driver.findElement(By.xpath("//label[contains(text(),'Subscribe')]/following::input[1]"));
		Subscribe.click();
		WebElement Priavcypolicy=driver.findElement(By.xpath("//label[contains(text(),'Subscribe')]/following::input[3]"));
		Priavcypolicy.click();
		WebElement Con=driver.findElement(By.xpath("//label[contains(text(),'Subscribe')]/following::input[4]"));
		Con.click();
}
		
		
		
		
		
	}


