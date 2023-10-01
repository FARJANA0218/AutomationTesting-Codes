package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class StoreAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoblaze.com/prod.html?idp_=1#");
		driver.findElement(By.id("signin2")).click();
		driver.findElement(By.id("sign-username")).sendKeys("farjana");
		driver.findElement(By.id("sign-password")).sendKeys("farjana");
		driver.findElement(By.xpath("//button[contains(text(),'Sign up')]")).click();
		Alert button=driver.switchTo().alert();
		button.accept();
		String Messge=button.getText();
		driver.findElement(By.id("loginusername")).sendKeys("farjana");
		driver.findElement(By.id("loginpassword")).sendKeys("farjana");
		driver.findElement(By.id("//button[contains(text(),'Log in')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Samsung galaxy s6')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
		Alert abc=driver.switchTo().alert();
		abc.accept();
		String PoCpout=abc.getText();
		System.out.println(PoCpout);
		driver.findElement(By.id("//button[contains(text(),'Place Order')]")).click();
		driver.findElement(By.id("name")).sendKeys("gdgsgfd");
		driver.findElement(By.id("country")).sendKeys("gdgsgfd");
		driver.findElement(By.id("city")).sendKeys("gdgsgfd");
		driver.findElement(By.id("card")).sendKeys("765774857");
		driver.findElement(By.id("card")).sendKeys("765774857");
		driver.findElement(By.id("year")).sendKeys("1999");
		driver.findElement(By.xpath("//button[contains(text(),'Purchase')]")).click();

	}

}
