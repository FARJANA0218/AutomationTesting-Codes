package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAllertPopupWithWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoqa.com/alerts");
	    driver.findElement(By.id("timerAlertButton")).click();
	    Thread.sleep(8000);
	    Alert abc=driver.switchTo().alert();
	    String text=abc.getText();
	    System.out.println(text);
	    Thread.sleep(5000);
	    abc.accept();
	    

	}

}
