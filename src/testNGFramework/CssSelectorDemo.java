package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectorDemo {
	
	WebDriver driver;
	@Test
	public void a_pageload(){
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("signin btn btn-info")).click();
		driver.findElement(By.cssSelector("#signin btn btn-info")).click();
		driver.findElement(By.className("signin btn btn-info")).click();
		driver.findElement(By.xpath("//a[contains(]"));
	

}
}