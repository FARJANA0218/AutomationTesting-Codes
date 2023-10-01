package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RediffAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.findElement(By.xpath("//td[contains(text(),'Full Name')]/following::input[1]")).sendKeys("Farjna");
		driver.findElement(By.xpath("//td[contains(text(),'Full Name')]/following::input[2]"))
				.sendKeys("farjana_3");
		driver.findElement(By.xpath("//td[contains(text(),'Full Name')]/following::input[4]")).sendKeys("Welcome@01");
		//td[contains(text(),'Full Name')]/following::input[5]
		driver.findElement(By.xpath("//td[contains(text(),'Full Name')]/following::input[5]")).sendKeys("Welcome@01");
       driver.findElement(By.xpath("//td[contains(text(),'Full Name')]/following::input[6]")).sendKeys("farjana2@gmail.com");
       driver.findElement(By.xpath("//td[contains(text(),'Full Name')]/following::input[13]")).sendKeys("6380998558");
       driver.findElement(By.xpath("//td[contains(text(),'Full Name')]/following::input[13]")).sendKeys("farjana2@gmail.com");
       Select Date = new Select(driver.findElement(By.xpath("//td[contains(text(),'Full Name')]/following::select[2]")));
       Date.selectByVisibleText("02");
       Select Month = new Select(driver.findElement(By.xpath("//td[contains(text(),'Full Name')]/following::select[3]")));
       Month.selectByVisibleText("MAR");
       Select Year = new Select(driver.findElement(By.xpath("//td[contains(text(),'Full Name')]/following::select[4]")));
       Year.selectByVisibleText("1999");
       Select Country = new Select(driver.findElement(By.xpath("//td[contains(text(),'Full Name')]/following::select[5]")));
       Country.selectByVisibleText("Italy");
       Thread.sleep(20000);
       driver.findElement(By.id("Register")).click();
       
       
       
       
       
       
       
	}

}
