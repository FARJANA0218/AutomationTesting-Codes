package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandilingAlertpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoqa.com/alerts");
	    driver.findElement(By.id("alertButton")).click();
	    Alert abc=driver.switchTo().alert();
	    String popuptext=abc.getText();
	    System.out.println(popuptext);
	    Thread.sleep(5000);
	    abc.accept();
	    driver.findElement(By.id("timerAlertButton")).click();
	    Alert bbb=driver.switchTo().alert();
	    String text=bbb.getText();
	    System.out.println(text);
	    Thread.sleep(8000);
	    bbb.accept();

	}

}
