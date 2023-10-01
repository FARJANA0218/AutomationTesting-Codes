package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsAssingmentPop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.automationtesting.in/Alerts.html");
	    Thread.sleep(10000);
	    driver.findElement(By.id("OKTab")).click();//we can't inspect the prompt button so we can use this method
	    Alert abc=driver.switchTo().alert();
	    Thread.sleep(5000);
	    abc.accept();
	    
	    
	    
	    
	}

}
