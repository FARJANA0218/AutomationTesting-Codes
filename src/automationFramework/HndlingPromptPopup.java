package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HndlingPromptPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoqa.com/alerts");
	    Thread.sleep(10000);//by using scroll to see click button
	    driver.findElement(By.id("promtButton")).click();
	    Alert abc=driver.switchTo().alert();
	    String text=abc.getText();
	    System.out.println(text);
	    abc.sendKeys("Farjana");
	    abc.accept();
	    String OutputText=driver.findElement(By.id("promptResult")).getText();
	    System.out.println(OutputText);
	    
	    

	}

}
